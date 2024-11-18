package collectioncar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarroApp {
	
    private static final List<Carro> listaDeCarros = new ArrayList<>();
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int opc =0;
		
		while(opc!=5) {
			  System.out.println("\nMENU:");
	            System.out.println("1. Inserir carro");
	            System.out.println("2. Listar carros por preço");
	            System.out.println("3. Listar carros por marca");
	            System.out.println("4. Buscar carro");
	            System.out.println("5. Sair");
	            System.out.print("Escolha uma opção: ");
	            opc = sc.nextInt();
		}

	}

}
