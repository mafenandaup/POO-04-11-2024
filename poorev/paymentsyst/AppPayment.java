package paymentsyst;

public class AppPayment {

	public static void main(String[] args) {
		Funcionario func = new Funcionario ("Maria", 3000); 
		Freelancer freela = new Freelancer("Jonas", 500);
		Terceirizado pj = new Terceirizado ("Wilson" , 2000, 4);
		
		System.out.println("BOOKING DOS TRABALHADORES:");
		System.out.println(" ");
		System.out.println(func.toString());
		System.out.println(freela.toString());
		System.out.println(pj.toString());
		System.out.println("SALÁRIO ATUALIZADO DO " +pj.getNome()+ "; "+pj.calcPayment());

	}

}
