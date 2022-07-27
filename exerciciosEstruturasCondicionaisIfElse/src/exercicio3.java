import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		ordem crescente ou decrescente.*/
		
		Scanner ler = new Scanner(System.in);
		int A, B;
		System.out.println("Informe um número:");
		A = ler.nextInt();
		System.out.println("Informe outro número:");
		B = ler.nextInt();
		if(A%B == 0 || B%A == 0) {
			System.out.println("Os números são múltiplos");
		}else {
			System.out.println("Os números não são múltiplos");
		}
		
		
		
		
		ler.close();

	}

}
