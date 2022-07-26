import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: "+ x);
		
		
		
		
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: "+ y);

		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou: "+ z);
		
		char genero;
		genero = sc.next().charAt(0);
		System.out.println("Você digitou: "+ genero);
		
		
		sc.close();
		

	}

}
