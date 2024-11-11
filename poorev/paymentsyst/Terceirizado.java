package paymentsyst;

public class Terceirizado extends Trabalhador{
	
	protected int horasextra;

	public Terceirizado(String nome, double salario, int horasextra) {
		super(nome, salario);
		this.horasextra = horasextra;
	}

	@Override
	public double calcPayment() {
		return salario + ((0.1 *salario) * horasextra);
	}

}
