package clothingstore;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		  Item[] itens = new Item[5];

	        itens[0] = new Acessorio("Legging", 10, 2, 20); // descrição, quantia, estoque mínimo e estoqaue máximo
	        itens[1] = new RoupaTamanhoUnico("Vestido", 5, 1, 10);
	        itens[2] = new RoupaPMG("Camisa Polo", 5, 3, 2, 1, 15);
	        itens[3] = new Acessorio("Pulseira", 8, 3, 20);
	        itens[4] = new RoupaTamanhoUnico("Saída de Praia", 4, 1, 10);
	        
	        Scanner sc = new Scanner(System.in);
	        int opc = 0;
	        
	        while(opc !=5) {
	        	  try {
	                  System.out.println("\nMENU:");
	                  for (int i = 0; i < itens.length; i++) { // for para todos os itens
	                      System.out.println(i + " - " + itens[i].getDescricao()); // descrição dos itens e número do vetor de cada item.
	                  }
	                  System.out.println("5 - Sair do sistema");
	                  System.out.print("Escolha uma opção: ");
	                  opc = sc.nextInt();

	                  if (opc >= 0 && opc < itens.length) {
	                      itens[opc].Venda();
	                      itens[opc].reposicaoEstoque();
	                  } else if (opc > 5 || opc < 0) {
	                      throw new IllegalArgumentException("Opção inválida. Tente novamente.");
	                  }
	              } catch (IllegalArgumentException e) {
	                  System.out.println("Erro: " + e.getMessage());
	              } catch (Exception e) {
	                  System.out.println("Erro inesperado: " + e.getMessage());
	                  sc.nextLine(); // Limpa entrada inválida
	              }
	          }

	          System.out.println("\nEstoque final:"); // imprime o estoque após finalizar a execução da aplicação
	          for (Item item : itens) {
	              System.out.println(item.getDescricao() + " - Estoque atual: " + ((Peca) item).getQuantidade());
	          }

	          sc.close();
	      }
	  }

