public class Producto {
    String nombre;
    double precio;
//constructor llenito
    Producto() {
        this.nombre = "Sin nombre";
        this.precio = 0.0;
    }
//constructor con parametros
    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
//metodo
    void mostrar() {
        System.out.println(nombre + " -> $" + precio);
    }
}