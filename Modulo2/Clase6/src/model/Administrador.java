import model.Usuario;

public class Administrador extends Usuario {
    public Administrador(String nombre, String email) {
        super(nombre, email);
    }

    @Override
    public String panelInicio() {
        return "Panel de Admin: gestionar usuarios y reportes";
    }
}