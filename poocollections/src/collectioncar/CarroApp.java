package collectioncar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarroApp {

    private static final List<Carro> listaDeCarros = new ArrayList<>(); // lista de carros

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco;
        String marca, cor;
        int ano;
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
            sc.nextLine(); 

            switch (opc) {
                case 1:
                    insertCar(sc);
                    break;
                case 2:
                    System.out.print("Preço: ");
                    preco = sc.nextDouble();
                    sc.nextLine(); 
                    carsPerPrice(preco);
                    break;
                case 3:
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    carsPerBrand(marca);
                    break;
                case 4:
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                    System.out.print("Ano: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Cor: ");
                    cor = sc.nextLine();
                    searchForCar(marca, ano, cor);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close(); 
    }

    public static void insertCar(Scanner sc) {
        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Ano: ");
        int ano = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Cor: ");
        String cor = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        sc.nextLine(); 

        Carro c = new Carro(marca, ano, cor, preco); // Criar novo carro
        listaDeCarros.add(c); // Adicionar à lista
        System.out.println("Carro inserido com sucesso!");
    }

    public static void carsPerPrice(double preco) {
        boolean encontrado = false;
        for (Carro carro : listaDeCarros) {
            if (carro.getPreco() <= preco) {
                System.out.println(carro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum carro encontrado com preço igual ou menor que " + preco);
        }
    }

    public static void carsPerBrand(String marca) {
        boolean encontrado = false;
        for (Carro carro : listaDeCarros) {
            if (carro.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(carro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum carro encontrado da marca " + marca);
        }
    }

    public static void searchForCar(String marca, int ano, String cor) {
        for (Carro carro : listaDeCarros) {
            if (carro.getMarca().equalsIgnoreCase(marca) && carro.getAno() == ano && carro.getCor().equalsIgnoreCase(cor)) {
                System.out.println("Carro encontrado: " + carro);
                return;
            }
        }
        System.out.println("Nenhum carro encontrado com as características especificadas.");
    }
}
