package clothingstore;

public class Peca {

	private String descricao;
	private int quantidade; 
	private int estoque_min;
	private int estoque_max;
	
	public Peca() {
		
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
