package pooreview;

public class ContaApp {

	public static void main(String[] args) {
		ContaCorrente contac = new ContaCorrente(5000);
		contac.Deposito();
		SeguroDeVida segvida = new SeguroDeVida();
		
		System.out.println("TRIBUTOS CONTA CORRENTE (R$): " + contac.calculaTributos());
		System.out.println("TRIBUTOS CONTA CORRENTE (R$): " + segvida.calculaTributos());

	}

}
