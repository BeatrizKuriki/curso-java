package application;

import java.util.Locale;
import java.util.Scanner;

import entities.conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		conta conta;
		
		System.out.println("Entre com o número da conta:");
		int num = sc.nextInt();
		System.out.println("Entre com o nome do titular da conta:");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Entre com o número da conta:");
		System.out.println("Deseja fazer depósito inicial? (S/N)");
		char resposta = sc.next().charAt(0);
		if(resposta == 'S') {
			System.out.println("Digite o valor do depósito inicial: R$");
			double depositoInicial = sc.nextDouble();
			conta = new conta(num, nome, depositoInicial);
	}
		else {
			conta = new conta(num, nome);
		}
		
		System.out.println();
		System.out.println("********************************");
		System.out.println("DADOS DA CONTA:");
		System.out.println(conta);
		System.out.println("********************************");
		System.out.print("Entre com valor do depósito: R$");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("********************************");
		System.out.println("SALDO ATUALIZADO DA CONTA:");
		System.out.println(conta);
		System.out.println("********************************");
		System.out.println("Entre com valor do saque: R$");
		double valorSaque = sc.nextDouble();
		conta.sacar(valorSaque);
		System.out.println("********************************");
		System.out.println("SALDO ATUALIZADO DA CONTA:");
		System.out.println(conta);
		System.out.println("********************************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
