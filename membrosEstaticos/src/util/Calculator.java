package util;

public class Calculator {

	public  final double PI = 3.14159; //quando vc cria uma constante em java ela tera o nome UPPERCASE se for mais de um separa com _
	//a palavra FINAL serve para indicar que é uma constante;
	
	public  double circumference(double radius) {
		return 2.0 * PI * radius;
		}
		
    public  double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;

	}

}
