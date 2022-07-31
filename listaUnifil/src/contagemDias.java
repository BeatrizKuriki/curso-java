import java.util.Scanner;

public class contagemDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mes, dia, ano, qtdDias, diaMes, total;
		
		System.out.println("Digite o mês em que estamos:");
		mes = sc.nextInt();
		System.out.println("Digite o dia do mês:");
		dia = sc.nextInt();
		diaMes = dia - 30;
		qtdDias = (mes *30) + diaMes;
		total=365-qtdDias;
		
		
		System.out.println("Desde o início do ano já se passaram " + qtdDias + "dias");
		
		
		
		
		
		sc.close();

	}

}
