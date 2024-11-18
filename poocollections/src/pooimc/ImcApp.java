package pooimc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImcApp {

	public static void main(String[] args) {
		List<Pessoa> listaDePessoas = new ArrayList<>(); // esse generics mostra que você só pode add objetos da classe
															// pessoa

		// nesse exemplo faremos com 5 pessoas pq ai é mais facil
		listaDePessoas.add(new Pessoa("João", "Centro", 60, 1.75));
		listaDePessoas.add(new Pessoa("Maria", "Centro", 70, 1.65));
		listaDePessoas.add(new Pessoa("Ana", "Bairro Alto", 50, 1.60));
		listaDePessoas.add(new Pessoa("Carlos", "Centro", 85, 1.80));
		listaDePessoas.add(new Pessoa("Lucia", "Bairro Alto", 90, 1.70));
		
		Scanner sc = new Scanner(System.in);
		
	      System.out.print("\nDigite o bairro para análise: ");
	        String bairroParaAnalise = sc.nextLine();

	        String condicaoMaisFrequente = bairrosPesquisa(listaDePessoas, bairroParaAnalise); // aqui ele pega a lista de pessoas e o bairro pra análise dentro do método
	        System.out.println("A maioria das pessoas do bairro " + bairroParaAnalise + " está: " + condicaoMaisFrequente);

	        sc.close();
	    }

	public static String bairrosPesquisa(List<Pessoa> listaDePessoas, String bairro) { // aí tá chamando a lista de
																						// pessoas que tem o atributo
		int abaixoPeso = 0;
		int pesoNormal = 0;
		int acimaPeso = 0;
		int obeso = 0;

		// Contar a condição de peso das pessoas no bairro

		for (Pessoa pessoa : listaDePessoas) { // até não houver mais pessoas na lista de pessoas, aí vc não precisa
												// necessariamente fazer todo aquele
			// trabalho com o indice...

			if (pessoa.getBairro().equalsIgnoreCase(bairro)) { // aqui é se o bairro da pessoa for igual ao bairro
																// listado, independente de ser upper ou
				// lower case.

				String condicao = pessoa.obterCondicao();
				switch (condicao) {
				case "Abaixo do peso":
					abaixoPeso++;
					break;
				case "Peso normal":
					pesoNormal++;
					break;
				case "Acima do peso":
					acimaPeso++;
					break;
				case "Obeso":
					obeso++;
					break;
				}
			}
		}

		// Determinar a condição mais frequente
		if (abaixoPeso > pesoNormal && abaixoPeso > acimaPeso && abaixoPeso > obeso) {
			return "Abaixo do peso";
		} else if (pesoNormal > acimaPeso && pesoNormal > obeso) {
			return "Peso normal";
		} else if (acimaPeso > obeso) {
			return "Acima do peso";
		} else {
			return "Obeso";
		}
	}
}