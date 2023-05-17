public class Cafe {

    private double agua;
    private String tamano;

    private double gramos;

    private double mostrarCafe;


    public void setAgua(double agua) {
        this.agua = agua;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Cafe(double gramos, double agua, String tamano) {
        this.setGramos(gramos);
        this.setAgua(agua);
        this.setTamano(tamano);
    }

    public void setGramos(double gramos) {
        this.gramos = gramos;
    }

    public double getGramos() {
        return gramos;
    }

    public double getAgua() {
        return agua;
    }

    public String getTamano() {
        return tamano;
    }

    public String toString() {
        String string = "Cafe contiene: " + this.gramos + "gr, " + this.agua + "ml y es de tamano " + this.tamano;
        return string;
    }

    public double mostrarCafe() {
        return mostrarCafe;


    }

}