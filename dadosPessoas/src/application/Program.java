package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosPessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double maior ;
		double menor ;
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		DadosPessoas [] vect = new DadosPessoas[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Altura da "+(i+1)+"ª pessoa:");
			double altura = sc.nextDouble();
			System.out.println("Gênero da "+(i+1)+"ª pessoa:");
			String genero = sc.nextLine();
			sc.next();
			vect[i] = new DadosPessoas(altura, genero);
					
				
			}
		maior = vect[0].getAltura();
		menor =	vect[0].getAltura();	
		 for (int i = 1; i < n; i++) {           
	          
	            if (vect[i].getAltura()>maior) {
	            	maior = vect[i].getAltura();
	            }
	            if (vect[i].getAltura() < menor) {
	                menor = vect[i].getAltura();
	            }
	           
			
		}
		System.out.println("Maior Altura: "+ maior);
		System.out.println("Maior Altura: "+ menor);
		

	}

}
