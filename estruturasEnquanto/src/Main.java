import java.util.Scanner;

/* É uma estrutura de controle que  repete um bloco de comandos enquanto uma condição for verdadeira.
 * Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.
 * exemplo : faça um programa que lê números até que um dos números digitados seja zero, ao final mostre a soma dos numeros
 * */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		while(x !=0) {
			soma += x;
			x=sc.nextInt();
			
		}
		System.out.println("A soma dos números é igual a :"+soma);
		
		
		
		
		
		sc.close();

	}

}
