package Zoologico;

public class Herviboro extends Animal {
	public Herviboro() {
		super();
	}
	public Herviboro(int age, double height, String name, String genero) {
		super(age, height, name, genero);
	}
	
	public String toString() {
		return "Comportamientos: " + super.getComportamientos() + super.toString();
	}
		

	@Override
	public void mostrar() {
		System.out.println("\nNombre del Animal: " + getName() +  "\n" + "Edad del Animal: " + getAge() + "\n" + "Altura del Animal: " + getHeight() + "\n" +  "Genero del animal: " + getGenero() +  "\n");
	}
	@Override
	public void setComportamiento(String Comportamiento) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getComportamiento() {
		// TODO Auto-generated method stub
		return null;
	}
}