import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		
		int codPeca1, codPeca2, qtdPeca1, qtdPeca2;
		double valorUnitarioPeca1, valorUnitarioPeca2, pagamento;
		Scanner sc = new Scanner(System.in);
		System.out.println("Infome o código da saia lápis :");
		codPeca1 = sc.nextInt();
		System.out.println("Qual a quantidade de saias lápis? ");
		qtdPeca1 = sc.nextInt();
		System.out.println("Informe o preço da saia R$:");
		valorUnitarioPeca1 = sc.nextDouble();
		System.out.println("Infome o código do vestido midi preto :");
		codPeca2 = sc.nextInt();
		System.out.println("Qual a quantidade de vestidos midi pretos? ");
		qtdPeca2 = sc.nextInt();
		System.out.println("Informe o preço do vestido midi preto R$:");
		valorUnitarioPeca2 = sc.nextDouble();
		pagamento = (valorUnitarioPeca1 * qtdPeca1) + (valorUnitarioPeca2* qtdPeca2);
		System.out.printf("O valor a ser pago pela compra da saia lápis e do vestido midi preto é igual a R$ %.2f%n ",  pagamento);
		
		
		
		
		
		sc.close();
		
		
		

	}

}
