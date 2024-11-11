package onlinestore;

public class ProdutoFisico  extends Produto implements Tributavel{

	public ProdutoFisico(String nome, double preco) {
		super(nome, preco);
	}

	@Override
	public double calculaImposto() {
		return preco * 0.1;
	}
	
	public String toString(){
		return ("NOME; " +nome+ ". PREÇO DO PRODUTO FÍSICO; R$"+preco+ ". PREÇO ATT(TRIBUTAÇÃO DE 10%); R$" +calculaImposto());
		
	}

}
