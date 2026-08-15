public class AppFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Circulo(5),
                new Rectangulo(4, 6)
        };
        for (Figura f : figuras) {
            System.out.printf("Area: %.2f%n", f.calcularArea());
        }
    }
}