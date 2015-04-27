package numerosprimos;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class NumerosPrimos {

    public static final int FIN = 0, ENTRADA = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Gestion de datos Modelo
        Modelo datos = new Modelo();
        datos.recepcionDeDatos(Vista.datoFin(),Vista.entradaDato());

        // variables main
        boolean esPrimo = false;
        int cantidadDigitos = datos.getDatosIntro(ENTRADA);
        int contadorDigitos;
        int fin = datos.getDatosIntro(FIN);

        Vista.condicion(cantidadDigitos);
        //i --> numeros que calculara es decir, desde el i=1 hasta i<=fin
        for (int i = 1; i <= fin; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            contadorDigitos = contador;

            if (contadorDigitos == cantidadDigitos) {
                if (i < 4) {
                    esPrimo = true;
                } else {
                    if (i % 2 == 0) {
                        esPrimo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            esPrimo = true;
                        }
                    }
                }
                //muestra el numero primo si es primo.
                if (esPrimo == true) {
                    datos.guardar(i);
                }
            }
        }
    }

}
