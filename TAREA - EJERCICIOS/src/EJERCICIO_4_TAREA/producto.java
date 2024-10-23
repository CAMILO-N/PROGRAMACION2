package EJERCICIO_4_TAREA;

import javax.swing.*;

public class producto {
    int cantidad;
    String nombre, marca, tipo, IVA;
    double precio, precio_final;

    public producto(int cantidad, String nombre, String marca, double precio, String tipo, String IVA) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.tipo= tipo;
        this.IVA = IVA;
    }
    public void calcular_preciofinal (){
        if (IVA.equals("2")){
            precio_final = precio * cantidad;


        } else {

            if (precio <= 500){
                precio_final = precio + (precio * 0.12);

            }

            if (precio > 500 && precio <=1500){
                precio_final = precio + (precio * 0.14);

            }
            if (precio > 1500){
                precio_final = precio + (precio * 0.15);

            }
        }
    }


    public void mostrar_datos () {
        JOptionPane.showMessageDialog(null, "1. Nombre del producto: " + nombre + "\n2. Marca del producto: " + marca + "\n3. Tipo del producto: " + tipo + "\n4. Cantidad del producto: " + cantidad + "\n5. Precio del producto: " + precio + "\n6. Precio final producto: " + precio_final);

    }
}
