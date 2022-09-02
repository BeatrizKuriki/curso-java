package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Jose");
		list.add("Claudio");
		list.add("Stella");
		list.add("Marcos");
		list.add("Murilo");

		list.add(2, "Anderson");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		
		}
		System.out.println("-------------------------------------");
		

		
		//removendo usando predicados usando uma função lambda predicado
		list.removeIf(x  -> x.charAt(0)== 'M');
		
		
		
		
		for (String x : list) {
			System.out.println(x);
		
		}
		System.out.println("--------------------------------");
		System.out.println(list.indexOf("Jose"));
		
		//quando o elemento não existe o retorno é -1
		System.out.println(list.indexOf("Marcos"));
		System.out.println("--------------------------------");
		List<String> resultado = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
		System.out.println(resultado);
		}
	}

	



