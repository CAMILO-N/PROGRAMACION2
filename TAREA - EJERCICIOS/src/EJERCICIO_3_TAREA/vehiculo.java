package EJERCICIO_3_TAREA;

import javax.swing.*;

public class vehiculo {

    int  num_ventanas, num_puertas, km_inicial, km_final, km_recorridos;
    String marca = " ", modelo= " " ;
    double num_motor;
    String opcion = " ";

    public void ingreso_datos (){

        do {
            opcion = JOptionPane.showInputDialog("        Ingreso de Vehiculo        \n 1. Ingresar la marca del Vehiculo \n 2. Ingresar el modelo del Vehiculo" +
                    "\n 3. Ingresar el numero del motor \n 4. Ingresar el numero de ventanas  \n 5. Ingresar el numero de  puertas  \n 6. Ingresar el Kilometraje Inicial \n 7. Ingresar" + "el Kilometraje Final \n 8. Mostrar Datos del Vehiculo \n 9. Salir");

            switch (opcion) {
                case "1":
                    marca = JOptionPane.showInputDialog("Ingresar la marca del Vehiculo");

                    break;

                case "2":
                    modelo = JOptionPane.showInputDialog("Ingresar el modelo del Vehiculo");
                    break;

                case "3":
                    num_motor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero del motor"));
                    break;

                case "4":
                    num_ventanas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ventanas"));
                    break;

                case "5":
                    num_puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de  puertas "));
                    break;

                case "6":
                    km_inicial = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Kilometraje Inicial "));
                    break;

                case "7":
                    km_final = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Kilometraje Final "));
                    break;

                case "8":
                    calc_kmrecorridos ();
                    JOptionPane.showMessageDialog(null, "Datos del Vehiculo:\n" +
                            "Marca: " + marca + "\n" +
                            "Modelo: " + modelo + "\n" +
                            "Número del motor: " + num_motor + "\n" +
                            "Número de ventanas: " + num_ventanas + "\n" +
                            "Número de puertas: " + num_puertas + "\n" +
                            "Kilometraje inicial: " + km_inicial + "\n" +
                            "Kilometraje final: " + km_final + "\n" +
                            "Kilometros Recorridos: " +  km_recorridos);

                    break;
            }
        }while ( !opcion.equals("9") );
    }


    public void calc_kmrecorridos (){
        km_recorridos =    km_final - km_inicial;

    }




}
