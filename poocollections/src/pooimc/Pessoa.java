package pooimc;

public class Pessoa {

	private String nome;
	private String bairro;
	private double peso;
	private double altura;

	public Pessoa(String nome, String bairro, double peso, double altura) {
		this.nome = nome;
		this.bairro = bairro;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public String getBairro() {
		return bairro;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public double calcularIMC() {
		return peso / (altura * altura);
	}

	public String obterCondicao() {
		double imc = calcularIMC();
		if (imc < 18.5) {
			return "Abaixo do peso";
		} else if (imc < 25) {
			return "Peso normal";
		} else if (imc < 30) {
			return "Acima do peso";
		} else {
			return "Obeso";
		}
	}

}
