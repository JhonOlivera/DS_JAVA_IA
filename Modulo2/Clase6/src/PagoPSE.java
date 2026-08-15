public class PagoPSE implements MetodoPago {
    @Override
    public String procesarPago(double monto) {
        return "Redirigiendo al banco para pagar $" + monto + " por PSE";
    }
}