public class Condicionales {
    public static void main(String[] args) {
        //declarar el tipo de datos
        double cuenta = 90000;

        //uso de condicionales
        if(cuenta > 100000) {
            System.out.println("Aplica Descuento");
        }
        else if(cuenta < 100000 ) {
            System.out.println("No aplica descuento");
        }
        else{
            System.out.println("No tiene descuento");
        }
    }
    
}
