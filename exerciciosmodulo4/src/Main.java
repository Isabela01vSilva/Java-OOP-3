import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(5);
        listaNumeros.add(8);
        listaNumeros.add(2);
        listaNumeros.add(0);

        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);

        //2
        Titulo titulo1 = new Titulo("Branca de neve");
        Titulo titulo2 = new Titulo("Cinderela");
        Titulo titulo3 = new Titulo("Gasparzinho");

        //3
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }

        //4
        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("A");
        listaLinkedList.add("B");
        System.out.println("LinkedList: " + listaLinkedList);

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("C");
        listaArrayList.add("D");
        System.out.println("ArrayList: " + listaArrayList);

        //5
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("A");
        listaPolimorfica.add("B");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("C");
        listaPolimorfica.add("D");
        System.out.println("LinkedList: " + listaPolimorfica);

    }
}