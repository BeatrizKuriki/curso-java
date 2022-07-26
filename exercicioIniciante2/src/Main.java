import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 double PI = 3.14159;
		
		
		System.out.println("Informe o valor do raio do círculo:");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double areaCirculo = PI*(r*r);
		
	
		System.out.printf("A área do circulo que tem %f\n de raio é igual a %.4f\n : ", r, areaCirculo);
		
		sc.close();

	}

}
