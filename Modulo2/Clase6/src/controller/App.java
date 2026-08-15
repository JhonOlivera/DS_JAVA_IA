package controller;

import model.Usuario;
import model.Cliente;
import model.Administrador;
import model.Vendedor;
import service.PlataformaService;

public class App {
    public static void main(String[] args) {
        Usuario[] usuarios = {
                new Cliente("Ana", "ana@mail.com"),
                new Administrador("Luis", "luis@mail.com"),
                new Vendedor("Marta", "marta@mail.com")
        };

        PlataformaService servicio = new PlataformaService();

        System.out.println("--- Paneles ---");
        servicio.mostrarPaneles(usuarios);

        System.out.println("--- Notificaciones ---");
        servicio.notificarATodos(usuarios, "Oferta del dia");
    }
}