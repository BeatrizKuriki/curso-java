package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double maior = 0;
		int posicaoMaior = 0;

		System.out.println("Quantos números deseja ler?");
		n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número na posição nº " + i);
			vect[i] = sc.nextDouble();
			if (vect[i] > maior) {
				maior = vect[i];
				posicaoMaior = i;
			}

		}
	
			
		System.out.println("O maior número é: " + maior);
		System.out.println("A posição do maior número do vetor é a de nº: " + posicaoMaior);
		}

		

	}


