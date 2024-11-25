package clothingstore;

public class RoupaPMG implements Item {

	protected String descricao;
	private int quantidadeP;
	private int quantidadeM;
	private int quantidadeG;
	protected int estoque_min;
	protected int estoque_max;

	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
			int estoqueMaximo) {

		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
	}
}
