package clothingstore;

public class RoupaTamanhoUnico extends Peca implements Item {

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoque_min, int estoque_max) {
		super(descricao, quantidade, estoque_min, estoque_max);
	}

	@Override
	public void Venda() {
		try {
			if (quantidade < 0) {
				throw new IllegalArgumentException("Venda não realizada. Estoque insuficiente.");
			} else {
				quantidade -= 1;
				System.out.println("Venda realizada. Estoque atual de " + descricao + ": " + quantidade);
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Erro!: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro inesperado!: " + e.getMessage());
		}
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

}
