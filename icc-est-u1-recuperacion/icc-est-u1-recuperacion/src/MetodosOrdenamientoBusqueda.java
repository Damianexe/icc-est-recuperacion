
import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    public void sortByAgeWithSelection(Person[] persons) {
        int ntamanio = persons.length;
        for (int i = 0; i < ntamanio - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ntamanio; j++) {
                if (persons[j].getAge() < persons[minIndex].getAge()) {
                    minIndex = j;
                }
            }
            Person temp = persons[minIndex];
            persons[minIndex] = persons[i];
            persons[i] = temp;
        }
    }


    public void sortByHeightWithSelection(Person[] personas1) {
        int tamanio = personas1.length;
        for (int i = 0; i < tamanio - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (personas1[j].getHeight() < personas1[minIndex].getHeight()) {
                    minIndex = j;
                }
            }
            Person temp = personas1[minIndex];
            personas1[minIndex] = personas1[i];
            personas1[i] = temp;
        }
    }


    public void sortByAgeWithInsertion(Person[] personasi) {
        int ntaman = personasi.length;
        for (int i=1;i<ntaman;i++){
            Person key = personasi[i];
            int j=i-1;
            while(j>=0 && personasi[j].getAge()>key.getAge()){
                personasi[j+1]=personasi[j];
                j=j-1;
            }
            personasi[j+1]=key;
        }
    }

    public void sortByHeightWithInsertion(Person[] personsi) {
        int ntamanio = personsi.length;
        for (int i = 1; i < ntamanio; i++) {
            Person key = personsi[i];
            int j = i - 1;
            while (j >= 0 && personsi[j].getHeight() > key.getHeight()) {
                personsi[j + 1] = personsi[j];
                j = j - 1;
            }
            personsi[j + 1] = key;
        }
    }

   
    public int searchBinaryByAge(Person[] people, int age) {
        int left = 0;
        int right = people.length - 1;
        while (left<=right){
            int mid = (left + right) / 2;
            if(people[mid].getAge()==age){
                return mid;    
            }
            if(people[mid].getAge()<age){
                left= mid+1;

            }else{
                right=mid-1;
            }
        }
    return -1;
    }

 
    public int searchBinaryByHeight(Person[] people, int height) {
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (people[mid].getHeight() == height) {
                return mid;
            }
            if (people[mid].getHeight() < height) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }


    public void showPersonas(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
