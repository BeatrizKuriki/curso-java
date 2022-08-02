import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*ESTRUTURA OPCIONAL AO IF-ELSE QUANDO SE DESEJA DECIDIR UM VALOR COM 
		 * BASE EM UMA CONDIÇÃO
		 * SINTAXE:
		 * (condição)? valor_se_verdadeiro : valor_se_falso
		 * ex: (2>4)? 50 : 80 --> 80
		 * ex (10 !=3)? "Maria": "Alex" ---> "Maria"
		 */
		Scanner sc = new Scanner(System.in);
		double preco = 34.5;
		double desconto = (preco < 20.0)? preco * 0.1: preco * 0.05;
		System.out.println(desconto);
		
		sc.close();
	    
		

	}

}
