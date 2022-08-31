package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o tamanho da matriz?");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		System.out.println("Entre com o elementos da matriz:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();

			}
		}
		System.out.println("Diagonal Principal");
		for (int i = 0; i < n; i++) {

			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		int negativos =0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
				negativos++;	
				}
			}
		
	}
		sc.close();
		System.out.println("Números negativos = " + negativos);

}
}