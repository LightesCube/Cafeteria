
		public class Main {
			public static void main(String[] args) {
				Cafeteria cafeteria = crearCafeteria("Cafeteria", "calle sin nombre", "@cafeSinNOMBRE");
				Cafe cafe1 = crearCafe(75, 175, Cafe.Tamano.Mediano, 2);
				Producto__Brownie_ = crearProducto("Galleta", Nuevo_Producto__Galletas, 1);
				Trabajador trabajador1 = crearTrabajador(Trabajador.Tipo.Barista);
				Cliente cliente1 = crearCliente();
				cafeteria.agregarCafe(cafe1);
				cafeteria.agregarProducto(brownie);
				cafeteria.agregarTrabajadores(trabajador1);
				cafeteria.asociarCliente(cliente1);
				cafeteria.comprarCafe(0,cliente1);
				System.out.println(cafeteria.getListaClientes().get(0).getDinero());
				cafeteria.comprarProducto(cliente1,0);
				System.out.println(cafeteria.getListaClientes().get(0).getDinero());
				cafeteria.mostrarVentas(cafeteria);
			}

			public static Cliente crearCliente() {
				Cliente cliente = new Cliente();
				System.out.println("Principal.Cliente creado con: " + cliente.getDinero() + " de saldo.");
				return cliente;
			}

			public static Cafeteria crearCafeteria(String nombre, String direccion, String rs) {
				Cafeteria cafeteria = new Cafeteria(nombre, direccion, rs);
				System.out.println("Principal.Cafeteria: " + cafeteria.getNombre() + " creada correctamente");
				return cafeteria;
			}

			public static Cafe crearCafe(int gramos, int ml, Cafe.Tamano tamano, float precio) {
				Cafe cafe = new Cafe(gramos, ml, tamano, precio);
				System.out.println("Principal.Cafe: " + cafe + " creado correctamente");
				return cafe;
			}

			public static Trabajador crearTrabajador(Trabajador.Type type) {
				Trabajador trabajador = new Trabajador(type);
				System.out.println("Principal.Trabajador: " + trabajador.getTipo() + " registrado correctamente");
				return trabajador;
			}

			public static Producto__Brownie_ crearProducto(String nombre, Producto__Brownie_ categoria, float precio) {
				Producto__Brownie_ producto = new Producto__Brownie_(nombre, categoria, precio);
				System.out.println("Principal.Producto: " + producto.getNombre() + " creado correctamente");
				return producto;
			}
		}