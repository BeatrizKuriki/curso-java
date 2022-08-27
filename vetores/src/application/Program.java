package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("Digite a quantidade de alturas que deseja armazenar:");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			
		}
		double soma =0;
		for(int i=0;i<n;i++) {
			soma+=vect[i];
						
		}
		double media = soma/n;
		System.out.printf("A média das alturas informadas é igual a: %.2f%n", media);		

		sc.close();

	}

}
