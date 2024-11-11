package pooreview;

import java.util.Scanner;

public class Conta {
	
	Scanner sc = new Scanner(System.in);
	protected double saldo;
	protected String nome;
	protected String accnum;


	public Conta(double saldo, String nome,String accnum) {
		this.saldo = saldo;
		this.nome = nome;
		this.accnum = accnum;
	}
	public  String toString() {
		return this.nome + " (nome); " + this.saldo+ " (saldo); " +this.accnum+ " (numero serial da conta).";
		
	}
	public double Deposito(double saldo) {
		System.out.println("Quanto de cachê deseja adicionar");
		double quantiadd = sc.nextDouble();
		if(quantiadd > 0) {
			saldo = saldo + quantiadd;
			return saldo;
		}
		return saldo;

	}

	public boolean Saque(double saldo) {
		System.out.println("Quanto de cachê deseja remover?");
		double quantirem = sc.nextDouble();
		if (quantirem <= this.saldo) {
			saldo = saldo - quantirem;
			return true;
		} else {
			System.out.println("O seu saque é maior que a quantia de dinheiro em sua conta. tente novamente.");
			return false;
		}

	}
}
