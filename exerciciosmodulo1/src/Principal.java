import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Vinicius", 22);
        Pessoa pessoa2 = new Pessoa("Carlos", 20);
        Pessoa pessoa3 = new Pessoa("Julia", 19);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));
        System.out.println("Lista de pessoas:\n" + listaDePessoas);
    }
}