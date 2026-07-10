public class Main {

    public static void main(String[] args) {

        //creamos el objeto
        Perro perro = new Perro();
        perro.nombre = "Rocky";
        perro.raza = "labrador";
        perro.ladrar();

        Perro perro1 = new Perro();
        perro1.nombre = "Pipo";
        perro1.raza = "Pitbull";
        perro1.ladrar();


        Libro libro = new Libro();
        libro.titulo = "Clean Code";
        libro.autor = "Robert Martin";
        libro.paginas = 464;
        System.out.println(libro.descripcion());

        Producto vacio = new Producto();
        vacio.mostrar();

        Producto cafe = new Producto("Cafe", 12000.0);
        cafe.mostrar();

        CuentaBancaria cuenta = new CuentaBancaria("Ana Alvarado", "1001", 50000.0);

        System.out.println(cuenta);

        cuenta.depositar(20000);
        cuenta.retirar(100000);
        cuenta.retirar(30000);
        cuenta.depositar(-500);

        System.out.println("Saldo final (getter): $" + cuenta.getSaldo());
        System.out.println(cuenta);

    }

}