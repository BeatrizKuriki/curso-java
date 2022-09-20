package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Stella");
		list.add("Heitor");
		list.add("Olga");
		list.add("Otávio");
		list.add("Anna");
		list.add("Maria");
		list.add("Marcela");
		list.add("Mateus");
		list.add(2, "João");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("O TAMANHO DA LISTA: "+list.size());
		/*
		 * A LISTA TEM UMA OPERAÇÃO QUE É CAPAZ DE REMOVER UM DADO A PARTIR DA 
		 * COMPARAÇÃO DO VALOR DO DADO QUE FOI SOLICITADO A REMOÇÃO COM O OUTRO DADO
		 * DENTRO DA LISTA
		 */
		
		
		/*
		 * COMO REMOVER TODOS QUE COMEÇAM COM A LETRA 'O' ...NESSE CASO
		 * UTILIZA-SE O PREDICADO COMO NO EXEMPLO ABAIXO
		 */
		
		System.out.println("--------------------------------------");
		list.remove("Anna");
		list.remove(1);
		list.removeIf(x -> x.charAt(0)== 'O');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Index of Stella:"+ list.indexOf("Stella"));
		/*
		 * QUANDO O INDEXOF NÃO ENCONTRA O ELEMENTO NA LSITA O RETORNO É -1
		 */
		System.out.println("Index of Marco:"+ list.indexOf("Marco"));
		System.out.println("--------------------------------------");
		/*
		 * CASO QUEIRA QUE UMA LISTA SÓ COM ELEMENTOS ESPECÍFICOS COMO POR EXEMPLO TODOS QUE COMEÇAM 
		 * COM A LETRA 'S'...É NECESSÁRIO UTILIZAR O LIST.STREAM QUE É UM TIPO ESPECIAL DO JAVA 8 EM DIANTE
		 *  QUE ACEITA OPERAÇÕES COM EXPRESSÕES LAMBDA
		 */
		List <String> result = list.stream().filter(x -> x.charAt(0) =='S').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		/*
		 * COMO ENCONTRAR UM ELEMENTO QUE ATENDA A UM PREDICADO
		 */
		
		System.out.println("--------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0)=='M').findFirst().orElse(null);
		System.out.println(name);
		String name1 = list.stream().filter(x -> x.charAt(0)=='K').findFirst().orElse(null);
		System.out.println(name1);
	}
	

}
