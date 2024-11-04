package pooabstract;

public abstract class Funcionario {

	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public abstract String toString();
	public abstract void getBonificacao();
	
		public void aumento(double valor) {
	        this.salario += valor;
	    }

	    // Métodos getters para acessar os atributos
	    public String getNome() {
	        return nome;
	    }

	    public double getSalario() {
	        return salario;
	    }
	}
