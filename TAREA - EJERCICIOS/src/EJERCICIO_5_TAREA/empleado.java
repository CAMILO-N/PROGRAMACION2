package EJERCICIO_5_TAREA;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class empleado {

    int cedula, dia_empleado, mes_empleado, anio_empleado;
    String nombre, apellido, genero;
    double salario;

    // Constructor
    public empleado(int cedula, String nombre, String apellido, String genero, double salario, int dia_empleado, int mes_empleado, int anio_empleado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.dia_empleado = dia_empleado;
        this.mes_empleado = mes_empleado;
        this.anio_empleado = anio_empleado;
    }

    public int calcularEdad() {
        GregorianCalendar cal = new GregorianCalendar();
        int dia_c = cal.get(Calendar.DAY_OF_MONTH);
        int mes_c = cal.get(Calendar.MONTH) + 1;
        int anio_c = cal.get(Calendar.YEAR);
        int edad = anio_c - anio_empleado;

        if (mes_c < mes_empleado || (mes_c == mes_empleado && dia_c < dia_empleado)) {
            edad--;
        }
        return edad;
    }

    public void cambiar_Salario(double salario) {
        this.salario = salario;
    }


    public double calcularPrestaciones(int antiguedad) {
        return (antiguedad * salario) / 12;
    }


    public String mostrarDatos() {
        return String.format("Cédula: %d\nNombre: %s\nApellido: %s\nGénero: %s\nSalario: %.2f\nFecha de Nacimiento: %02d/%02d/%d",
                cedula, nombre, apellido, genero, salario, dia_empleado, mes_empleado, anio_empleado);
    }
}
