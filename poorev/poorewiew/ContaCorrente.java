package pooreview;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos() {
        return saldo =+ saldo* 0.01; 
    }
}

