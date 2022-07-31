import java.util.Scanner;

public class diasDeVida {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		String nome;
		int diasVida, idade;
		System.out.println("Digite seu nome:");
		nome = sc.nextLine();
		System.out.println("Digite sua idade");
		idade = sc.nextInt();
		diasVida = idade * 365;
		System.out.println( nome + "você já viveu " + diasVida + " dias de vida");
		
		
		
		
		
		
		
		
		sc.close();

	}

}
