import java.util.ArrayList;

public class Cafeteria {
	String nombre;
	String direccion;
	String RRSS;
	java.util.ArrayList<Cafe> listaCafes;
	private ArrayList<Producto__Brownie_> producto__Brownie_s = new ArrayList<Producto__Brownie_>();
	public Cliente __cliente_s;
	public Trabajador __trabajador_s;
	public Nuevo_Producto__Galletas _nuevoProducto__Galleta_s;

	public Cafeteria(String nombre, String direccion, String RRSS, java.util.ArrayList<Cafe> cafes) {
		throw new UnsupportedOperationException();
	}

	public Cafeteria() {
		throw new UnsupportedOperationException();
	}

	public java.util.ArrayList<Cafe> getListaCafes() {
		throw new UnsupportedOperationException();
	}

	public void setListaCafes(java.util.ArrayList<Cafe> listaCafes) {
		throw new UnsupportedOperationException();
	}

	public void agregarCafe(String nombre, int gramos, int mililitros, String tamaño) {
		throw new UnsupportedOperationException();
	}

	public void eliminarCafePorNombre(String nombre) {
		throw new UnsupportedOperationException();
	}

	public String buscarCafePorNombre(String buscar) {
		throw new UnsupportedOperationException();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setRRSS(String RRSS) {
		this.RRSS = RRSS;
	}

	public String getRRSS() {
		return this.RRSS;
	}
}