package clothingstore;

import java.util.Scanner;

public class Acessorio extends Peca implements Item {

	public Acessorio(String descricao, int quantidade, int estoque_min, int estoque_max) {
		super(descricao, quantidade, estoque_min, estoque_max);
	}

	@Override
	public void Venda() {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Digite a quantidade vendida de " + descricao + ": ");
	        int quantidadeVendida = sc.nextInt();

	        if (quantidadeVendida > quantidade) {
	            System.out.println("Venda não realizada. Estoque insuficiente.");
	        } else {
	            quantidade -= quantidadeVendida;
            System.out.println("Venda realizada. Estoque atual de " + descricao + ": " + quantidade+ " itens disponíveis.");
	        }
	    }
	}
