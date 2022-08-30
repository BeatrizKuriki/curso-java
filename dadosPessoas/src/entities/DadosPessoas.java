package entities;

public class DadosPessoas {
	public double altura;
	public String genero;
	
	//contrutor genérico
	public DadosPessoas() {
		
	}
	
	public DadosPessoas(double Altura, String genero) {
		this.altura = altura;
		this.genero = genero;
	}
	public double getAltura(){
		return altura;
	}
	public void setAltura() {
		this.altura = altura;
	}
	
	public String getGenero() {
		return genero;
	}
	public void  setGenero() {
		this.genero = genero;
	}

}
