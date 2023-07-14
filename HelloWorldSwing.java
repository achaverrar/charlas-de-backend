import java.awt.BorderLayout;

import javax.swing.*;

public class HelloWorldSwing {

    private static void crearYMostrarGUI() {
        // Crea la ventana
        JFrame ventana = new JFrame();
        // Define el título de la barra de estado
        ventana.setTitle("Hola Mundo en Java Swing");
        // Hace que el tamaño por defecto de la ventana
        // sea 400px de ancho x 300 de alto
        ventana.setSize(400,300);
        // Impide que el usuario cambie el tamaño de la ventana
        ventana.setResizable(false);
        // Detiene la ejecución del programa cuando se cierra la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Divide la ventana en 5 regiones: NORTH, WEST, CENTER, EAST, SOUTH
        ventana.setLayout(new BorderLayout());

        // Crea una etiqueta de texto que dice "Hello World"
        JLabel etiqueta = new JLabel("Hello World");
        // Centra el texto horizontalmente en la etiqueta
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        // Ubica a la etiqueta en la región CENTER de la ventana
        ventana.getContentPane().add(etiqueta, BorderLayout.CENTER);

        // Abre la venta
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        crearYMostrarGUI();
    }
}