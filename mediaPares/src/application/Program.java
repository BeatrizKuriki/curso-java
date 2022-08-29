package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int soma;
		int media=0;
		int par;

		System.out.println("Quantos elementos terá o vetor?");
		n = sc.nextInt();
		int [] vect = new int[n];
		for(int i =0; i< n; i++) {
			System.out.println("Digite o elemento posição nº "+i);
			vect[i]=sc.nextInt();
			
		}
		soma =0;
		par =0;
		for (int i=0; i<n;i++) {
			if(vect[i] % 2==0) {
				par+=1;
				soma = soma +vect[i];
			}
		}	
		if(par==0) {
			System.out.println("NENHUM NÚMERO PAR");
		}
		else {
			media = soma/par;
			System.out.printf("A média dos pares = %.1f\n:",media);
			
		}
		
		
		

	}

}
