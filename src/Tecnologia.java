import java.util.Scanner;

public class Tecnologia extends Producto {

    private int vidautilAnos;
    private String sitioFabricacion;
    private double voltajeAlimentacion;
    private String garantia;

    public Tecnologia(String nombre, double precio, String Codigo, int cantidad, int vidautilAnos, String sitioFabricacion, double voltajeAlimentacion, String garantia) {
       /*super (nombre, precio, Codigo, cantidad);*/
        this.vidautilAnos = vidautilAnos;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }

    public Tecnologia() {

    }

    public double intervalodeMantenimiento(){
        double intervalo = vidautilAnos/5;
        return intervalo;
    }


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
        this.setMarca(sc.next());
        System.out.println("Ingrese el sitio de fabricacion:");
        this.sitioFabricacion= sc.next();
        System.out.println("Ingrese el voltaje de alimentacion");
        this.voltajeAlimentacion= sc.nextDouble();
        System.out.println("Ingrese la garantia:");
        this.garantia= sc.next();
    }

    public  String toString(){
        return "El dispositivo tecnologico " + this.nombre+ "Marca es" + this.getMarca();
    }

    public int getVidautilAnos() {
        return vidautilAnos;
    }

    public void setVidautilAnos(int vidautilAnos) {
        this.vidautilAnos = vidautilAnos;
    }

    public String getSitioFabricacion() {
        return sitioFabricacion;
    }

    public void setSitioFabricacion(String sitioFabricacion) {
        this.sitioFabricacion = sitioFabricacion;
    }

    public double getVoltajeAlimentacion() {
        return voltajeAlimentacion;
    }

    public void setVoltajeAlimentacion(double voltajeAlimentacion) {
        this.voltajeAlimentacion = voltajeAlimentacion;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
}