import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o número de repetições: ");
		int num = sc.nextInt();
		int soma = 0;
		for (int i  =0; i < num; i++) {		
			int x = sc.nextInt();
			soma = soma + x;
			
			
				
		}
		System.out.println(soma);
		
		
		
		
		sc.close();

	}

}
