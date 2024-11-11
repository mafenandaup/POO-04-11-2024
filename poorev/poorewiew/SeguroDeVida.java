package pooreview;

public class SeguroDeVida implements Tributavel {
	
	protected double valorSegurado;
	
	public SeguroDeVida(double valorSegurado) {
		this.valorSegurado = valorSegurado;
	}

	@Override
	public double calculaTributos() {
		return 42.0;
	}

}
