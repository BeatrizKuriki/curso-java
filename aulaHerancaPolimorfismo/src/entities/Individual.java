package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	
	public Individual() {
		
	}
	

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public double tax() {
		
		
		return 0;
	}

}
