package service;

import model.Usuario;
import model.Notificable;

public class PlataformaService {

    public void mostrarPaneles(Usuario[] usuarios) {
        for (Usuario u : usuarios) {
            System.out.println(u.getNombre() + " -> " + u.panelInicio());
        }
    }

    public void notificarATodos(Usuario[] usuarios, String mensaje) {
        for (Usuario u : usuarios) {
            if (u instanceof Notificable) {
                Notificable n = (Notificable) u;
                System.out.println(n.recibirNotificacion(mensaje));
            }
        }
    }
}