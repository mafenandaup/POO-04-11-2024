package paymentsyst;

public class Funcionario extends Trabalhador{

	public Funcionario(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcPayment() {
		return salario;
	}

}