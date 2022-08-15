package application;

import java.util.Locale;
import java.util.Scanner;

import pessoas.Aluno;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());
		if (aluno.notaFinal() < 60.0) {
		System.out.println("REPROVADO");
		System.out.printf("ESTÁ FALTANDO %.2f PONTOS%n", aluno.pontosFaltantes());
		}
		else {
		System.out.println("APROVADO!!!");

		

	}

	}
}
