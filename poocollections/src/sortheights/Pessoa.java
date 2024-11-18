package sortheights;

public class Pessoa implements Comparable<Pessoa> { // o comparable é implementado para comparar a diferentes objetos da
													// mesma classe

	protected String nome;
	protected double altura;

	public Pessoa(String nome, double altura) {
		this.nome = nome;
		this.altura = altura;
	}

    // Método compareTo
    public int compareTo(Pessoa p) {
        if (this.altura < p.getAltura()) {
            return -1; // "this" é menor que "p"
        } // compara o obj selecionado a um qualquer
        if (this.altura > p.getAltura()) {
            return 1; // "this" é maior que "p"
        }
        return 0; // Se são iguais
    }

	public double getAltura() {
		return altura;
	}
	
	@Override
	public String toString() {
	    return nome + " (" + altura + "m)";
	}


}