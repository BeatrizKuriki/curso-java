import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// ESCREVA UM PROGRAMA QUE REPITA A LEITURA DE UMA SENHA ATÉ QUE ELA SEJA VÁLIDA
		//CONSIDERE COMO SENHA CORRETA O VALOR 2002
		Scanner sc = new Scanner(System.in);
		int senha = 2002;
		
		System.out.println("Informe a senha:");
		senha = sc.nextInt();
		
		while(senha != 2002) {
					
			System.out.println("Senha incorreta! Digite novamente");
			senha = sc.nextInt();
			
		}
		System.out.println("Acesso permitido!!");
		sc.close();
	
	}
}
