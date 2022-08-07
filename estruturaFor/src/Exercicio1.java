import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		// Leia um valor inteiro X(entre 1 e 1000) e mostre os número impares do intervalo
		Scanner sc = new Scanner(System.in);
		int num;
		int impar = 0;
		System.out.println("Digite um número entre 1 e 1000:");
		num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			
			if(i % 2 !=0) {
				System.out.println(i);
			}
			
			
		}
		sc.close();

	}

}
