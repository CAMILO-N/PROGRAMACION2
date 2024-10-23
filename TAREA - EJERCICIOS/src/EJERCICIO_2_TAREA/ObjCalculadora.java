package EJERCICIO_2_TAREA;

import javax.swing.*;

public class ObjCalculadora {

    private String Modelo;
    String operacion;
    double numero1, numero2, resultado;


    public void IngresoValores() {

        Modelo = JOptionPane.showInputDialog("Ingresar el modelo");


        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el número 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el número 2"));
        operacion = JOptionPane.showInputDialog("Ingresar operación a realizar (+, -, *, /)");

        resultado = this.CalculaValores();

        // Mostrar resultado en un solo cuadro de diálogo
        String mensaje = "El modelo es: " + Modelo + "\nEl resultado es: " + resultado;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private double CalculaValores() {
        double resultadoOperacion = 0;

        switch (operacion) {
            case "+":
                resultadoOperacion = numero1 + numero2;
                break;

            case "-":
                resultadoOperacion = numero1 - numero2;
                break;

            case "*":
                resultadoOperacion = numero1 * numero2;
                break;

            case "/":
                if (numero2 == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por 0. Intente nuevamente.");
                    IngresoValores(); // Volver a ingresar los valores
                    return 0; // O retornar un valor especial
                } else {
                    resultadoOperacion = numero1 / numero2;
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Operación no válida. Intente nuevamente.");
                operacion = JOptionPane.showInputDialog("Ingresar operación a realizar (+, -, *, /)");
        }

        return resultadoOperacion;
    }
}
