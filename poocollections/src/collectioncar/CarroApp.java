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
			
			if(opc>5 || opc<1) {
				System.out.println("Por favor, insira uma opção válida.");
			}else if (opc == 1) {
				  inserirCarro(sc);
			}
		}
	}

	private static void inserirCarro(Scanner scanner) {
		System.out.print("Marca: ");
		String marca = scanner.nextLine();

		System.out.print("Ano: ");
		int ano = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Cor: ");
		String cor = scanner.nextLine();

		System.out.print("Preço: ");
		double preco = scanner.nextDouble();

		listaDeCarros.add(new Carro(marca, ano, cor, preco));
		System.out.println("Carro inserido com sucesso!");
	}

}
