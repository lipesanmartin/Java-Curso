package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
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
		double tax;
		if (getAnualIncome() < 20000) {
			tax = getAnualIncome() * 0.15;
		} else {
			tax = getAnualIncome() * 0.25;
		}
		if (healthExpenditures > 0) {
			tax = tax - (healthExpenditures * 0.5);
		}
		return tax;
	}

}
