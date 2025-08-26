package moneda;

public class CajeroLimitado {
    //Cantidad a transformar
    private int cantidad; 
    // Inventario inicial, 10 de cada billete y moneda
    private int b1000 = 10, b500 = 10, b200 = 10, b100 = 10, b50 = 10, b20 = 10;
    private int m10 = 10, m5 = 10, m2 = 10, m1 = 10;

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int Cambio() {
        //Cantidad restante
        int cantidadR = cantidad; // lo que queda por entregar
        int necesarios,usar;
        // Billetes de 1000
        if (cantidadR >= 1000 && b1000 > 0) {
            necesarios = cantidadR / 1000;
            usar = Math.min(necesarios, b1000); 
            b1000 -= usar;
            cantidadR -= usar * 1000;
            System.out.println("Billetes de 1000: " + usar);
        }

        // Billetes de 500
        if (cantidadR >= 500 && b500 > 0) {
            necesarios = cantidadR / 500;
            usar = Math.min(necesarios, b500);
            b500 -= usar;
            cantidadR -= usar * 500;
            System.out.println("Billetes de 500: " + usar);
        }

        // Billetes de 200
        if (cantidadR >= 200 && b200 > 0) {
            necesarios = cantidadR / 200;
            usar = Math.min(necesarios, b200);
            b200 -= usar;
            cantidadR -= usar * 200;
            System.out.println("Billetes de 200: " + usar);
        }

        // Billetes de 100
        if (cantidadR >= 100 && b100 > 0) {
            necesarios = cantidadR / 100;
            usar = Math.min(necesarios, b100);
            b100 -= usar;
            cantidadR -= usar * 100;
            System.out.println("Billetes de 100: " + usar);
        }

        // Billetes de 50
        if (cantidadR >= 50 && b50 > 0) {
            necesarios = cantidadR / 50;
            usar = Math.min(necesarios, b50);
            b50 -= usar;
            cantidadR -= usar * 50;
            System.out.println("Billetes de 50: " + usar);
        }

        // Billetes de 20
        if (cantidadR >= 20 && b20 > 0) {
            necesarios = cantidadR / 20;
            usar = Math.min(necesarios, b20);
            b20 -= usar;
            cantidadR -= usar * 20;
            System.out.println("Billetes de 20: " + usar);
        }

        // Monedas de 10
        if (cantidadR >= 10 && m10 > 0) {
            necesarios = cantidadR / 10;
            usar = Math.min(necesarios, m10);
            m10 -= usar;
            cantidadR -= usar * 10;
            System.out.println("Monedas de 10: " + usar);
        }

        // Monedas de 5
        if (cantidadR >= 5 && m5 > 0) {
            necesarios = cantidadR / 5;
            usar = Math.min(necesarios, m5);
            m5 -= usar;
            cantidadR -= usar * 5;
            System.out.println("Monedas de 5: " + usar);
        }

        // Monedas de 2
        if (cantidadR >= 2 && m2 > 0) {
            necesarios = cantidadR / 2;
            usar = Math.min(necesarios, m2);
            m2 -= usar;
            cantidadR -= usar * 2;
            System.out.println("Monedas de 2: " + usar);
        }

        // Monedas de 1
        if (cantidadR >= 1 && m1 > 0) {
            necesarios = cantidadR / 1;
            usar = Math.min(necesarios, m1);
            m1 -= usar;
            cantidadR -= usar * 1;
            System.out.println("Monedas de 1: " + usar);
        }

        // Si quedó algo pendiente
        if (cantidadR > 0) {
            System.out.println("⚠️ No se pudo dar el cambio exacto. Faltante: " + cantidadR);
        }

        return cantidadR;
    }

    // Mostrar inventario restante
    public void mostrarInventario() {
        System.out.println("📦 Inventario actual:");
        System.out.println("1000 → " + b1000);
        System.out.println("500 → " + b500);
        System.out.println("200 → " + b200);
        System.out.println("100 → " + b100);
        System.out.println("50 → " + b50);
        System.out.println("20 → " + b20);
        System.out.println("10 → " + m10);
        System.out.println("5 → " + m5);
        System.out.println("2 → " + m2);
        System.out.println("1 → " + m1);
    }
}
