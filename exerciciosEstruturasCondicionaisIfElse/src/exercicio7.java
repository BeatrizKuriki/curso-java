import java.util.Locale;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
         de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
         ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
         Se o ponto estiver na origem, escreva a mensagem “Origem”.
         Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
         situação.*/
		double x, y;
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Digite a coordenada x de um ponto em um plano:");
		x = ler.nextDouble();
		System.out.println("Digite a coordenada y de um ponto em um plano:");
		y = ler.nextDouble();
		if (x > 0.0 && y > 0.0) {
			System.out.println("O ponto encontra-se no quadrante Q1");
		}else if(x < 0.0 && y > 0.0) {
			System.out.println("O ponto encontra-se no quadrante Q2");
		}else if(x < 0.0 && y < 0.0) {
			System.out.println("O ponto encontra-se no quadrante Q3");
		}else if(x > 0.0 && y < 0.0) {
			System.out.println("O ponto encontra-se no quadrante Q4");
		}else if(x==0.0 && y==0.0) {
			System.out.println("O ponto encontra-se na origem!");
		}else if (y==0.0) {
			System.out.println("O ponto encontra-se no eixo X!");
			
		}else if(x==0.0) {
			System.out.println("O ponto encontra-se no eixo Y!");
		}
		
		
		
		ler.close();
		

	}

}
