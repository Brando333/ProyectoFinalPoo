package interfaz;

import app.App;
import domain.Cliente;
import domain.Usuario;
import domain.Vendedor;
import java.util.Scanner;

public class MenuRegistro {

  static Cliente nuevoCliente; //despues de haberse registrado almacenará este cliente a un arreglo de {clientesRegistrados} 
  static Vendedor nuevoVendedor;//despues de haberse registrado almacenará este vendeor a un arreglo de {vendedoresRegistrados} 

  /**
   * Los metodos de esta clase deben ser de ambito package
   */
  //Las clases de Utileria no deberian poder instanciarse
  private MenuRegistro() {
  }

  static void menuRegistrarse() {
    int opcion = -1;
    System.out.println("::Menu");
    System.out.println("::Registro");
    System.out.println("[1] Registrarse como vendedor");
    System.out.println("[2] Registrarse como cliente");
    System.out.println("[0] Retornar");
    opcion = new Scanner(System.in).nextInt();

    switch (opcion) {
      case 1:
        //Registrarse como vendedorr
        registrarseComoVendedor();
        break;

      case 2:
        //Registrarse como cliente
        registrarseComoCliente();

        break;

      case 0:
        MenuPrincipal.menuPrincipal();
        break;

      default:
        System.out.println("Ingrese una opcion valida");

    }
  }

  private static void registrarseComoVendedor() {
    System.out.println("::Menu");
    System.out.println("::Registrarse como vendedor");
    int opcion = -1;

    System.out.println("[1] Registrar");
    System.out.println("[0] Retornar");
    opcion = new Scanner(System.in).nextInt();
    switch (opcion) {
      case 1:
      try {

        nuevoVendedor = ( Vendedor )registroUsuario(); //Cast de Usuario a Vendedor

      } catch (NullPointerException e) { //Si el metodo{registroUsuario} retorna null es por que el usuario quiso retornar al menu principal
        MenuPrincipal.menuPrincipal();
//      registrarseComoVendedor(); //Si el metodo{registroUsuario} retorna null es por que el usuario quiso retornar a este metodo
      }
      //Añadimos nuevoVendedor a un Arreglo de {VendedoresRegistrados}
      App.vendedoresRegistrados.add(nuevoVendedor);
      System.out.println("Su registro ha sido guardado con exito");
      break;

      case 0:
        MenuPrincipal.menuPrincipal();
        break;

      default:
        System.out.println("Ingrese una opcion valida");

    }

  }

  private static void registrarseComoCliente() {
    System.out.println("::Menu");
    System.out.println("::Registrarse como Cliente");
    int opcion = -1;

    System.out.println("[1] Registrar");
    System.out.println("[0] Retornar");
    opcion = new Scanner(System.in).nextInt();
    switch (opcion) {
      case 1:
      try {

        nuevoCliente = ( Cliente )registroUsuario(); //Cast de Usuario a Vendedor

      } catch (NullPointerException e) { //Si el metodo{registroUsuario} retorna null es por que el usuario quiso retornar al menu principal
        MenuPrincipal.menuPrincipal();
//      registrarseComoVendedor(); //Si el metodo{registroUsuario} retorna null es por que el usuario quiso retornar a este metodo
      }
      //Añadimos nuevoVendedor a un Arreglo de {VendedoresRegistrados}
      App.clientesRegistrados.add(nuevoCliente);
      System.out.println("Su registro ha sido guardado con exito");
      break;

      case 0:
        MenuPrincipal.menuPrincipal();
        break;

      default:
        System.out.println("Ingrese una opcion valida");

    }

  }

  private static Usuario registroUsuario() {

    System.out.println("::Menu");
    System.out.println("::Registrarse como vendedor");
    System.out.println("::Registrar");

    String nombreComleto;
    String dni;
    String usuario;
    String contraseña;

    try (Scanner input = new Scanner(System.in)) { //{Try-with-resources}, para cerrar el objeto Scanner automaticamente
      System.out.print("\nIngrese su nombre completo: ");
      nombreComleto = input.nextLine();
      System.out.print("\nIngrese su dni: ");
      dni = input.next();
      System.out.print("\nIngrese su nombre de usuario: ");
      usuario = input.nextLine();
      System.out.print("\nIngrese su contraseña: ");
      contraseña = input.nextLine();
    }

    int opcion;
    System.out.println("\n[1] Continuar");
    System.out.println("\n[0] Retornar");
    opcion = new Scanner(System.in).nextInt();
    if (opcion == 1) {
      return new Usuario(usuario, dni, usuario, contraseña);
    } else {
      return null;
    }
  }

}
