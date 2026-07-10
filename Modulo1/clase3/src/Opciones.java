public class Opciones {
    public static void main(String[] args) {
    

        int opcion = 3;

        switch (opcion) {
            case 1:
                System.out.println("Nuevo pedido");
                break;
            case 2:
                System.out.println("Aplicar Dexcuento");
                break;
            case 3:
                System.out.println("cerrar caja.");
                break;
            default:
                System.out.println("Opcion invalida. Intentelo nuevamente");
        }
        
    }
    
}
