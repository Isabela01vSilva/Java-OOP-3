import java.util.Date;

public class ProdutoPercivel extends Produto {
    private String dataValidade;

    public ProdutoPercivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
