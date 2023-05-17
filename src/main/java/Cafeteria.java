 import java.util.ArrayList;
import java.util.Locale;

    public class Cafeteria {
        String nombre;
        String direccion;
        String RRSS;
        ArrayList<Cafe> listaCafes;

        public Cafeteria(String nombre, String direccion, String RRSS, ArrayList<Cafe> cafes) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.RRSS = RRSS;
            this.listaCafes = cafes;
        }

        public Cafeteria() {
            this.nombre = "";
            this.direccion = "";
            this.RRSS = "";
            this.listaCafes = null;
        }


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public void setRRSS(String RRSS) {
            this.RRSS = RRSS;
        }

        public String getRRSS() {
            return RRSS;
        }

        public ArrayList<Cafe> getListaCafes() {
            return listaCafes;
        }

        public void setListaCafes(ArrayList<Cafe> listaCafes) {
            this.listaCafes = listaCafes;
        }

        public String getDireccion() {
            return direccion;
        }


        public void agregarCafe(String nombre, int gramos, int mililitros, String tamaño) {
            Cafe nuevoCafe = new Cafe(nombre, gramos, mililitros, tamaño);
            listaCafes.add(nuevoCafe);
        }

        public void eliminarCafePorNombre(String nombre) {
            boolean existe = false;
            for (int i = 0; i < listaCafes.size(); i++) {
                String posible = listaCafes.get(i).getTipo().toLowerCase(Locale.ROOT);
                if (nombre.toLowerCase(Locale.ROOT).equals(posible)) {
                    System.out.println("Se elimino: " + listaCafes.get(i));
                    listaCafes.remove(i);
                    existe = true;
                }
            }
            if (!existe) System.out.println("No existe: " + nombre);
        }

        public String buscarCafePorNombre(String buscar) {
            boolean existe = false;
            for (int i = 0; i < listaCafes.size(); i++) {
                String posible = listaCafes.get(i).getTipo().toLowerCase(Locale.ROOT);
                if (buscar.toLowerCase(Locale.ROOT).equals(posible)) {
                    existe = true;
                    buscar = posible;
                }
            }
            if (existe) System.out.println("Si esta el cafe: " + buscar);
            else if (!existe) System.out.println("No esta na: " + buscar);
            return buscar;
        }
    }
