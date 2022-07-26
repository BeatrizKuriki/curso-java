import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//para ler o texto até a quebra de linha, ou seja vc pode escrever várias coisas e só quando apertar enter é que vai para a próxima linha;
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//quebra de linha pendente = 
		
		int x;
		String a1, a2, a3;
		x = sc.nextInt();
		sc.nextLine();
		a1 = sc.nextLine();
		a2 = sc.nextLine();
		a3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(a1);
		System.out.println(b2);
		System.out.println(b3);
/*quando vc usa um comando de leitura diferente do nexLine() e dá alguma quebra de linha, essa quebra de linha fica pendende
 * na entrada padrão.
 * Se você então fizer uma nextLine(),
 * aquela quebra de linha pendente será absorvida pelo nextLine() 
 * SOLUÇÃO: FAÇA UM NEXTLINE() EXTRA ANTES DE FAZER O NEXTLINE() DE SEU INTERESSE 
 */
		sc.close();

	}

}
