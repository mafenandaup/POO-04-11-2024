package paymentsyst;

public class Freelancer extends Trabalhador{
	
	protected double valorproj;

	public Freelancer(String nome, double salario) {
		super(nome, salario);
		this.salario = valorproj;
	}

	@Override
	public double calcPayment() {
		return valorproj;
	}
	
	public String toString(){
		return ("NOME; " +nome+ ". VALOR DO PROJETO; R$"+valorproj);
		
	}

}
