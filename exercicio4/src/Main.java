import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// programa que lê o número de identificação de um funcionário, qtde de horas trabalhadas e valor da sua hora, depois mostra qual salário irá receber
		
		Scanner sc = new Scanner(System.in);
		int idFuncionario;
		double horasTrabalhadas, valorHora, salario;
		
		System.out.println("Informe o número de identificação do Funcionário:");
		idFuncionario = sc.nextInt();
		System.out.println("Quantas horas o funcionário trabalha?");
		horasTrabalhadas = sc.nextDouble();
		System.out.println("Qual o valor da hora trabalhada?");
		valorHora = sc.nextDouble();
		salario = horasTrabalhadas * valorHora;
		System.out.println("O número do funcionário é " + idFuncionario);
		System.out.printf("O salário do funcionário é igual a R$ %.2f", salario);
		
		
		
		
		
		
		
		sc.close();

	}

}
