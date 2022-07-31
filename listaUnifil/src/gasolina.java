import java.util.Scanner;

public class gasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x, precoGas, litros;
		System.out.println("Quantos reais de gasolina você colocou no seu carro? R$");
		x = sc.nextDouble();
		System.out.println("Qual o preço da gasolina por litro? R$");
		precoGas = sc.nextDouble();
		litros = x / precoGas;
		System.out.println("Você conseguiu colocar " + litros + " litros");
		
		
		
		sc.close();
		
		
		

	}

}
