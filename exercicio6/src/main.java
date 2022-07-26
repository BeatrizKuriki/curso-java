import java.util.Scanner;
import java.util.Locale;
public class main {

	public static void main(String[] args) {
		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		//mostre:
			//a) a área do triângulo retângulo que tem A por base e C por altura.
			//b) a área do círculo de raio C. (pi = 3.14159)
			//c) a área do trapézio que tem A e B por bases e C por altura.
			//d) a área do quadrado que tem lado B.
			//e) a área do retângulo que tem lados A e B
		    Locale.setDefault(Locale.US);
		    double A, B, C, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Informe três valores :");
		    A = sc.nextDouble();
		    B = sc.nextDouble();
		    C = sc.nextDouble();
		    areaTrianguloRetangulo = (A * C)/2.0;
		    areaCirculo = 3.14159*(C*C);
		    areaTrapezio = (A+B)/2.0 *C;
		    areaQuadrado = B * B;
		    areaRetangulo = A * B;
		    
		    System.out.printf(" AREA TRIANGULO: %.3f%n", areaTrianguloRetangulo);
			System.out.printf(" AREA CIRCULO: %.3f%n", areaCirculo);
			System.out.printf(" AREA TRAPEZIO: %.3f%n", areaTrapezio);
			System.out.printf("AREA QUADRADO: %.3f%n", areaQuadrado);
			System.out.printf("AREA RETANGULO: %.3f%n", areaRetangulo);
		    
		    
		    		
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    sc.close();

	}

}
