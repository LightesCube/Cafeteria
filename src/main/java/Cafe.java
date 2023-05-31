public class Cafe {
	private String tamano;
	private double gramos;
	private double mostrarCafe;
	private float precio;
	private double agua;

	public Cafe(double gramos, double agua, String tamano) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public double mostrarCafe() {
		throw new UnsupportedOperationException();
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public double getAgua() {
		return this.agua;
	}

	public void setAgua(double agua) {
		this.agua = agua;
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object attribute) {
		throw new UnsupportedOperationException();
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