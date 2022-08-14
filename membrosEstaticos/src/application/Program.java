package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	

		public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
	
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		//quando uso métodos estáticos não há necessidade de instanciar um objeto para classe, vc apenas usa a classe para fazer a chamada do método
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		sc.close();
		}
	
}
