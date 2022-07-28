import java.util.Scanner;


public class exercicio6 {

	public static void main(String[] args) {
		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem 
		 * dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
		 * este valor se encontra. Obviamente se o valor não estiver em 
		 * 		nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/
		
		Scanner ler = new Scanner(System.in);
		int x;
		System.out.println("Escreva um número entre 0 e 100:");
		x = ler.nextInt();
		if (x >= 0 && x < 25) {
			System.out.println("O número digitado encontra-se no intervalo compreendido entre 0 e 25!");
		}else if(x >= 25 && x < 50) {
			System.out.println("O número digitado encontra-se no intervalo compreendido entre 25 e 50!");
		}else if (x >= 50 && x < 75) {
			System.out.println("O número digitado encontra-se no intervalo compreendido entre 50 e 75!");
		}else if(x >= 75 && x < 101) {
			System.out.println("O número digitado encontra-se no intervalo compreendido entre 75 e 100!");
		}else {
			System.out.println("O número digitado encontra-se fora do intervalo!");
		}
		
		
		
		
		
		ler.close();

		
		
	}

}
