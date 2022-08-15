package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Converter;

public class Program {

	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	System.out.println("Qual o preço do dólar?");
	Converter.dollar = sc.nextDouble() ;
	System.out.println("Quantos dólares você deseja comprar?");
	Converter.quantity = sc.nextDouble();
	System.out.println("O valor a ser paga com IOF é de: R$" + Converter.amountPaid());
	
	
		
	}

}
