import models.Person;
import models.Carro;
import models.CarrosGenerator;
import models.PersonasGenerator;


public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(" ARREGLO ORDENADO Y BUSQUEDA DE CARROS POR MODELO Y AÑO ");
        CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente
        Carro[] carros = generator.generarCarros();

        System.out.println("Listado de carros:");

        MetodosOrdenamientoBusquedaGrupoB metodos = new MetodosOrdenamientoBusquedaGrupoB();
        metodos.sortBYearWithBubbleAvnAsendente(carros);
        metodos.showCars(carros);

        int result = metodos.searchBinaryByYear(carros, 2020);
        if (result == -1) {
            System.out.println("Carro no encontrado");
        } else {
            System.out.println("Carro encontrado en la posicion: " + result);
        }




        System.out.println("ARREGLO ORDENADO Y BUSQUEDA DE PERSONAS POR EDAD Y ALTURA");
        PersonasGenerator generator2 = new PersonasGenerator();
        // Obtener el arreglo de 50 personas generadas aleatoriamente
        Person[] personas = generator2.generarPersonas();
        System.out.println("Listado de personas:");


        MetodosOrdenamientoBusqueda metodos1 = new MetodosOrdenamientoBusqueda();
        metodos1.sortByAgeWithInsertion(personas);
        metodos1.showPersonas(personas);
        metodos1.sortByHeightWithSelection(personas);

        int result1= metodos1.searchBinaryByAge(personas,65);
        if (result1 == -1) {
            System.out.println("Persona no encontrada");
            } else {
                System.out.println("Persona encontrada en la posicion: " + result1);
            }

            /*int result2=metodos2.searchBinaryByHeight(158);
            if(result2 == -1){
                System.out.println("Persona no encontrada");
                }else{
                    System.out.println("Persona encontrada en la posicion: "+result2);
            }*/
    }


}
