public class AppPagos {
    public static void main(String[] args) {
        MetodoPago[] metodos = {
                new PagoTarjeta(),
                new PagoPSE()
        };
        for (MetodoPago m : metodos) {
            System.out.println(m.procesarPago(50000));
        }
    }
}