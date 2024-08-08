package br.com.alura.screenmatch.calculo;

public class FiltroRecomendacao {

    public void filtra(Classficavel classficavel) {
        if (classficavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classficavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
