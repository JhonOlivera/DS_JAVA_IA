import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do{ 
            System.out.println("===== CAJERO =====");
            System.out.println("1, Nuevo pedido");
            System.out.println("2. Cerrar caja");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Subtotal: ");
                    double subtotal = sc.nextDouble();
                    if(subtotal > 100000){
                        System.out.println("Pedido con descuento");
                    }else{
                        System.out.println("Pedido sin descuento");
                    }
                    break;
                case 2:
                    System.out.println("Caja cerrada");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de Nuevo");
            }
        }while(opcion != 2);
    }
    
}
