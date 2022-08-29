package appliocation;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double media = 0;
		double soma;

		System.out.println("Quantos elementos o vetor terá?");
		n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o elemento na posição nº" + i);
			vect[i] = sc.nextDouble();

		}
		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vect[i];
		}
		media = soma / n;
		  System.out.printf("\nMédia do vetor = %.3f\n",media);
		  System.out.println("Elementos abaixo da média:");

	   
	       for(int i = 0;i<n;i++){	
			if (vect[i] < media) {	
				System.out.printf("%.1f\n",vect[i]);
			
			

		}

	}
     sc.close();
  }
}
