package poo;

public class Pared {
    public String color;
    public String material;
    public double largo;
    public double ancho;

    public Pared(String color, String material, double largo, double ancho) {
        this.color = color;
        this.material = material;
        this.largo = largo;
        this.ancho = ancho;
    }

    public void pintar() {
        System.out.println("Pared - pintar ejecutado.");
    }
    public void medir() {
        System.out.println("Pared - medir ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Pared - " + "color: " + color + ", " + "material: " + material + ", " + "largo: " + largo + ", " + "ancho: " + ancho);
    }
}