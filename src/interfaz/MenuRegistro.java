package interfaz;

import app.App;
import domain.Cliente;
import domain.Usuario;
import domain.Vendedor;
import java.util.Scanner;

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
                    registrarseComoVendedor();
                    break exitDo;

                case 2:
                    registrarseComoCliente();
                    break exitDo;

                case 0:
                    MenuPrincipal.menuPrincipal();
                    break exitDo;

                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (true);
    }

    private static void registrarseComoVendedor() {
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

                    System.out.print("\nIngrese su nombre completo: ");
                    nombreComleto = input.nextLine();
                    System.out.print("Ingrese su dni: ");
                    dni = input.nextLine();
                    System.out.print("Ingrese su nombre de usuario: ");
                    usuario = input.nextLine();
                    System.out.print("Ingrese su contraseña: ");
                    contraseña = input.nextLine();

                    nuevoVendedor = new Vendedor(usuario, dni, usuario, contraseña);
//          nuevoVendedor = (( Vendedor )registroUsuario()); //DownCast de Usuario a Vendedor
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

    private static void registrarseComoCliente() {
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

                    System.out.print("\nIngrese su nombre completo: ");
                    nombreComleto = input.nextLine();
                    System.out.print("Ingrese su dni: ");
                    dni = input.nextLine();
                    System.out.print("Ingrese su nombre de usuario: ");
                    usuario = input.nextLine();
                    System.out.print("Ingrese su contraseña: ");
                    contraseña = input.nextLine();

                    nuevoCliente = new Cliente(usuario, dni, usuario, contraseña);
//          nuevoCliente = (( Cliente )registroUsuario()); //DownCast de Usuario a Cliente
//          Añadimos nuevoVendedor a un Arreglo de {VendedoresRegistrados}
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

    private static Usuario registroUsuario() {

        Scanner input = new Scanner(System.in);

        String nombreComleto;
        String dni;
        String usuario;
        String contraseña;

        System.out.print("\nIngrese su nombre completo: ");
        nombreComleto = input.nextLine();
        System.out.print("Ingrese su dni: ");
        dni = input.nextLine();
        System.out.print("Ingrese su nombre de usuario: ");
        usuario = input.nextLine();
        System.out.print("Ingrese su contraseña: ");
        contraseña = input.nextLine();

        return new Usuario(usuario, dni, usuario, contraseña);
    }

}
