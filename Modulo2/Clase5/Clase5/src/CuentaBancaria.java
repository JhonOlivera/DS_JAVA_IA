public class CuentaBancaria {

    //atributos
    private String titular;
    private String numeroCuenta;
    private double saldo;
//metodo constructor por defecto
    public CuentaBancaria() {
        this.titular = "Sin asignar";
        this.numeroCuenta = "0000";
        this.saldo = 0.0;
    }
//metodo constructor parametrizado
    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
        }
    }
//metodos accesores
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
//metodo depositar
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a depositar debe ser mayor a cero.");
            return;
        }
        saldo += monto;
        System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
    }
//metodo retirar
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto a retirar debe ser mayor a cero.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Error: fondos insuficientes. Saldo actual: $" + saldo);
            return;
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
    }
//metodo ToString
    public String toString() {
        return "Cuenta " + numeroCuenta + " | Titular: " + titular + " | Saldo: $" + saldo;
    }
}