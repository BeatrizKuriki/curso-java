package application;

import java.util.Scanner;

import entities.Numeros;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Qual o tamanho do vetor?");
		int n=sc.nextInt();
		
		int par =0;
		Numeros[] vect = new Numeros[n];
		
		
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite o número na posição " +i+":");
			int num = sc.nextInt();
			vect[i]= new Numeros(num);			
			
		}
		for(int i=0; i<n; i++) {
			if( vect[i].getNum()%2==0){
				par++;
				
			}
			
				
			}
		System.out.println("Numeros pares:");
		for(int i=0;i<n;i++) {
			if( vect[i].getNum()%2==0){				
				System.out.println(vect[i].getNum());
					
			}		
			
			
		}
		System.out.println("Quantidade de números pares: "+ par);
		
	}

}
