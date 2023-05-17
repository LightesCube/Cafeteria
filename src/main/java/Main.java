public class main {
    public static void main(String[] args) {

        Cafeteria cafeteria1 = new Cafeteria("Puzzles","arturo prat 22", "@puzzles");

        cafeteria1.mostrarCafes();

        cafeteria1.agregarCafe(7.1, 5.2, "grande");
        cafeteria1.agregarCafe(27.3, 39.1, "grande");
        cafeteria1.agregarCafe(93.1, 37.2, "grande");
        cafeteria1.agregarCafe(37.5, 12.8, "mediano");
        cafeteria1.agregarCafe(64.3, 10.4, "mediano");
        cafeteria1.agregarCafe(31.9, 15.0, "pequeno");

        cafeteria1.mostrarCafes();

        cafeteria1.borrarCafe(2);

        cafeteria1.mostrarCafes();

        cafeteria1.buscarCafePorTamano("pequeno");

        cafeteria1.buscarCafePorNombre("mediano");

        cafeteria1.buscarCafePorNombre("grande");


    }

}