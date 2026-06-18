


import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //declarar variables
        int edad;
        double salario;
        float promedio;
        char sexo;
        boolean estado;
        String nombres;


        //entrada de datos por ventana emergente
        nombres = JOptionPane.showInputDialog("Digite el nombre del estudiante: ");
        edad =Integer.parseInt( JOptionPane.showInputDialog("Ingrese la edad"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del estudiante: "));
        promedio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el promedio del estudiante: "));
        sexo = JOptionPane.showInputDialog("Ingrese el sexo de la persona: ").charAt(0);
        estado = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese el estado del estudiante: "));

        //salida de datos por ventana emergente
        JOptionPane.showMessageDialog(null, "Nombre: " +  nombres + "\nEdad: " + edad );
    
    }
}
