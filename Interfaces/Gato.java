package Interfaces;

public class Gato implements Animal {
	public String nome;
	public int idade;
	public void emitirSom() {
		System.out.println("Miau!");
	}
	
	public void exibeDados() {
		System.out.println("Nome: " +nome);
		System.out.println("Idade: " +idade);
	}
}