package EJERCICIO_5_TAREA;

import javax.swing.*;

public class main_5 {

    public static void main(String[] args) {
        String opcion = " ";
        empleado objempleado = null;

        do {
            opcion = JOptionPane.showInputDialog("   Menu de Opciones   \n 1. Ingresar Datos del Empleado \n 2. Modificar Salario \n 3. Calcular Edad \n 4. Calcular Prestaciones \n 5. Mostrar Datos del Empleado \n 6. Salir");

            switch (opcion) {
                case "1":
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del empleado:"));
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                    String apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado:");
                    String genero = JOptionPane.showInputDialog("Ingrese el género del empleado:");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));
                    int dia_empleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de nacimiento en número: "));
                    int mes_empleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento en número:"));
                    int anio_empleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento en número:"));

                    // Crear el objeto empleado
                    objempleado = new empleado(cedula, nombre, apellido, genero, salario, dia_empleado, mes_empleado, anio_empleado);
                    JOptionPane.showMessageDialog(null, "Datos del empleado ingresados correctamente.");
                    break;

                case "2":
                    if (objempleado != null) {
                        double nuevo_salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo salario del empleado:"));
                        objempleado.cambiar_Salario(nuevo_salario);
                        JOptionPane.showMessageDialog(null, "Salario modificado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debe ingresar los datos del empleado.");
                    }
                    break;

                case "3":
                    if (objempleado != null) {
                        int edad = objempleado.calcularEdad();
                        JOptionPane.showMessageDialog(null, "La edad del empleado es de: " + edad + " años.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debe ingresar los datos del empleado.");
                    }
                    break;

                case "4":
                    if (objempleado != null) {
                        int antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la antigüedad del empleado (en años):"));
                        double prestaciones = objempleado.calcularPrestaciones(antiguedad);
                        JOptionPane.showMessageDialog(null, "Las prestaciones del empleado son: " + prestaciones);
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debe ingresar los datos del empleado.");
                    }
                    break;

                case "5":
                    if (objempleado != null) {
                        String datosEmpleado = objempleado.mostrarDatos();
                        JOptionPane.showMessageDialog(null, "Datos del Empleado:\n" + datosEmpleado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debe ingresar los datos del empleado.");
                    }
                    break;


            }

        } while (!opcion.equals("6"));
    }
}
