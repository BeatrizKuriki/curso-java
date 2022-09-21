package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
		
	}
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Integer getHours() {
		return hours;
	}
	
	/*
	 * AQUI ESTAMOS IMPLEMENTANDO O CONCEITO DE DELEGAÇÃO
	 * QUEM É RESPONSÁVEL POR SABER O VALOR TOTAL DO CONTRATO? TEM QUE SER A 
	 * PRÓPRIA CLASSE CONTRATO E NÃO A CLASSE TRABALHADOR
	 */
	public double totalValue() {
		return valuePerHour * hours;
	}

}
