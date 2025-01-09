package Java.Avanzado;

public import java.util.ArrayList;

class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    int res = 0;
    for (int x = 0; x < stops.size(); x++) {
        int[] pasajeros = stops.get(x); // Obtén el arreglo en la posición i
        for (int y = 0; y < pasajeros.length; y++) {
            res += pasajeros[0];
            res -= pasajeros[1];
        }
    }

    return res;
  }
} 
