
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		
		System.out.println("Digite o valor do eixo x:");
		x = sc.nextInt();
		System.out.println("Digite o valor do eixo y:");
		y = sc.nextInt();
		
		while(x !=0 && y !=0) {
			if(x > 0 && y > 0) {
			    System.out.println("Quadrante 1");	
			}else if(x > 0 && y < 0 ) {
				System.out.println("Quadrante 4");
			}else if(x < 0 && y > 0) {
				System.out.println("Quadrante 2");
			}else  {
				System.out.println("Quadrante 3");
			}
			x = sc.nextInt();
			y = sc.nextInt();
				
			}
			
			sc.close();
		
				
		
	}
		
		

	}





