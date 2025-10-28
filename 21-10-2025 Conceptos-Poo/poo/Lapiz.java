package poo;

public class Lapiz {
    public String color;
    public String tipo;
    public double largo;

    public Lapiz(String color, String tipo, double largo) {
        this.color = color;
        this.tipo = tipo;
        this.largo = largo;
    }

    public void escribir() {
        System.out.println("Lapiz - escribir ejecutado.");
    }
    public void sacarPunta() {
        System.out.println("Lapiz - sacarPunta ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Lapiz - " + "color: " + color + ", " + "tipo: " + tipo + ", " + "largo: " + largo);
    }
}