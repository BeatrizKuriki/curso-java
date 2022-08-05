import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao, totAlcool=0, totGasolina=0, totDiesel=0;
		
		System.out.println("1-Alcool 2- Gasolina 3-Diesel 4-Fim");
		opcao = sc.nextInt();
		while(opcao !=4) {
			if(opcao == 1) {
				totAlcool += 1;			
				
			}else if(opcao == 2) {
				totGasolina += 1;
			}else if (opcao == 3) {
				totDiesel += 1;
			
			}
		opcao = sc.nextInt();
			}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + totAlcool);
		System.out.println("Gasolina: " + totGasolina);
		System.out.println("Diesel: " + totDiesel);
		
		sc.close();
		}
		
	}


