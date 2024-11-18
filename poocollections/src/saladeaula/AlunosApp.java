package saladeaula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunosApp {

	public static void main(String[] args) {
		List<Aluno> students = new ArrayList<>();

		students.add(new Aluno("Jonas", 123, 6.7));
		students.add(new Aluno("Joao", 214, 6));
		students.add(new Aluno("Willem", 702, 7));
		students.add(new Aluno("Merlins", 190, 9.0));
		students.add(new Aluno("Melissa", 198, 5));
		students.add(new Aluno("Maria", 357, 3));

		int opc;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nMENU:");
			System.out.println("1. Mostrar alunos");
			System.out.println("2. Buscar aluno pelo nome");
			System.out.println("3. Remover aluno pela matrícula");
			System.out.println("4. Sair");
			System.out.print("Escolha uma opção: ");
			opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {
			case 1:
				showStudents(students);
				break;
			case 2:
				System.out.println("insira o nome do aluno que deseja encontrar: ");
				String nome = sc.nextLine();
				searchByName(students, nome);
				break;
			case 3:

				break;
			case 4:
				System.out.println("Saindo...");
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opc != 4);

		sc.close();
	}

	public static void showStudents(List<Aluno> students) {
		System.out.println("\nLista de alunos:");
		for (Aluno aluno : students) {
			System.out.println(aluno); // toString é chamado implicitamente
		}

	}

	public static void searchByName(List<Aluno> students, String nome) {
		boolean encontrado = false;
		for (Aluno aluno : students) {
			if (aluno.getNome().equalsIgnoreCase(nome)) {
				System.out.println("Aluno encontrado: " + aluno);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Aluno com nome '" + nome + "' não encontrado.");
		}
	}

	public static void removeStudent(List<Aluno> students, int matricula) {
		Aluno removeStudent = null;
		for (Aluno aluno : students) {
			if (aluno.getMatricula() == matricula) {
				removeStudent = aluno;
				break;
			}
		}
		if (removeStudent != null) {
			students.remove(removeStudent);
			System.out.println("Aluno com matrícula " + matricula + " removido com sucesso.");
		} else {
			System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
		}
	}
}
