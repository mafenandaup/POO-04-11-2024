package pooreview;

import java.util.Scanner;

public class Conta {

	Scanner sc = new Scanner(System.in);
	protected double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double Deposito(double saldo) {
		System.out.println("Quanto de cachê deseja adicionar");
		double quantiadd = sc.nextDouble();
		return saldo = +quantiadd;
	}

	public double Saque(double saldo) {
		System.out.println("Quanto de cachê deseja remover?");
		double quantirem = sc.nextDouble();
		if (quantirem <= this.saldo) {
			return saldo = -quantirem;
		} else {
			System.out.println("O seu saque é maior que a quantia de dinheiro em sua conta. tente novamente.");
		}
		return saldo;

	}
}