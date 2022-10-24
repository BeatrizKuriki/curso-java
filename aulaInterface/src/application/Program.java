package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		
		
		
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data:");
		System.out.println("Number : ");
		Integer number = sc.nextInt();
		System.out.println("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.println("Contract value: ");
		Double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		
		
		System.out.println("Enter the number of installmentes: ");
		int N = sc.nextInt();
		
		
		/*
		 * NO CASO ABAIXO QUEM É RESPONSÁVEL POR INJETAR A DEPENDÊNCIA É O PROGRAMA PRINCIPAL E NÃO
		 * A PRÓPRIA CLASSE CONTRACTSERVICE, O CONTROLE FOI INVERTIDO.
		 * A DEPENDÊNCIA FOI INJETADA NO CONSTRUTOR
		 */		
		
		
		ContractService cs = new ContractService(new PaypalService());
		cs.processContract(contract, N);
		System.out.println("Installments: ");
		for(Installment it : contract.getInstallments()) {
			System.out.println(it);
		}
	
		

		
		
		
		sc.close();
	}

}
