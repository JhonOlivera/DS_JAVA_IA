public class PagoTarjeta implements MetodoPago {
    @Override
    public String procesarPago(double monto) {
        return "Cobrando $" + monto + " a la tarjeta de credito";
    }
}