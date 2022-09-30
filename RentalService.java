package model.services;

import model.entities.CarRental;

public class RentalService {
	
	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxService taxService;
	
	public RentalService() {
		
	}

	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
	}

}
