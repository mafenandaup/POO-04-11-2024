package pooabstract;

public class Secretaria extends Funcionario{
	
	protected int dpts_atendidos;

	public Secretaria(String nome, double salario, int dpts_atendidos) {
		super(nome, salario);
		this.dpts_atendidos = dpts_atendidos;
	}

	@Override
	public String toString() {
		return "GERENTE: nome:" +this.nome+ ". SALÁRIO: " +this.salario+ ".BONIFICAÇÃO: "+getBonificacao()+". DEPARTAMENTOS ATENTIDOS:" +dpts_atendidos;
	}

	@Override
	public double getBonificacao() {
		return this.salario*0.10;
	}
	
	public int getDpts() {
		return dpts_atendidos;
	}

}
