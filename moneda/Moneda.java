package moneda;

import java.util.Scanner;

public class Moneda {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CajeroLimitado cajero1 = new CajeroLimitado();
        //Pedimos los valores
        System.out.println("Ingresa los euros a transformar");
        System.out.println("Nota: Deben ser enteros positivos");
        System.out.println("Ingresa 0 para terminar");
        //Mientras sea verdad
        while (true) {
            //Leer la cantidad
            int cantidad = leer.nextInt();
            //Si la cantidad es igual a 0, terminar programa
            if (cantidad == 0) {
                break;
            }
            //Sino, llamar métodos de la clase CajeroLimitado
            cajero1.setCantidad(cantidad);
            cajero1.Cambio();            // calcular cambio
            cajero1.mostrarInventario(); // mostrar inventario
            System.out.println("----------");
        }
    }
}
