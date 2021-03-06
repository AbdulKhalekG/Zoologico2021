package Zoologico;


public class Carnivoro extends Animal {
	public Carnivoro() {
		super();
	}
	public Carnivoro(int age, double d, String name, String genero) {
		super(age, d, name, genero);
	}
	public String toString() {
		return "\n Comportamientos: " + getComportamientos();
	}
	@Override
	public void mostrar() {
		System.out.println("Nombre del Animal: " + this.getName() +  "\n" + "Edad del Animal: " + this.getAge() + "\n" + "Altura del Animal: " + this.getHeight() + "\n" +  "Genero del animal: " + this.getGenero() +  "\n");
	}
	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

}