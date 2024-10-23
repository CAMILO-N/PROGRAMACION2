package EJERCICIO_1_TAREA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class triangulo {

    float base, altura, area, perimetro;

    public void ingresoValores() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresar la base del triángulo (cm): ");
        base = Float.parseFloat(rd.readLine());

        System.out.print("Ingresar la altura del triángulo (cm): ");
        altura = Float.parseFloat(rd.readLine());

        System.out.print("Ingresar el lado 1 del triángulo (cm): ");
        float lado1 = Float.parseFloat(rd.readLine());

        System.out.print("Ingresar el lado 2 del triángulo (cm): ");
        float lado2 = Float.parseFloat(rd.readLine());

        calcularArea();
        calcularPerimetro(lado1, lado2);

        System.out.println("El área del triángulo es: " + area + " cm");
        System.out.println("El perímetro del triángulo es: " + perimetro + " cm");
    }

    public void calcularArea() {
        area = (base * altura) / 2;
    }

    public void calcularPerimetro(float lado1, float lado2) {
        perimetro = base + lado1 + lado2;
    }
}
