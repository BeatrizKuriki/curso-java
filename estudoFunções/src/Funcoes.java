import java.util.Scanner;
public class Funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int higher = max(num, num1, num2);
		
		showResult(higher);
		
		
		
		
		
		
		
		
		sc.close();

	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if(y > z && y > x) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
		
	}
	
	public static void showResult(int value) {
		System.out.println("Higher:" + value);
		
	}

}
