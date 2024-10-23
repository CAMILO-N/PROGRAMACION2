package EJERCICIO_1_TAREA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangulo {

    float largo, ancho, area, perimetro;

    public void INGRESAR_VALORES() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresar Largo (cm):");
        largo = Float.parseFloat(rd.readLine());
        System.out.println("Ingresar Ancho (cm):");
        ancho = Float.parseFloat(rd.readLine());

        calculo_area();
        calculo_perimetro();

        System.out.println("El área del rectángulo es: " + area + " cm^2");
        System.out.println("El perímetro del rectángulo es: " + perimetro + " cm");
    }

    public void calculo_area() {
        area = largo * ancho;
    }

    public void calculo_perimetro() {
        perimetro = 2 * (largo + ancho);
    }
}
