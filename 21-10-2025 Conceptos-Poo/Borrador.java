package poo;

public class Borrador {
    public String color;
    public String forma;
    public String material;

    public Borrador(String color, String forma, String material) {
        this.color = color;
        this.forma = forma;
        this.material = material;
    }

    public void borrar() {
        System.out.println("Borrador - borrar ejecutado.");
    }
    public void limpiar() {
        System.out.println("Borrador - limpiar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Borrador - " + "color: " + color + ", " + "forma: " + forma + ", " + "material: " + material);
    }
}