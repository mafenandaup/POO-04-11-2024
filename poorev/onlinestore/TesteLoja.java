package onlinestore;

public class TesteLoja {

	public static void main(String[] args) {
		ProdutoDigital pd = new ProdutoDigital("E-book", 20.98);
		ProdutoFisico pf = new ProdutoFisico("Caixa de ovos", 23.60);
		ProdutoDigital pd2 = new ProdutoDigital("Processador", 53.38);
		ProdutoFisico pf2 = new ProdutoFisico("Calculadora científica", 71.90);
		ProdutoDigital pd3 = new ProdutoDigital("Chapinha", 87.38);
		ProdutoFisico pf3 = new ProdutoFisico("Kiwi(1kg)", 14.49);
		
		System.out.println(pd.toString());
		System.out.println(pf.toString());
		System.out.println(pd2.toString());
		System.out.println(pf2.toString());
		System.out.println(pd3.toString());
		System.out.println(pf3.toString());
	}

}
