import java.util.Scanner;

public class ferradurasCavalos {

	public static void main(String[] args) {
		// calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras
		Scanner sc = new Scanner(System.in);
		int ferradura, cavalo;
		System.out.println("Quantos cavalos foram comprados?");
		cavalo = sc. nextInt();
		ferradura = cavalo *4;
		
		System.out.println("Foram necessárias " + ferradura + " ferraduras para equipar o cavalos do Haras");
		
		sc.close();

	}

}
