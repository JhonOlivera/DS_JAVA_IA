import model.Administrador;
import model.Cliente;
import model.Usuario;
import model.Vendedor;

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        Usuario[] usuarios = {
                new Cliente("Ana", "ana@mail.com"),
                new Administrador("Luis", "luis@mail.com"),
                new Vendedor("Marta", "marta@mail.com")
        };

        for (Usuario u : usuarios) {
            System.out.println(u.getNombre() + " -> " + u.panelInicio());
        }
    }
}