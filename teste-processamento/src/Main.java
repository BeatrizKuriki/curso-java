
public class Main {

	public static void main(String[] args) {
		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b +B)/2.0 * h;
		System.out.println(area);
		
		// boa prática: sempre indique o tipo do número, se a expressão for de ponto flutuante(não inteira)
		//para double use: .0
		//para float use: f
		
		int c, d;
		double resultado;
		 d = 5;
		 c =2;
		 resultado = (double)d/c;
	    System.out.println(resultado);	
	    
	    // o console imprime 2 ao inves de 2.5, pq as variaveis são números inteiros e então o java entende que vc só quer o resultado dos numeros inteiros
	    //para resolver só colocar a palavra double na frente da operação de divisaç de d/c o que é chamado de CASTING que nada mais é do que a conversão explicita dos valores;

	}

}
