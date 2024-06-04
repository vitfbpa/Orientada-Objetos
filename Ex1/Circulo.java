package Ex1;

class Circulo extends Forma {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		return Math.PI * raio * raio;
	}
	
	public double perimetro() {
		return 2 * Math.PI * raio;
	}
}