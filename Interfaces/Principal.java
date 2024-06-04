package Interfaces;

public class Principal {
	public static void main(String[] args) {
		Animal cachorro = new Cachorro();
		cachorro.emitirSom();
		
		Animal gato = new Gato();
		gato.emitirSom();
	}
}