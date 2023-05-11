import java.util.List;

/**
 * David Santiago Carrillo Salamanca
 */

public class Ordenamiento {
    public void bubbleSort(List<Videojuegos> arreglo) {
        for (int i = 0; i < arreglo.size() - 1; i++) {
            for (int j = 0; j < arreglo.size() - i - 1; j++) {
                if (arreglo.get(j).getAno() > arreglo.get(j + 1).getAno()) {
                    Videojuegos aux = arreglo.get(j);
                    arreglo.set(j, arreglo.get(j + 1));
                    arreglo.set(j + 1, aux);
                }
            }
        }
    }
}
