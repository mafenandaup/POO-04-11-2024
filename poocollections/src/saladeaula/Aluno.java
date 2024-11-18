package saladeaula;

public class Aluno {
	private String nome;
	private int matricula;
	private double notafinal;

	public Aluno(String nome, int matricula, double notafinal) {
		this.nome = nome;
		this.matricula = matricula;
		this.notafinal = notafinal;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public double getNotafinal() {
		return notafinal;
	}

	public String toString() {
		return ("Nome: " + this.nome + " . Matrícula: " + this.matricula + ". Nota final: " + this.notafinal);
	}
}
