import java.util.Scanner;
import java.util.Locale;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Digite quantos testes deseja fazer:");
		num = sc.nextInt();
		
		for(int i =0; i<num; i++);{
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a*2.0 + b*3.0 + c* 5.0)/10.0;
			System.out.printf("A media ponderada dos numeros é igual a: %.1f%n", media);
			
		}
			sc.close();
				
			}
		

	}


