import java.util.Scanner;
public class calculoDobro {

	public static void main(String[] args) {
		// faca um  algoritmo que leia um numero inteiro e calcule seu dobro e mostre o resultado
		
		Scanner sc = new Scanner(System.in);
		int num, resultado;
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		resultado = num*2;
		System.out.println("O dobro do número " + num + " é igual a: " + resultado);
		
		sc.close();

	}

}
