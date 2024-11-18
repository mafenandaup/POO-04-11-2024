package testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
	}
}
