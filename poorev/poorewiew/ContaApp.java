package pooreview;

public class ContaApp {

	public static void main(String[] args) {
		ContaCorrente contac = new ContaCorrente(5000);
		ContaPoupanca contap = new 	ContaPoupanca(2000);
		contac.Deposito();
		SeguroDeVida segvida = new SeguroDeVida(10000);
		
		System.out.println("SALDO CONTA CORRENTE; " + contac.getSaldo());
		System.out.println("SALDO CONTA POUPANÇA; " + contap.getSaldo());
		System.out.println("TRIBUTOS CONTA CORRENTE (R$): " + contac.calculaTributos());
		System.out.println("TRIBUTOS SEGURO DE VIDA (R$): " + segvida.calculaTributos());

	}

}
