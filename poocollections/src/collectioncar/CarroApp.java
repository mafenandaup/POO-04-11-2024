package collectioncar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarroApp {

	private static final List<Carro> listaDeCarros = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opc = 0;

		while (opc != 5) {
			System.out.println("\nMENU:");
			System.out.println("1. Inserir carro");
			System.out.println("2. Listar carros por preço");
			System.out.println("3. Listar carros por marca");
			System.out.println("4. Buscar carro");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			opc = sc.nextInt();

			if (opc > 5 || opc < 1) {
				System.out.println("Por favor, insira uma opção válida.");
			} else if (opc == 1) {
				insertCar(sc);
			} else if (opc == 2) {
				CarsPerPrice(sc);
			}else if (opc == 3) {
				CarsPerBrand(sc);
			}else if (opc == 4) {
				SearchForCar(sc);
			}
		}
	}

	private static void insertCar(Scanner sc) {
		System.out.print("Marca: ");
		String marca = sc.nextLine();

		System.out.print("Ano: "); // nesse métodos, ele escaneia cada um dos atributos.
		int ano = sc.nextInt();

		System.out.print("Cor: ");
		String cor = sc.nextLine();

		System.out.print("Preço: ");
		double preco = sc.nextDouble();

		listaDeCarros.add(new Carro(marca, ano, cor, preco)); // aqui você adiciona um novo elemento a lista, com cada
																// atributo pertencente à classe carro.
		System.out.println("Carro inserido com sucesso!");
	}

	private static void  CarsPerPrice(Scanner sc) {
		System.out.print("Informe o preço máximo que você pode gastar: ");
		double precoMaximo = sc.nextDouble();

		System.out.println("Carros com preço igual ou menor que " + precoMaximo + ":");
		listaDeCarros.stream().filter(carro -> carro.getPreco() <= precoMaximo)
				// Filtra carros com preço <= precoMaximo ou seja: os unicos que permanecem no
				// stream são os carros que tem o preço menor que o preço máx.
				.map(carro -> "Nome: " + carro.getMarca() + ", Preço: " + carro.getPreco()) // Transformar em string  formatada
				.forEach(System.out::println); // Imprime os carros filtrados

	}
	
	private static void CarsPerBrand(Scanner sc) {
		
	}
	
	private static void SearchForCar(Scanner sc) {
		
	}

}
