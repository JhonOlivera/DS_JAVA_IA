import model.Notificable;
import model.Usuario;

public class Vendedor extends Usuario implements Notificable {
    public Vendedor(String nombre, String email) {
        super(nombre, email);
    }

    @Override
    public String panelInicio() {
        return "Panel de Vendedor: publicar y gestionar mis productos";
    }

    @Override
    public String recibirNotificacion(String mensaje) {
        return "SMS al vendedor " + nombre + ": " + mensaje;
    }
}