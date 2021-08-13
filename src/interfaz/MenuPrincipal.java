package interfaz;

import app.App;
import domain.cliente.Cliente;
import domain.cliente.Vendedor;
import java.util.Scanner;

public class MenuPrincipal {

  //Las clases de Utileria no deberian poder instanciarse
  private MenuPrincipal() {
  }

  public static void menuPrincipal() {
    int opcion;
    do {
      System.out.println("\n::Menu Principal");
      System.out.println("[1] ENTRAR COMO VENDEDOR");
      System.out.println("[2] ENTRAR COMO CLIENTE");
      System.out.println("[3] REGISTRARSE");
      System.out.println("[0] SALIR");
      opcion = new Scanner(System.in).nextInt();
      switch (opcion) {
        case 1: {
          entrarComoVendedorMenu();
          break;
        }
        case 2: {
          entrarComoClienteMenu();
          break;
        }
        case 3: {
          MenuRegistro.menuRegistrarse();
          break;
        }
        case 0: {
          System.exit(0);
        }
        default:
          System.out.println("Ingrese una opcion valida");
      }

    } while (true);

  }

  private static void entrarComoVendedorMenu() {
    //Entrar como vendedor
    String usuarioVendedor;
    String contraseniaVendedor;

    //pedimos usuario y contraseña
    System.out.print("Usuario: ");
    usuarioVendedor = new Scanner(System.in).nextLine();
    System.out.print("Contraseña: ");
    contraseniaVendedor = new Scanner(System.in).nextLine();

    boolean usuarioExistente = false;
    //Verificamos que el vendedor esté registrado
    for (Vendedor vendedor : App.vendedoresRegistrados) {
      if (vendedor.getUsuario().equals(usuarioVendedor) && vendedor.getContrasenia().equals(contraseniaVendedor)) {
        usuarioExistente = true;
        break;
      }
    }

    if (usuarioExistente) {
      MenuVendedor.menuVendedor();
    } else {
      int opcion2;
      exitDo:
      do {
        System.out.println("Su contraseña o usuario está mal escrito, porfavor vuelva a intentarlo");
        System.out.println("[1] Aceptar");
        System.out.println("[0] Cancelar");
        opcion2 = new Scanner(System.in).nextInt();
        switch (opcion2) {
          case 1:
            entrarComoVendedorMenu();
            break exitDo;
          case 0:
            menuPrincipal();
            break exitDo;
          default:
            System.out.println("Ingrese opcion correcta");
            break exitDo;
        }
      } while (true);
    }
  }

  private static void entrarComoClienteMenu() {

    String usuarioCliente;
    String contraseniaCliente;

    //pedimos usuario y contraseña
    System.out.print("Usuario: ");
    usuarioCliente = new Scanner(System.in).nextLine();
    System.out.print("Contraseña: ");
    contraseniaCliente = new Scanner(System.in).nextLine();

    boolean usuarioExistente = false;
    //Verificamos que el cliente esté registrado
    for (Cliente cliente : App.clientesRegistrados) {
      if (cliente.getUsuario().equals(usuarioCliente) && cliente.getContrasenia().equals(contraseniaCliente)) {
        usuarioExistente = true;
        break;
      }
    }

    if (usuarioExistente) {
      MenuCliente.menuCliente();
    } else {
      int opcion2;
      exitDo:
      do {
        System.out.println("Su contraseña o usuario está mal escrito, porfavor vuelva a intentarlo");
        System.out.println("[1] Aceptar");
        System.out.println("[0] Cancelar");
        opcion2 = new Scanner(System.in).nextInt();
        switch (opcion2) {
          case 1:
            entrarComoClienteMenu();
            break exitDo;
          case 0:
            menuPrincipal();
            break exitDo;
          default:
            System.out.println("Ingrese opcion correcta");
        }
      } while (true);
    }
  }

}
