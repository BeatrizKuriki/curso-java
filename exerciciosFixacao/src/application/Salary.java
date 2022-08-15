package application;
import java.util.Locale;
import java.util.Scanner;

import pessoas.Employee;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Employee emp = new Employee();
		
		System.out.println("Digite o nome do funcionário");
		emp.name =sc.nextLine();
		System.out.println("Digite o salário bruto do funcionário: $");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Qual o valor do desconto?");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + emp);
		System.out.println();
		System.out.print("Qual a porcentagem de aumento? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		System.out.println();
		System.out.println("Atualizando: " + emp);
		

		
		
		
		sc.close();
	}

}
