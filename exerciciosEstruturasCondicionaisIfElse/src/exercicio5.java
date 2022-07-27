import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		/* Com base na tabela abaixo, escreva um programa que 
		 * leia o código de um item e a quantidade deste item. A 
		 * seguir, calcule e mostre o valor da conta a pagar.*/
		int cod;
		int qtd;
		double total;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha o código do seu pedido entre as opções abaixo e a quantidade:");
		System.out.println("1- Cachorro Quente");
		System.out.println("2- X-Salada");
		System.out.println("3- X-Bacon");
		System.out.println("4- Torrada simples");
		System.out.println("5- Refrigerante");
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if(cod ==1) {
			total = qtd * 4.0;
		}else if (cod == 2) {
			total = qtd * 4.5; 	
		}else if (cod == 3) {
			total = qtd * 5.0;
		}else if (cod == 4) {
			total = qtd * 2.0;
		}else {
			total = qtd * 1.5;
		}
		System.out.printf("O valor total é R$ %.2f%n", total);
		
		sc.close();
	}

}
