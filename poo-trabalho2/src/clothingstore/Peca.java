package clothingstore;

public abstract class Peca {

	private String descricao;
	private int quantidade; 
	private int estoque_min;
	private int estoque_max;
	
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
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque_min() {
		return estoque_min;
	}
	public void setEstoque_min(int estoque_min) {
		this.estoque_min = estoque_min;
	}
	public int getEstoque_max() {
		return estoque_max;
	}
	public void setEstoque_max(int estoque_max) {
		this.estoque_max = estoque_max;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}

	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
