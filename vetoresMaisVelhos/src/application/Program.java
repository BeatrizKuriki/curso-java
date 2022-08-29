package application;

import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		int maisVelho=0;
		String nomeMaisVelho;
		System.out.println("Quantas pessoas você vai adicionar?");
		n = sc.nextInt();
		Pessoas[] vect = new Pessoas[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("NOME:");
			String nome = sc.nextLine();
			System.out.println("IDADE:");
			int idade = sc.nextInt();
			vect[i] = new Pessoas(nome, idade);

		}
		nomeMaisVelho=null;
		for (int i = 0; i < n; i++) {
			if(maisVelho<vect[i].getIdade()) {
				maisVelho = vect[i].getIdade();
				nomeMaisVelho = String.valueOf(maisVelho);
				
				
			}
			System.out.println("PESSOA MAIS VELHA:" + nomeMaisVelho);
	
			
		}
		

	}

}
