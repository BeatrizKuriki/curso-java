
import java.util.Locale; 

public class exercicios1 {

	public static void main(String[] args) {
		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double measure = 53.234567;
		
		
		System.out.println("Produtos: ");
	    System.out.printf("%s, com o preço de R$ %.2f reais%n ", produto1, preco1);
	    System.out.printf("%s, com o preço de R$ %.2f reais%n ", produto2, preco2);
	    System.out.printf("Record: %d de idade, código %d  e genero: %s, %n ",idade, codigo, genero);
	    System.out.printf(" Medidas com oito espaços decimais: %.8f %n ", measure);
	    System.out.printf(" Rouded (com três espaços decimais): %.3f %n ", measure);
	    Locale.setDefault(Locale.US);
	    System.out.printf(" US decimal point: %.3f%n",measure);
	    
	    
	    
		
		

	}

}
