package clothingstore;

public abstract class Peca {

	protected String descricao;
	protected int quantidade; 
	protected int estoque_min;
	protected int estoque_max;
	 
	// atributos e construtor
	
	public Peca(String descricao, int quantidade, int estoque_min, int estoque_max) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoque_max = estoque_max;
		this.estoque_min = estoque_min;
	}
	
	public abstract void Venda(); // método abstrato venda a ser implementado pelas outras classes
	
	
	   public void reposicaoEstoque() {
	        if (quantidade < estoque_min) { //se a quantia for menor que o estoque mínimo, ela se repõe e se torna a quantia máxima de estoque.
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

