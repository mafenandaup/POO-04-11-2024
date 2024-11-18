package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class listexample {

	// aqui são os exemplos com LIST
	public static void main(String[] args) {
		List lista = new ArrayList();
		String nome;
		lista.add("Asdrubal");
		lista.add("Robervalda");
		lista.add("Florisbella");
		lista.remove("Robervalda");

		for (int i = 0; i < lista.size(); i++) {
			nome = (String) lista.get(i); // aqui ele somente aceita se fizer o cast para string
			// nome = lista.get(i); não funcionaria
			System.out.println(nome);
		}
		System.out.println(" ");
		System.out.println("*ORDENADO");
		System.out.println(" ");

		// ORDENAÇÃO COM LISTAS
		// A classe Collections fornece um método estático sort , que recebe um List
		// como argumento e o
		// ordena por ordem crescente.

		Collections.sort(lista);
		for (int i = 0; i < lista.size(); i++) {
			nome = (String) lista.get(i);
			System.out.println(nome);
		}

		// EXEMPLO COM SET (SAÍDA NÃO TEM ORDEM GARANTIDA)
		Set<String> conjunto = new HashSet<>(); // não precisa fazer casting pq já define como string no inicio, com
												// generics
		// com o uso de generics você não pode add outro elemento que não seja string
		conjunto.add("Java");
		conjunto.add("Python");
		conjunto.add("Java"); // Ignorado, pois já existe

		System.out.println("Conteúdo do do set: " + conjunto);
		// A ordem dos elementos no HashSet não é previsível,
		// mas pode ser preservada em outras implementações de Set, como LinkedHashSet.

		// EXEMPLO COM MAP: MAPEIA PARES CHAVE-VALOR

		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "Java");
		mapa.put(2, "Python");
		mapa.put(1, "C++"); // Substitui o valor associado à chave 1

		System.out.println("Conteúdo do mapa: " + mapa);
		System.out.println("Valor da chave 1: " + mapa.get(1)); // Acessa por chave

// FILA PRIORITY QUEUE ; TRABALHA NO ESTILO FIRST IN, FIRST OUT (FIFO); 

		Queue<String> fila = new LinkedList<>();
		fila.add("Primeiro");
		fila.add("Segundo");
		fila.add("Terceiro");

		System.out.println("Fila: " + fila);
		System.out.println("Elemento removido: " + fila.poll()); // Remove o primeiro elemento add na fila
		System.out.println("Fila atualizada: " + fila);

		// COMO USAR O STREAM (LISTA DE ELEENTOS EDITAVEIS)
		List<Integer> numeros = List.of(1, 2, 3, 4, 5);
		numeros.stream().forEach(System.out::println);

// agora utilizando o filter: 
		numeros.stream().filter(n -> n % 2 == 0) // Apenas números pares
				.forEach(System.out::println);

	}

}
