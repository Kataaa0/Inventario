
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean ejecutarMenu = true;

        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();

        do {
            try {
                System.out.println("Ingrese el tipo de producto que desea (1: Alimento, 2: Electrodoméstico, 3: Tecnología): ");
                int tipoProducto = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese el nombre del producto: ");
                String nombreProducto = sc.nextLine();

                System.out.println("Ingrese la cantidad del producto: ");
                int cantidadProdu    cto = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese el codigo del producto: ");
                int codigoProducto = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Ingrese el precio  del producto: ");
                int precioProducto = sc.nextInt();
                sc.nextLine();


                switch (tipoProducto) {
                    case 1:
                        Alimento alimento = new Alimento();
                        alimento.setNombre(nombreProducto);
                        alimento.setCantidad(cantidadProducto);
                        inventario.agregarProducto(alimento);
                        break;

                    case 2:
                        Electrodomestico electrodomestico = new Electrodomestico();
                        electrodomestico.setNombre(nombreProducto);
                        electrodomestico.setCantidad(cantidadProducto);
                        inventario.agregarProducto(electrodomestico);
                        break;

                    case 3:
                        Tecnologia tecnologia = new Tecnologia();
                        tecnologia.setNombre(nombreProducto);
                        tecnologia.setCantidad(cantidadProducto);
                        inventario.agregarProducto(tecnologia);
                        break;

                    default:
                        System.out.println("Opción no válida");
                        break;
                }

                System.out.println("¿Desea ingresar otro producto? (1 para sí, 0 para no): ");
                ejecutarMenu = (sc.nextInt() == 1);
                sc.nextLine();
                System.out.println("Gracias por su visita ");
                ejecutarMenu = (sc.nextInt() == 1);
                sc.nextLine();


            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un valor válido.");
                sc.nextLine();
            }

        } while (ejecutarMenu);

        sc.close();
    }
}
           
