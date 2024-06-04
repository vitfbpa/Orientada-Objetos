package Interfaces;

public class Cachorro implements Animal {
	public String nome;
	public int idade;
	public void emitirSom() {
		System.out.println("Au au!");
		System.out.println("Constante: " +constante);
	}
	
	public void cuidarPatio() {
		System.out.println("Estou cuidando do pátio!");
	}
	@Override
	public void exibeDados() {
		System.out.println("Nome: " +nome);
		System.out.println("Idade: " +idade);
	}
}
