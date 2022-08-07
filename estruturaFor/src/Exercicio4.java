import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("Digite um número:");
			int num1= sc.nextInt();
			System.out.println("Digite outro número:");
			int num2 = sc.nextInt();
			
			if(num2==0) {
				System.out.println("Divisão impossível");
			}else {
				double divisao = (double)num1/num2;
				System.out.printf("%.1f%n",divisao);
			}
			
			
			
		}
		sc.close();

	}

}
