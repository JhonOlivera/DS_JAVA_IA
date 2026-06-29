import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.println("Cuantas personas en la mesa: ");
        int personas = sc.nextInt();

        System.out.println("Mesa de " + nombre  + "y " + personas + " personas");

        //operadores logicos
        double subtotal = 120000;
        boolean tieneCupon = true;

        boolean aplicaDescuento = subtotal > 100000 && tieneCupon;
        System.out.println("Aplica descuento? " + aplicaDescuento);

        //conversion de tipos
        //casting o casteo
        int unidades = 5;
        double comoDecimal = unidades;
        System.out.println("Implicita: " + comoDecimal);

        double precio = 1999.75;
        int precioRecortado = (int) precio;
        System.out.println("Casting: " + precioRecortado);

        

    }
}
