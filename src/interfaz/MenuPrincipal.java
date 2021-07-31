package interfaz;

import app.App;
import domain.Cliente;
import domain.Vendedor;
import java.util.Scanner;

public class MenuPrincipal {

  //Las clases de Utileria no deberian poder instanciarse
  private MenuPrincipal() {
  }

  public static void menuPrincipal() {
    int opcion = -1;

    do {
      System.out.println("[1] ENTRAR COMO VENDEDOR");
      System.out.println("[2] ENTRAR COMO CLIENTE");
      System.out.println("[3] REGISTRARSE");
      System.out.println("[0] SALIR");
      opcion = new Scanner(System.in).nextInt();
      switch (opcion) {
        case 1:
          //Entrar como vendedor
          break;

        case 2:

          //Entrar como cliente
          break;

        case 3:
          System.out.println("::Menu");
          System.out.println("::REGISTRARSE");
          MenuRegistro.menuRegistrarse();
          break;
        case 0:
          System.out.println("Adios...");
          break;
        default:
          System.out.println("Ingrese una opcion correcta");
      }

    } while (opcion != 0);

  }

  private static void entrarComoVendedorMenu() {
    //Entrar como vendedor
    int opcion;
    System.out.println("::Menu");
    System.out.println("::ENTRAR COMO VENDEDOR");
    System.out.println("[1] Continuar");
    System.out.println("[0] Retornar");
    opcion = new Scanner(System.in).nextInt();
    switch (opcion) {
      case 0:

        menuPrincipal();
        break;

      case 1:

        String usuario;
        String contraseña;
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese usuario: ");
        usuario = input.nextLine();
        System.out.print("Ingrese contraseña: ");
        contraseña = input.nextLine();

        boolean registrado = false;
        //comprobar que el usuario y la contraseña pertenezcan a un vendedor registrado
        for (Vendedor vendedor : App.vendedoresRegistrados) {
          if (vendedor.getUsuario().equals(usuario) && vendedor.getContraseña().equals(contraseña)) {
            registrado = true;
            break;
          }
        }
        if (registrado) { //si esta registrado le damos pase al menu Vendedor

        } else { //
          System.out.println("Usuario o contraseña incorrecta");
          entrarComoVendedorMenu();
        }
        break;

      default:

        System.out.println("Ingrese una opcion valida");
        break;

    }

  }

  private static void entrarComoClienteMenu() {

    int opcion;
    System.out.println("::Menu");
    System.out.println("::ENTRAR COMO CLIENTE");
    System.out.println("[1] Continuar");
    System.out.println("[0] Retornar");
    opcion = new Scanner(System.in).nextInt();
    switch (opcion) {
      case 0:

        menuPrincipal();
        break;

      case 1:

        String usuarioCliente;
        String contraseñaCliente;
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese usuario: ");
        usuarioCliente = input.nextLine();
        System.out.print("Ingrese contraseña: ");
        contraseñaCliente = input.nextLine();

        boolean registrado = false;
        //comprobar que el usuario y la contraseña pertenezcan a un cliente registrado
        for (Cliente cliente : App.clientesRegistrados) {
          if (cliente.getUsuario().equals(usuarioCliente) && cliente.getContraseña().equals(contraseñaCliente)) {
            registrado = true;
            break;
          }
        }
        if (registrado) { //si esta registrado le damos pase al menu Cliente

        } else { //
          System.out.println("Usuario o contraseña incorrecta");
          entrarComoClienteMenu();
        }
        break;

      default:

        System.out.println("Ingrese una opcion valida");
        break;

    }
  }

  private static void registrarse() {
    System.out.println("[1] Registrarse como vendedor");
    System.out.println("[2] Registrarse como cliente");
  }

}
