package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {
		/*
		 * INSTANCIAR UMA DATA A PARTIR DE AGORA
		 */
		LocalDate d01 = LocalDate.now();
		
		//
		LocalDateTime d02 = LocalDateTime.now();
		
		//DATA HORA GNT - FUSO HORÁRIO DE LONDRES
		Instant d03 = Instant.now();
		
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-22T17:44:26");
		
		
		
		
		System.out.println(" LOCAL DATE: " +d01);
		System.out.println(" LOCAL DATE TIME "+d02);
		System.out.println(" INSTANT "+d03);
		
		
		System.out.println(" LOCAL DATE TIME: " +d05);

	}

}
