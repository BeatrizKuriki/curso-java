import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*ESTRUTURAS CONDICIONAIS SÃO ESTRUTURAS DE CONTROLE 
		 * QUE PERMITEM DEFINIR QUE UM CERTO BLOCO DE COMANDOS SOMENTE SERÁ EXECUTADO DEPENDENDO DE UMA CONDIÇÃO*/
		
		int x = -10;
		System.out.println("Bom dia!!");
		
		//estrutura condicional simples
		//se a condição for verdadeira ela executa o bloco de comandos se for falsa ela pula o bloco;
		if(x < 0) {
		   System.out.println("Boa tarde!!");
		}
		System.out.println("Boa noite!!");
		
		//estrutura condicional composta
		// V: executa o bloco do IF
		//F: executa o bloco do else
		Scanner sc = new Scanner(System.in);
		int hora;
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		if(hora < 12 ) {
			System.out.println("Olá, tenha uma excelente manhã");
		}else {
			if(hora < 18 ) {
			System.out.println("Boa tarde, já almoçou anjo?");
			}
			else {
				System.out.println("Como foi seu dia? Tenha um ótimo jantar e durma bem!!!");
			}
		
		}
		
		sc.close();

	}

}
