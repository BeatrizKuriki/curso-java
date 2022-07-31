import java.util.Scanner;

public class padaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int paes, broas;
		double valorPao, valorBroa, arrecadacao, poupanca;
		System.out.println("Quantos pães foram vendidos?");
		paes = sc.nextInt();
		System.out.println("Quantas broas foram vendidos?");
		broas = sc.nextInt();
		valorPao = paes * 0.12;
		valorBroa = broas * 1.50;
		arrecadacao = valorPao + valorBroa;
		poupanca = arrecadacao * 0.1;
		System.out.println("Foram vendidos " + paes + " paes e " + broas + " broas");
		System.out.println("O total arrecadado com a venda foi de R$" + arrecadacao);
		System.out.println("O dono da padaria deve guardar na poupança R$" + poupanca);
		
	
		
		sc.close();

	}

}
