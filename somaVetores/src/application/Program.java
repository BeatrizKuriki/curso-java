package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int soma = 0;

		System.out.println("Quantos elementos terá cada vetor?");
		n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o elemento do A posição nº " + i);
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o elemento do vetor B posição nº " + i);
			B[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			C[i] = A[i] +B[i];			
			System.out.println("O resultado do soma entre vetor A e vetor B é igual ao vetor C: "+C[i]);	
	}
		
		

}
}
