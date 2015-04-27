package numerosprimos;

import java.util.ArrayList;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class Modelo {

    Integer[] datosIntro;
    ArrayList<Integer> datosRes;

    public Modelo() {
        datosIntro = new Integer[2];
        datosRes = new ArrayList<Integer>();
    }

    public void recepcionDeDatos(int fin, int entrada) {
        datosIntro[0] = fin;
        datosIntro[1] = entrada;
    }

    public void guardar(int i) {
        datosRes.add(i);
        System.out.println(i);
    }

    public int getDatosIntro(int posicion) {
        return datosIntro[posicion];
    }

}
