package pooreview;

public class ManageImpostosRenda {

	private double total;

	public void Add(Tributavel t) { // recebe um objeto tributavel T como parâmetro
		this.total = +t.calculaTributos();

	}

	public double getTotal() {
		return total;
	}

}
