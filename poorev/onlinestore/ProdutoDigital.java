package onlinestore;

public class ProdutoDigital extends Produto {

	public ProdutoDigital(String nome, double preco) {
		super(nome, preco);
		
	}
	
	public String toString(){
		return ("NOME; " +nome+ ". PREÇO DO PRODUTO DIGITAL; R$"+preco);
		
	}

}
