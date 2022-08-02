import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * FAZER UM PROGRAMA PARA LER UM VALOR INTEIRO DE 1 A 7 REPRESENTANDO OS DIAS DA
		 * SEMANA(SENDO 1= DOMINGO, 2= SEGUNDO E ETC)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int x;
		String dia;
		System.out.println("Digite o número que deseja para saber o dia da semana:");
		x = sc.nextInt();
		switch (x) {
		case 1:
			dia = "domingo";
			break;

		case 2:
			dia = "segunda-feira";
			break;

		case 3:
			dia = "terça-feira";
			break;

		case 4:
			dia = "quarta-feira";
			break;

		case 5:
			dia = "quinta-feira";
			break;

		case 6:
			dia = "sexta-feira";
			break;

		case 7:
			dia = "sábado";
			break;

		default:
			dia = "valor inválido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}
