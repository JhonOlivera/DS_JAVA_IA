public class Metodos {
    public static void main(String[] args) {
        double propina = calcularPropina(80000, 0.10);
        System.out.println("Propina: " + propina);
    }
    static double calcularPropina(double subtotal, double porcentaje){
        return subtotal * porcentaje;
    }

    //metodo para calcular el total
    static double calcularTotal(double subTotal, double porcentaje){
        double propina = calcularPropina(subTotal, porcentaje);
        return subTotal + propina;
    }
}
    
