import java.util.Scanner;

public class Electrodomestico extends Producto{

    private int vidaUtilAnios;
    private String sitioFabricacion;
    private  double voltajeAlimentacion;
    private String garantia;

    public Electrodomestico(int vidaUtilAnios, String sitioFabricacion, double voltajeAlimentacion, String garantia) {
        this.vidaUtilAnios = vidaUtilAnios;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }

    /*public Electrodomestico(String nombre, double precio, String Codigo, int cantidad, String mabe, int vidaUtilAnios,
                            String sitioFabricacion, double voltajeAlimentacion, String garantia) {
        super(nombre, precio, Codigo, cantidad);
        this.vidaUtilAnios = vidaUtilAnios;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }*/

    public Electrodomestico() {
    }


    public void bienvenida () {
        System.out.println("Ingrese un electrodomestico");
    }

    public double mantenimiento (){
        double intervalo = vidaUtilAnios/5;
        return intervalo;
    }

    @Override
    public String toString(){
        return "Existen "+cantidad+ " productos del electrodomestico " +this.nombre+ " de marca "+this.Marca;
    }

    @Override
    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = sc.next();
        System.out.println("Ingrese el precio del producto: ");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese el código del producto: ");
        this.Codigo = sc.next();
        System.out.println("Ingrese la cantidad del producto: ");
        this.cantidad = sc.nextInt();
        System.out.println("Ingrese la marca del producto: ");
        this.Marca = sc.next();
        System.out.println("Ingrese el sitio de fabricacion:");
        this.sitioFabricacion= sc.next();
        System.out.println("Ingrese el voltaje de alimentacion");
        this.voltajeAlimentacion= sc.nextDouble();
        System.out.println("Ingrese la garantia:");
        this.garantia= sc.next();
    }
}