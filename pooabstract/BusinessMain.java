package pooabstract;

public class BusinessMain {

	public static void main(String[] args) {

		Funcionario[] func = new Funcionario[5];
		func[0] = new Gerente("maria", 1276.66, 2);
		func[1] = new Gerente("fernanda", 3000.0, 6);
		func[2] = new Secretaria("alice", 2300.87, 5);
		func[3] = new Secretaria("joão", 5000.45, 10);
		func[4] = new Secretaria("bento", 1345.65, 5);
		
		 for (int i = 0; i < func.length; i++) {
	            System.out.println(func[i].toString());
	            
	            System.out.println("AUMENTO DO SALÁRIO ATUAL EM REAIS");

	            func[i].aumento(0.05);
	            
	            // Exibe o salário atualizado
	            System.out.println("Salário atualizado: " + func[i].getSalario());
	            System.out.println(" ");
		}
	}

}
