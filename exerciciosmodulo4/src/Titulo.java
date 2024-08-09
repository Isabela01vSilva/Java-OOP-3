public class Titulo implements Comparable<Titulo>{
    private String nome;

    public String getNome() {
        return nome;
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
