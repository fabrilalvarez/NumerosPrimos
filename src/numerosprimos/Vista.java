package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class Vista {

    /**
     * @return fin introduccion de dato que determina hasta donde deja de
     * contar.
     *
     */
    public static int datoFin() {
        int fin;
        Scanner dato = new Scanner(System.in);
        System.out.println("introduce el numero final");
        return fin = dato.nextInt();
    }

    /**
     *
     * @return cantidad de digitos que queremos calcular.
     */
    public static int entradaDato() {
        int cantidadDigitos;
        System.out.println("introduce cantidad de digitos: (consejo no mas de 5) ");
        Scanner dato = new Scanner(System.in);
        cantidadDigitos = dato.nextInt();
        return cantidadDigitos;
    }

    /**
     *
     * @param cantidadDigitos numero de "numeros primos" que el programa
     * calculará. ( entradaDato(); )
     */
    public static void condicion(int cantidadDigitos) {
        if (cantidadDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
    }
}
