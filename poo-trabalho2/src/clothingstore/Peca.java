package clothingstore;

public abstract class Peca {

	protected String descricao;
	protected int quantidade; 
	protected int estoque_min;
	protected int estoque_max;
	
	public Peca(String descricao, int quantidade, int estoque_min, int estoque_max) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoque_max = estoque_max;
		this.estoque_min = estoque_min;
	}
	
	public abstract void Venda();
	
	
	   public void reposicaoEstoque() {
	        if (quantidade < estoque_min) {
	            quantidade = estoque_max;
	            System.out.println(descricao + ": Estoque foi reposto ao máximo.");
	        } else {
	            System.out.println(descricao + ": Estoque não precisa de reposição.");
	        }
	    }
	   
	   
	public String getDescricao() {
		return descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
}
