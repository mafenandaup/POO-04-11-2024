package clothingstore;

import java.util.Scanner;

public class RoupaPMG implements Item {

	protected String descricao;
	private int quantidadeP;
	private int quantidadeM;
	private int quantidadeG;
	protected int estoque_min;
	protected int estoque_max;

	   public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoque_min, int estoque_max) {
	        this.descricao = descricao;
	        this.quantidadeP = quantidadeP;
	        this.quantidadeM = quantidadeM;
	        this.quantidadeG = quantidadeG;
	        this.estoque_min = estoque_min;
	        this.estoque_max = estoque_max;
	    }
	
	public void Venda() {
		try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o tamanho para venda (P/M/G): ");
            String tamanho = sc.nextLine().toUpperCase();

            switch (tamanho) {
                case "P":
                    if (quantidadeP > 0) {
                        quantidadeP--;
                        System.out.println("Venda realizada. Estoque atual de " + descricao + ": " + quantidadeP+ " itens disponíveis.");
                    } else {
                        throw new IllegalArgumentException("Estoque insuficiente para tamanho P.");
                    }
                    break;
                case "M":
                    if (quantidadeM > 0) {
                        quantidadeM--;
                        System.out.println("Venda realizada. Estoque atual de " + descricao + ": " + quantidadeM+ " itens disponíveis.");
                    } else {
                        throw new IllegalArgumentException("Estoque insuficiente para tamanho M.");
                    }
                    break;
                case "G":
                    if (quantidadeG > 0) {
                        quantidadeG--;
                        System.out.println("Venda realizada. Estoque atual de " + descricao + ": " + quantidadeG+ " itens disponíveis.");                  
                        } else {
                        throw new IllegalArgumentException("Estoque insuficiente para tamanho G.");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Tamanho inválido.Tente Novamente");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

	@Override
	public void reposicaoEstoque() {
		 boolean reposto = false;

	        if (quantidadeP < estoque_min) {
	            quantidadeP = estoque_max;
	            reposto = true;
	        }
	        if (quantidadeM < estoque_min) {
	            quantidadeM = estoque_max;//se a quantia for menor que o estoque mínimo, a quantidade é reposta e se torna a quantia máxima de estoque, para evitar erros de compra.
	            reposto = true;
	        }
	        if (quantidadeG < estoque_min) {
	            quantidadeG = estoque_max;
	            reposto = true;
	        }

	        if (reposto) {
	            System.out.println("Reposição realizada para " + descricao + ": Estoque atualizado.");
	            System.out.println("P: " + quantidadeP + ", M: " + quantidadeM + ", G: " + quantidadeG);
	        } else {
	            System.out.println("Estoque de " + descricao + " não precisa de reposição.");
	        }
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

}

        }
    }

}
