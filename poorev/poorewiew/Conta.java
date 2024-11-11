package pooreview;

import java.util.Scanner;

public class Conta {

    protected double saldo;
    private Scanner sc = new Scanner(System.in);

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double Deposito() {
        System.out.println("Quanto de cachê deseja adicionar?");
        double quantiadd = sc.nextDouble();
        saldo += quantiadd;  // Corrigido o uso do +=
        return saldo;
    }

    public double Saque() {
        System.out.println("Quanto de cachê deseja remover?");
        double quantirem = sc.nextDouble();
        if (quantirem <= saldo) {
            saldo -= quantirem; 
        } else {
            System.out.println("O seu saque é maior que a quantia de dinheiro em sua conta. Tente novamente.");
        }
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }
