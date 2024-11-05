package pooabstract;

public class Gerente extends Funcionario{
	
	protected int pessoas_gerenciadas;

	public Gerente(String nome, double salario, int pessoas_gerenciadas) {
		super(nome, salario);
		this.pessoas_gerenciadas = pessoas_gerenciadas;
	}

	@Override
	public String toString() {
		return "GERENTE: nome:" +this.nome+ ". SALÁRIO: " +this.salario+ ".BONIFICAÇÃO: "+getBonificacao()+". PESSOAS GERENCIADAS:" +pessoas_gerenciadas;
	}

	@Override
	public double getBonificacao() {
		return this.salario*0.20;
	}

	public int getPessoas() {
		return pessoas_gerenciadas;
		
	}
	
}
