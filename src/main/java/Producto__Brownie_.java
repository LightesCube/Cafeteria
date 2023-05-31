public class Producto__Brownie_ {
	private String color;
	private Glaseado glaseado;
	private Sabor sabor;
	private String nombre;

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Glaseado getGlaseado() {
		return this.glaseado;
	}

	public void setGlaseado(Glaseado glaseado) {
		this.glaseado = glaseado;
	}

	public Sabor getSabor() {
		return this.sabor;
	}

	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object attribute) {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}