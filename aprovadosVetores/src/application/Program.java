package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serão inseridos?");
		int n = sc.nextInt();
		Alunos[] vect = new Alunos[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Nome do:" + i + "º Aluno");
			String nome = sc.nextLine();
			System.out.println("Digite a primeira nota do:" + i + "ºAluno");
			double nota1 = sc.nextDouble();
			System.out.println("Digite a segunda nota:" + i + "ºAluno");
			double nota2 = sc.nextDouble();
			vect[i] = new Alunos(nome, nota1, nota2);

		}
		double media = 0;
		System.out.println("Alunos Aprovados:");
		for (int i = 0; i < n; i++) {
			media = (vect[i].getPrimeiraNota() + vect[i].getSegundaNota()) / 2;
			if (media >= 6.0) {
				
				System.out.println(vect[i].getNome());
			}
			

		}

		sc.close();
	}

}
