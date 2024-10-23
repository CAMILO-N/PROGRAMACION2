package EJERCICIO_4_TAREA;

import javax.swing.*;

public class main_4 {


    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Ingrese la marca del producto:");
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo del producto:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
        String IVA = JOptionPane.showInputDialog("Si el producto tiene IVA presione 1, si no tiene ingrese 2: \n 1. Sí  \n 2. No ");

        producto producto = new producto(cantidad, nombre, marca, precio,tipo, IVA);
        producto.calcular_preciofinal ();
        producto.mostrar_datos();

    }



}
