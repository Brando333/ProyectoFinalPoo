package interfaz;

import app.App;
import domain.cliente.Cliente;
import domain.cliente.Usuario;
import domain.cliente.Vendedor;
import exceptions.DNIFormatException;
import exceptions.FormatException;
import exceptions.NombreFormatException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import utileria.Utileria;

public class MenuRegistro {

  static Cliente nuevoCliente; //despues de haberse registrado almacenará este cliente a un arreglo de {clientesRegistrados} 
  static Vendedor nuevoVendedor;//despues de haberse registrado almacenará este vendeor a un arreglo de {vendedoresRegistrados} 

  //Las clases de Utileria no deberian poder instanciarse
  private MenuRegistro() {
  }

  static void menuRegistrarse() {
    int opcion;
    System.out.println("\n::Menu Principal");
    System.out.println("::Registro");
    System.out.println("[1] Registrarse como vendedor");
    System.out.println("[2] Registrarse como cliente");
    System.out.println("[0] Retornar");
    opcion = new Scanner(System.in).nextInt();
    exitDo:
    do {
      switch (opcion) {
        case 1:
          try {
          registrarseComoVendedor();
        } catch (Exception e) {
          //Si se lanza una excepcion de fomato en el metodo {RegistrarComoVendedor()}, se vuelve a menu superior
          menuRegistrarse();
        }
        break exitDo;

        case 2: {

          try {
            registrarseComoCliente();
          } catch (FormatException ex) {
            menuRegistrarse();
          }

        }
        break exitDo;

        case 0:
          MenuPrincipal.menuPrincipal();
          break exitDo;

        default:
          System.out.println("Ingrese una opcion valida");

      }
    } while (true);
  }

  private static void registrarseComoVendedor() throws FormatException { //FormatException es superclase de NOmbreFormateXCEPTION Y DNIFormatException
    System.out.println("::Menu");
    System.out.println("::Registro");
    System.out.println("::Registrarse como vendedor");
    int opcion;

    System.out.println("[1] Continuar");
    System.out.println("[0] Cancelar");
    opcion = new Scanner(System.in).nextInt();
    exitDo:
    do {
      switch (opcion) {
        case 1:
          Scanner input = new Scanner(System.in);

          String nombreComleto;
          String dni;
          String usuario;
          String contraseña;

          //Ingresamos nombre
          System.out.print("\nIngrese su nombre completo: ");
          nombreComleto = input.nextLine();

          //si el nombre no tiene un formato de nombre[a-zA-Z], entonces se lanza excepcion
          if (!nombreComleto.matches("[a-zA-Z ]+")) {
            throw new NombreFormatException("El nombre debe tener solo letras");
          }

          //Ingresamos DNI
          System.out.print("Ingrese su dni: ");
          dni = input.nextLine();

          //Se lanza la excepcion con un mensaje de acuerdo al contexto
          /*Cuando el DNI contiene letras o caracteres especiales*/
          if (dni.matches("\\d*\\D+\\d*")) {
            throw new DNIFormatException("Error, el DNI contiene letras o caracteres especiales");
          }
          /*Cuando el DNI no tiene 8 digitos*/
          if (dni.length() != 8) {
            throw new DNIFormatException("Error, el DNI debe contener 8 digitos");
          }

          //Ingresamos usuario
          System.out.print("Ingrese su nombre de usuario: ");
          usuario = input.nextLine();

          //Ingresamos contraseña
          System.out.print("Ingrese su contraseña: ");
          contraseña = input.nextLine();

          //Le damos un formato al nombre con la primera letra Mayuscula y las demas minusculas
          nombreComleto = Utileria.formatoNombre(nombreComleto);

          nuevoVendedor = new Vendedor(nombreComleto, dni, usuario, contraseña);

          //Añadimos nuevoVendedor a un Arreglo de {VendedoresRegistrados}
          App.vendedoresRegistrados.add(nuevoVendedor);
          System.out.println("Su registro ha sido guardado con exito");
          break exitDo;

        case 0:
          MenuPrincipal.menuPrincipal();
          break exitDo;

        default:
          System.out.println("Ingrese una opcion valida");

      }
    } while (true);

  }

  private static void registrarseComoCliente() throws FormatException {
    System.out.println("::Menu");
    System.out.println("::Registro");
    System.out.println("::Registrarse como cliente");
    int opcion;

    System.out.println("[1] Continuar");
    System.out.println("[0] Cancelar");
    opcion = new Scanner(System.in).nextInt();
    exitDo:
    do {
      switch (opcion) {
        case 1:

          Scanner input = new Scanner(System.in);

          String nombreComleto;
          String dni;
          String usuario;
          String contraseña;

          //Ingresamos nombre
          System.out.print("\nIngrese su nombre completo: ");
          nombreComleto = input.nextLine();

          //si el nombre no tiene un formato de nombre[a-zA-Z], entonces se lanza excepcion
          if (!nombreComleto.matches("[a-zA-Z ]+")) {
            throw new NombreFormatException("El nombre debe tener solo letras");
          }

          //Ingresamos DNI
          System.out.print("Ingrese su dni: ");
          dni = input.nextLine();

          //Se lanza la excepcion con un mensaje de acuerdo al contexto
          /*Cuando el DNI contiene letras o caracteres especiales*/
          if (dni.matches("\\d*\\D+\\d*")) {
            throw new DNIFormatException("Error, el DNI contiene letras o caracteres especiales");
          }
          /*Cuando el DNI no tiene 8 digit os*/
          if (dni.length() != 8) {
            throw new DNIFormatException("Error, el DNI debe contener 8 digitos");
          }

          //Ingresamos usuario
          System.out.print("Ingrese su nombre de usuario: ");
          usuario = input.nextLine();

          //Ingresamos contraseña
          System.out.print("Ingrese su contraseña: ");
          contraseña = input.nextLine();

          //Le damos un formato al nombre con la primera letra Mayuscula y las demas minusculas
          nombreComleto = Utileria.formatoNombre(nombreComleto);

          nuevoCliente = new Cliente(usuario, dni, usuario, contraseña);

          //Añadismos al nuevoCliente al arreglo de clientes registrados
          App.clientesRegistrados.add(nuevoCliente);

          System.out.println("Su registro ha sido guardado con exito");
          break exitDo;

        case 0:
          MenuPrincipal.menuPrincipal();
          break exitDo;

        default:
          System.out.println("Ingrese una opcion valida");

      }
    } while (true);

  }

}
