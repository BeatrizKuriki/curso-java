package application;

import java.util.Scanner;

import entities.Numeros;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=0;
		
		
		System.out.println("Quantos números deseja armazenar?");
	    n= sc.nextInt();
	    Numeros [] vect = new Numeros[n];
	    
	    for(int i=0; i<vect.length; i++) {
	    	sc.nextLine();
	    	
	    	
	    	System.out.println("Digite um número:");
	    	int num = sc.nextInt();	    
	    	vect[i] = new Numeros(num);
	    		    	
	    	}
	    
	    for(int i=0; i<vect.length; i++) {
	    	if(vect[i].getNum() < 0) {
	    		
	    		System.out.println("Os números negativos são: "+ vect[i].getNum());
	    	}
	    
	    	sc.close();
	    }
		

		
		
		
	}

}
