import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Digite um número inteiro: ");
		num = ler.nextInt();
		if(num >= 0) {
			System.out.println("O número digitado é positivo.");
		}else {
			System.out.println("O número digitado é negativo.");
		}
		
	 
         ler.close();
	}

}
