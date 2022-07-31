import java.util.Scanner;

public class precoQuilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double prato, valor;
		System.out.println("Qual o peso do prato do cliente?");
		prato = sc.nextDouble();
		valor = prato * 12;
		System.out.println("O valor a pagar é : R$" + valor);
		
		
		
		
		sc.close();

	}

}
