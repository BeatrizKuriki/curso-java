package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	/*
	 * foi realizado as associações com a classe  Department e com o a classe HourContract que foi chamada no tipo lista pq o
	 * trabalhador pode ter vários contratos.
	 */
	private Department department;
	
	//INSTANCIAR A LISTA POR PADRÃO NA CLASSE, PQ TODO LISTA TEM QUE SER INSTANCIADA. PQ É UMA COMPOSIÇÃO "TEM-MUITOS"
	//POR ISSO VC INSTANCIA A LISTA VAZIA
	private List<HourContract> contracts = new ArrayList<>();
	
	

	public Worker() {
		
	}


/*
 * na hora de gerar o construtor não pode usar atributos que sejam lista, logo o atributo HourContract foi retirado do construtor
 */
	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		
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


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
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


	
	
	/*
	 * ABAIXO OS MÉTODOS QUE SERÃO ELABORADOS NA CLASSE
	 * O MÉTODO ADDCONTRACT VAI PEGAR A LISTA DE CONTRATOS E ADD O CONTRATO QUE ESTA COMO ARGUMENTO
	 */
	public void addContract(HourContract contract) {
		contracts.add(contract);
		
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		
		double sum = baseSalary;
		
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1+cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
			
			
		}
		return sum;
		
	}
}
