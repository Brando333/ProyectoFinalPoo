package interfaz;

import app.App;
import domain.Producto;
import java.util.Scanner;

public class MenuVendedor {

    //Las clases de Utileria no deberian poder instanciarse
    private MenuVendedor() {
    }

    public static void menuVendedor() {

        int opcion;
        exitDo:
        do {
            System.out.println("\n::Menu principal");
            System.out.println("::Menu vendedor");
            System.out.println("[1] MOSTRAR VENTAS");
            System.out.println("[2] MOSTRAR INVENTARIO");
            System.out.println("[3] MOSTRAR CLIENTES");
            System.out.println("[0] RETORNAR");
            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1:

                    break exitDo;

                case 2:

                    for (Producto producto : App.inventario) {
                        System.out.println(producto);
                    }
                    break exitDo;

                case 3:

                    break exitDo;

                case 0:
                    MenuPrincipal.menuPrincipal();
                    break exitDo;

                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (true);
    }

    private static void mostrarVentas() {
        //mostrar ventas

        System.out.println("[0] Retornar");
    }

    private static void mostrarInventario() {
        //mostrar inventario -> nombre y precio
        System.out.println("[0] Retornar");
    }

    private static void mostrarClientes() {
        // Mostrar registro de clientes -> Datos, inversion

    }

}
