import java.util.Scanner;

public class areaTerreno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int largura, comp, area;
		System.out.println("Digite a largura do terreno:");
		largura = sc.nextInt();
		System.out.println("Digite o comprimento do terreno:");
		comp = sc.nextInt();
		area = largura * comp;
		System.out.println("A área do terreno é igual a :" + area + "m2");
		
			
		
		
		
		
		sc.close();

	}

}
