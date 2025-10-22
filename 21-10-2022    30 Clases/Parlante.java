package poo;

public class Parlante {
    public String marca;
    public int volumen;
    public String color;

    public Parlante(String marca, int volumen, String color) {
        this.marca = marca;
        this.volumen = volumen;
        this.color = color;
    }

    public void reproducir() {
        System.out.println("Parlante - reproducir ejecutado.");
    }
    public void silenciar() {
        System.out.println("Parlante - silenciar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Parlante - " + "marca: " + marca + ", " + "volumen: " + volumen + ", " + "color: " + color);
    }
}