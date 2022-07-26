import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// calcular a diferença do produto
		
		System.out.println("Informe o primeiro número:");
		Scanner sc = new Scanner(System.in);
		int A, B, C,D,dif;
		A = sc.nextInt();
		System.out.println("Informe o segundo número:");
		B = sc.nextInt();
		System.out.println("Informe o terceiro número:");
		C = sc.nextInt();
		System.out.println("Informe o quarto número:");
		D = sc.nextInt();
		dif = A * B -C * D;
		System.out.println("A diferença entre o produto de A*B e o produto de C*D é igual a :" + dif);
		
		
		
		
		
		sc.close();

	}

}
