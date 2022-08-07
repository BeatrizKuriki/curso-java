import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num =sc.nextInt();
		int fatorial = 1;
		for(int i=1; i<=num; i++) {
			fatorial = fatorial * i;
			
			
		}
		System.out.println(fatorial);
		sc.close();
	}

}
