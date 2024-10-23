package EJERCICIO_1_TAREA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Se requiere tener un ejercicio para realizar el cálculo del área y perímetro de las figuras triangulo,
// cuadrado y el rectángulo. Los datos deben ser ingresados utilizando el println y el BufferedReader.


public class MAIN {

    public static void main(String[] args)  throws IOException{
        String opcion = "";
        BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---- EJERCICIO_2_TAREA.Calculadora de Area y Perimetro ----");
        System.out.println("Seleccionar Opciones ");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");

        opcion = read.readLine();

        switch (opcion){

            case "1":
                System.out.println("--- CUADRADO---");
                CUADRADO objCua = new CUADRADO();
                objCua.Ingreso_Valores();
                break;

            case "2":
                System.out.println("--- RECTANGULO ---");
                Rectangulo objRec = new Rectangulo();
                objRec.INGRESAR_VALORES();
                break;

            case "3":
                System.out.println("--- TRIANGULO ---");
                triangulo objtraingulo = new triangulo();
                objtraingulo.ingresoValores();
                break;

        }

    }



}

