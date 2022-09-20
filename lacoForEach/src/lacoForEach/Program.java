package lacoForEach;

public class Program {

	public static void main(String[] args) {
		String [] vect = new String[] {"Maria", "João", "Caio", "Stella"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		/*
		 * o for each é uma sintaxe opcional e simplificada para percorrer coleções
		 * coloca o tipo do vetor no caso String dá um apelido nno caso obj coloca dois pontos
		 * e vect
		 * Como se lê o For each: "PARA CADA ELEMENTO OBJ CONTIDO NO VETOR VECT
		 * FAÇA: 
		 * AÍ VOCÊ PODE PEDIR PARA IMPRIMIR OU OUTRA COISA
		 */
		System.out.println("---------------------------------");
		for (String obj : vect) {
			System.out.println(obj);
		}
		int cont =0;
		Integer [] vetor = new Integer[] {2, 4, 7 ,10,5};
		for(Integer obj : vetor) {
			if(obj%2==0) {
				cont++;
			}
			
		}
		System.out.println("A quantidade de pares é igual a : " +cont);
	}

}
