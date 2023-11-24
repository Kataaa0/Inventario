import java.util.Scanner;
public class Producto {
 String nombre;
 double precio;
 String Codigo;
 int cantidad;

String Marca;


        public void ingresarProducto(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre=sc.next();
        System.out.println("Ingrese el precio del producto: ");
        this.precio=sc.nextDouble();
        System.out.println("Ingrese el código del producto: ");
        this.Codigo=sc.next();
        System.out.println("Ingrese la cantidad del producto: ");
        this.cantidad=sc.nextInt();
    }

        public String getMarca() {

        return Marca;
    }

        public void setMarca(String marca) {
        Marca = marca;
    }

        public String getNombre() {
        return nombre;
    }

        public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        public double getPrecio() {
        return precio;
    }

        public void setPrecio(double precio) {
        this.precio = precio;
    }

        public String getCodigo() {
        return Codigo;
    }

        public void setCodigo(String codigo) {
        Codigo = codigo;
    }

        public int getCantidad() {
        return cantidad;
    }

        public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    }


