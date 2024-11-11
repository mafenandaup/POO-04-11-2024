package pooreview;

public class SeguroDeVida implements Tributavel {
	
	protected double valorSegurado;
	
	public void SeguroDeVuda(double vlr) {
		this.valorSegurado = vlr;
	}

	@Override
	public double calculaTributos() {
		return 42.0;
	}

}
