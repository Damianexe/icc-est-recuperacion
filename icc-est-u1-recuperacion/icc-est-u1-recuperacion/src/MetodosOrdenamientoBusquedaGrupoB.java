import models.Carro;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */

 public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Ascendentemente
    public void sortBYearWithBubbleAvnAsendente(Carro[] carros) {
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (carros[j].getYear() > carros[j + 1].getYear()) {
                    // Swap carros[j] and carros[j+1]
                    Carro temp = carros[j];
                    carros[j] = carros[j + 1];
                    carros[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort by year Descendentemente
    public void sortBYearWithBubbleAvnDesendente(Carro[] carros) {
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (carros[j].getYear() < carros[j + 1].getYear()) {
                    Carro temp = carros[j];
                    carros[j] = carros[j + 1];
                    carros[j + 1] = temp;
                }
            }
        }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] cars, int year) {
        int left = 0;
        int right = cars.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cars[mid].getYear() == year) {
                return mid;
            }
            if (cars[mid].getYear() < year) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Metodo que imprime el listado de personas
    public void showCars(Carro[] cars) {
        for (Carro car : cars) {
            System.out.println(car);
        }
    }
}