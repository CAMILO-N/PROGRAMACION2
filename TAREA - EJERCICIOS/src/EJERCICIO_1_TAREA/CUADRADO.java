package EJERCICIO_1_TAREA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CUADRADO {

    float lado, area, perimetro;

    public void Ingreso_Valores() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresar el valor del lado (cm): ");
        lado = Float.parseFloat(rd.readLine());

        calcularArea();
        calcularPerimetro();

        System.out.println("El área del cuadrado es: " + area + " cm^2");
        System.out.println("El perímetro del cuadrado es: " + perimetro + " cm");
    }

    public void calcularArea() {
        area = lado * lado;
    }

    public void calcularPerimetro() {
        perimetro = 4 * lado;
    }
}
