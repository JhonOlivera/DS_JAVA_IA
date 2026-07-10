import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        //ciclo for
        for(int i = 1; i <= 5; i++){
            System.out.println("Plato # " + i + " impreso en el recibo");
        }


        //ciclo while
        int mesasPorLimpiar = 3;
        while(mesasPorLimpiar > 0 ){
            System.out.println("Faltan " + mesasPorLimpiar + " mesas");
            mesasPorLimpiar --;
        }
        System.out.println("Todo limpio");

         //ciclo do while
    Scanner sc = new Scanner (System.in);
    int opcion;
     do {
        System.out.println("1. Continuar          2. Salir");
        System.out.println("Elige: ");
        opcion = sc.nextInt();

     } while (opcion !=2);

     System.out.println("Saliste del Menú");

    }

   
     
    
}
