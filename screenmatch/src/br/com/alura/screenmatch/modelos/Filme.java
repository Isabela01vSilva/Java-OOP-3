package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classficavel;

public class Filme extends Titulo implements Classficavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
