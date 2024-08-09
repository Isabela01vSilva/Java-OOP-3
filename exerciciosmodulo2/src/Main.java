import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Sabão", 28.99, 3);
        Produto produto2 = new Produto("Pão", 1.5, 5);
        Produto produto3 = new Produto("Ovos", 30.99, 1);

        ArrayList<Produto> listaDoMercado = new ArrayList<>();
        listaDoMercado.add(produto1);
        listaDoMercado.add(produto2);
        listaDoMercado.add(produto3);

        System.out.println("Todos os produtos: " + listaDoMercado);
        System.out.println("Tamanho da lista: " + listaDoMercado.size());
        System.out.println("Segundo produto: " + listaDoMercado.get(1));

        //Outro jeito de listar o conteudo da lista
        for (Produto produto : listaDoMercado) {
            System.out.println(produto);
        }

        ProdutoPercivel produto4 = new ProdutoPercivel("Carne", 90.50, 2, "25/09/2024");
        System.out.println(produto4);
    }
}