package paymentsyst;

public abstract class Trabalhador {
	protected String nome;
	protected double salario;
	
	public Trabalhador(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public abstract double calcPayment();
	
	public String getNome() {
		return nome;
	}
}
