import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo 
		 * que o mesmo pode começar em um dia e terminar em outro, 
		 * tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		Scanner ler = new Scanner(System.in);
		int horaInicial, horaFinal, totHoras;
		System.out.println("Digite o horário que você começou a jogar:");
		horaInicial = ler.nextInt();
		System.out.println("Digite o horário que você terminou de jogar:");
		horaFinal = ler.nextInt();
		
		if (horaInicial < horaFinal) {
			totHoras = horaFinal - horaInicial;
			System.out.println("O jogo durou " + totHoras +"horas!!");
		}
		else {
			totHoras= 24 - horaInicial + horaFinal;
			System.out.println("O jogo durou " + totHoras +"horas!!");
		}
		
		
		
		
		ler.close();

	}

}
