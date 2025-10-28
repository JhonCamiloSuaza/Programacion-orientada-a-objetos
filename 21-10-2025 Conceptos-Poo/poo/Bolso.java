package poo;

public class Bolso {
    public String color;
    public String tamano;
    public double peso;

    public Bolso(String color, String tamano, double peso) {
        this.color = color;
        this.tamano = tamano;
        this.peso = peso;
    }

    public void guardar() {
        System.out.println("Bolso - guardar ejecutado.");
    }
    public void abrir() {
        System.out.println("Bolso - abrir ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Bolso - " + "color: " + color + ", " + "tamano: " + tamano + ", " + "peso: " + peso);
    }
}