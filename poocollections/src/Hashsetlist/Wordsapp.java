package Hashsetlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Wordsapp {

	public static void main(String[] args) {
		Set<String> palavras = new HashSet<>();
		
		Scanner sc= new Scanner(System.in);

		palavras.add("ovo");
		palavras.add("palhaço");
		palavras.add("vida");
		palavras.add("triste");
		palavras.add("flor");
		palavras.add("flor"); // é ignorada pois já existe
		palavras.add("Flor"); // Substitui a outra palavra, portanto as listas não são case-sensitive

		System.out.println("\nPalavras inseridas:");
		for (String palavra : palavras) { // o string palavra é a variável q tá dentro do parênteses
			// já o conjunto SET se chama "palavras.
			System.out.println(palavra);
		}
		
		  System.out.print("\nDigite uma palavra para verificar se já foi inserida: ");
	        String verificar = sc.nextLine().trim();
	        if (palavras.contains(verificar)) {
	            System.out.println("A palavra '" + verificar + "' já foi inserida.");
	        } else {
	            System.out.println("A palavra '" + verificar + "' não foi inserida.");
	        }
	        
	        List<String> palavrasOrdenadas = new ArrayList<>(palavras); // pra indicar que a lista tem os mesmos itens
	        // do que a lista de palavras
	        Collections.sort(palavrasOrdenadas);

	        System.out.println("\nPalavras em ordem alfabética:");
	        for (String palavra : palavrasOrdenadas) {
	            System.out.println(palavra);
	        }

	        sc.close();
	    }
	}