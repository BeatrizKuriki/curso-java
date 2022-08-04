import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Construa um programa que leia dois números e pergunte ao usuário qual operação
		 * ele deseja executar: soma, subtração, multiplicação ou divisão. Após a operação o 
		 * programa deve exibir o resultado do processamento.
		 * 
		 * */
		Scanner  sc = new Scanner(System.in);
		int num1=0, num2=0, opcao;
		
		do {
			System.out.printf("\n1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao\n0 - Sair\n\n");
			opcao = sc.nextInt();
			
			if(opcao > 0 && opcao < 5) {
				System.out.println("Digite um número:");
				num1 = sc.nextInt();
				System.out.println("Digite outro número:");
				num2 = sc.nextInt();
			}
			
			switch(opcao) {
			case 0:
				System.out.println("Saindo....");
				break;
				
			case 1:
				System.out.printf("Soma:%d\n", num1+num2);
				break;
				
			case 2:
				System.out.printf("Subtracao: %d\n", num1 - num2);
				break;
				
			case 3:
				System.out.printf("Multiplicação: %d\n", num1 * num2);
				break;
				
			case 4:
				System.out.printf("Divisão: %d\n", num1 / num2);
				break;
				
			
	
			}
		}while (opcao != 0);
		}
		
		
	
		
		

	}


