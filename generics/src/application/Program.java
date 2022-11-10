package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values?");
		int n = sc.nextInt();
		
		/*
		 * Por conta do type safety do generics agora depois de instanciar um tipo integer só é possível add inteiros 
		 * caso queira add uma string será necessário instanciar um novo objeto printservice do tipo string
		 */
		
		//ps.addValue("Maria);
		
	
		
		for (int i=0; i< n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		/*
		 * No entanto se vc quiser criar um variável integer e fazê-la receber o Object não será possível, o java
		 * não vai aceitar e vai dizer que não é possível converter object para integer, sendo necessário fazer um casting
		 * também existe o problema de type safety(segurança de tipos) quando usamos o tipo object e também a performance é afetada
		 * Por isso é importante usar o generics!!
		 */
		ps.print();
		System.out.println("First: "+ps.first());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	
	}

}
