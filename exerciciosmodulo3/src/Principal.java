import br.com.exerciciomodulo3.exe2.Animal;
import br.com.exerciciomodulo3.exe2.Cachorro;
import br.com.exerciciomodulo3.exe4.Produto;
import br.com.exerciciomodulo3.exe5.Circulo;
import br.com.exerciciomodulo3.exe5.Forma;
import br.com.exerciciomodulo3.exe5.Quadrado;
import br.com.exerciciomodulo3.exe6.ContaBancaria;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //1 - Imprimindo um ArrayList
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Gloss");
        lista.add("Batom");
        lista.add("Rímel");
        lista.add("Blush");

        for (String elemento : lista) {
            System.out.println(elemento);
        }

        //2 - Casting para a Classe Animal
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

        //3 - Modificando o exercicio anterior, garantir se o objeto é o tipo correto
        if (animal instanceof Cachorro) {
            cachorro = (Cachorro) animal;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }

        //4 - Imprimir a média dos produtos
        Produto produto1 = new Produto("Forks", 15.99);
        Produto produto2 = new Produto("Knives", 16.99);
        Produto produto3 = new Produto("Spoons", 17.99);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : listaDeProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaDeProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);

        //5 - Calcular a Area do circulo e quadrado
        Circulo circulo = new Circulo();
        circulo.setRaio(5);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5.5);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);

        for (Forma forma : listaDeFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }

        //6 - Imprimir a conta com o maior Saldo.
        ContaBancaria conta1 = new ContaBancaria(12345, 550);
        ContaBancaria conta2 = new ContaBancaria(54321, 620);
        ContaBancaria conta3 = new ContaBancaria(52413, 854.51);
        ContaBancaria conta4 = new ContaBancaria(36521, 854.50);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);

        ContaBancaria contaSaldoMaior = listaDeContas.get(0);

        for (ContaBancaria contas : listaDeContas){
            if(contas.getSaldo() > contaSaldoMaior.getSaldo()){
                contaSaldoMaior = contas;
            }
        }
        System.out.println("Conta: " + contaSaldoMaior.getNumeroDaConta() + " é a com Maior saldo de: " + contaSaldoMaior.getSaldo());
        
    }
}