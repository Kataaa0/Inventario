import java.util.Scanner;

public class Inventario {

    private String registroDelProducto; // Cambié el nombre de la variable para seguir convenciones de nombres.
    public int opcion;
    public int producto;
    public String tipoProducto;

    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar el nombre del producto");
        String nombreProducto = sc.nextLine();

        System.out.println("Ingrese el tipo de producto");
        String tipoProducto = sc.nextLine();

        System.out.println("Ingrese la fecha de elaboración");
        String fechaElaboracion = sc.nextLine();


        sc.close();
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        int a = 1;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese el tipo de producto que desea ");
            int producto = sc.nextInt();

            switch (producto) {
                case 1:
                    Alimento a1 = new Alimento();
                    a1.ingresarProducto();
                    break;

                case 2:
                    Electrodomestico e1 = new Electrodomestico();
                    e1.ingresarProducto();
                    break;

                case 3:
                    Tecnologia t1 = new Tecnologia();
                    t1.ingresarProducto();
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

            sc.close();

        } while (a == 1);
    }
}



