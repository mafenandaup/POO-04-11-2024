package onlinestore;

public abstract class Produto {
	
	protected String nome;
	protected double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
		
	}
}