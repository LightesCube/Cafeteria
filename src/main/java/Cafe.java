public class Cafe {
	private double agua;
	private String tamano;
	private double gramos;
	private double mostrarCafe;

	public Cafe(double gramos, double agua, String tamano) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public double mostrarCafe() {
		throw new UnsupportedOperationException();
	}

	public void setAgua(double agua) {
		this.agua = agua;
	}

	public double getAgua() {
		return this.agua;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getTamano() {
		return this.tamano;
	}

	public void setGramos(double gramos) {
		this.gramos = gramos;
	}

	public double getGramos() {
		return this.gramos;
	}
}