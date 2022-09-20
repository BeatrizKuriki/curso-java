package matrizExerc;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		int n;

		System.out.println("Digite o número de linhas da matriz");
		m = sc.nextInt();
		System.out.println("Digite o número de colunas da matriz");
		n = sc.nextInt();
		Integer[][] mat = new Integer[m][n];
		System.out.println("Entre com os valores da matriz:");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				mat[i][j] = sc.nextInt();

			}
		}
		System.out.println("-----MATRIZ-----");
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print("[" + mat[i][j] + "]");

			}
			System.out.println();
		}
		System.out.println("Informe qual número deseja buscar na matriz:");
		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição: " + i + "," + j + ": ");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Em cima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Abaixo: " + mat[i + 1][j]);
					}

				}

			}

		}
	}

}
