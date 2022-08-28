package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double percentualIdadeMenor16 = 0;
		double media = 0;
		System.out.println("De quantas pessoas deseja inserir dados?");
		n = sc.nextInt();
		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome:");
			String nome = sc.nextLine();
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.println("Digite a altura: ");
			double altura = sc.nextDouble();

			vect[i] = new Pessoa(nome, idade, altura);

		}

		double somaAltura = 0;
		for (int i = 0; i < n; i++) {
			somaAltura += vect[i].getAltura();

		}

		int totalIdadeMenor = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				totalIdadeMenor++;

			}
			media = somaAltura / n;
			percentualIdadeMenor16 = ((double) totalIdadeMenor / n) * 100;

		}
		System.out.printf("\nAltura media = %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualIdadeMenor16);

		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println("Nomes: " + vect[i].getNome());

			}
			sc.close();

		}
	}
}
