package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	/*
	 * AGORA SÃO COLOCADAS AS ASSOCIAÇÕES
	 */
	private Department department;
	
	/*
	 * Quando você tem uma composição tipo Lista, você não coloca no construtor e 
	 * simplesmente inicia a lista vazia
	 */
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker(){
		
	}
	public Worker(String name,WorkerLevel level, Double baseSalary, Department department ) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;

}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
		
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	/*
	 * VOU PERCORRER O CONTRATOS DESSE FUNCIONARIO E SE O CONTRATO FOR DO MÊS E ANO
	 * QUE EU DESEJO INFORMAÇÃO, ESTES SERÃO SOMADOS A VARIÁVEL LOCAL SOMA
	 */
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract cont : contracts) {
			//peguei a data do contrato e defini como a data do contrato
			cal.setTime(cont.getDate());
			int cont_year = cal.get(Calendar.YEAR);
			//coloca mais 1 pq o mês do calendar começa com zero;
			int cont_month = 1+ cal.get(Calendar.MONTH) ;
			if(year ==cont_year && month ==cont_month) {
				sum += cont.totalValue();
			}
			
			
		}
		return sum;
	}
	
	
	
}
