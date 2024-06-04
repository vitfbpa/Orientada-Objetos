package Aula;

public class Cachorro extends Animal {
	String raca;

	@Override
	public void emiteSom() {
		 System.out.println("Au au!");
		 System.out.println("Nome: " +nome);
		 System.out.println("Idade: " +idade);
	}
	public void cuidarPatio() {
		System.out.println("Patio protegido pelo cachorro!");
	}
	
	public void mostrarDados() {
		
	}
}
