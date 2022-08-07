import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite a quantidade de valores que deseja ler:");
		num = sc.nextInt();
		int in = 0;
		int out = 0;
			
		
		for(int i=0; i<num; i++) {
			int x = sc.nextInt();
			
			if(x>=10 && x <=20) {
				in = in +1;				
				
			}else {
				out= out +1;
			}
			
		}
		System.out.println("Os números compreendidos entre 10 e 20 são: "+ in);
		System.out.println("Os números compreendidos fora do intervalo entre 10 e 20 são: "+ out);
		
		

	}
	
	
	
	
	

}
