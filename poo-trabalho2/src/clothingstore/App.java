package clothingstore;

public class App {

	public static void main(String[] args) {
		  Item[] itens = new Item[5];

	        itens[0] = new Acessorio("Legging", 10, 2, 20); // descrição, quantia, estoque mínimo e estoqaue máximo
	        itens[1] = new RoupaTamanhoUnico("Vestido", 5, 1, 10);
	        itens[2] = new RoupaPMG("Camisa Polo", 5, 3, 2, 1, 15);
	        itens[3] = new Acessorio("Pulseira", 8, 3, 20);
	        itens[4] = new RoupaTamanhoUnico("Saída de Praia", 4, 1, 10);
	}

}
