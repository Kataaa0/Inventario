import java.util.Scanner;


public class Main {
    public static void main(String[] args){
       // Producto p1= new Producto();
       // p1.ingresarProducto();
       // Alimento a1= new Alimento();
       // a1.ingresarProducto();

        //Electrodomestico e1= new Electrodomestico();
        //e1.ingresarProducto() ;
//
      //  Tecnologia t1= new Tecnologia();
       // t1.ingresarProducto();





      ///  System.out.println( e1.toString());

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
