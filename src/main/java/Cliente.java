public class Cliente {
	private float dinero;
	private Object comprarProducto;
	public Cafeteria __cliente_s;

	public float getDinero() {
		return this.dinero;
	}

	public void setDinero(float dinero) {
		this.dinero = dinero;
	}

	public Cliente() {
		throw new UnsupportedOperationException();
	}

	public void getComprarProducto() {
		return this.comprarProducto;
	}

	public boolean comprobarDinero(float gasto) {
		throw new UnsupportedOperationException();
	}

	public void comprarCafe(Cafe cafe) {
		throw new UnsupportedOperationException();
	}
}