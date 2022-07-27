import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número inteiro");
		num = ler.nextInt();
		if(num % 2 == 0) {
			System.out.println("O número " + num + " é par");
		}else {
			System.out.println("O número " + num + " é impar");
		}
		
		
		
		ler.close();
		

	}

}
