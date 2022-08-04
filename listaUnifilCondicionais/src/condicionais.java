import java.util.Scanner;

public class condicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kWh;
		
		double precoR = 0;
		double precoI = 0;
		double precoC = 0;

		System.out.println("Qual a quantidade de KWH gasta?");
		kWh = sc.nextInt();
		System.out.println("Instalação:");
		System.out.println("R- residencial");
		
		if (kWh <= 500) {
			precoR = kWh * 0.40;
			System.out.println(" O valor a ser pago é de: R$ " + precoR);
		} else if (kWh > 500) {
			precoR = kWh * 0.65;
			System.out.println(" O valor a ser pago é de: R$ " + precoR);
		}

		System.out.println("I- industrial");
		
		if (kWh <= 1000) {
			precoI = kWh * 0.55;
			System.out.println(" O valor a ser pago é de: R$ " + precoI);
		} else if (kWh > 1000) {
			precoI = kWh * 0.60;
			System.out.println(" O valor a ser pago é de: R$ " + precoI);
		}
		System.out.println("C- comercial");
		
		if (kWh <= 5000) {
			precoI = kWh * 0.55;
			System.out.println(" O valor a ser pago é de: R$ " + precoC);
		} else if (kWh > 5000) {
			precoI = kWh * 0.60;
			System.out.println(" O valor a ser pago é de: R$ " + precoC);
		}

	}

}
