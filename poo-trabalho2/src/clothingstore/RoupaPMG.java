package clothingstore;

import java.util.Scanner;

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
                    throw new IllegalArgumentException("Tamanho inválido.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }

}
