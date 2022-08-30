package entities;

public class Alunos {
	public String nome;
	public double primeiraNota;
	public double segundaNota;
	
	
	public Alunos() {
		
	}


	//construtor
	public Alunos(String nome, double primeiraNota, double segundaNota) {
		this.nome = nome;
		this.primeiraNota = primeiraNota;
		this.segundaNota = segundaNota;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPrimeiraNota() {
		return primeiraNota;
	}


	public void setPrimeiraNota(double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}


	public double getSegundaNota() {
		return segundaNota;
	}


	public void setSegundaNota(double segundaNota) {
		this.segundaNota = segundaNota;
	}
	

}
