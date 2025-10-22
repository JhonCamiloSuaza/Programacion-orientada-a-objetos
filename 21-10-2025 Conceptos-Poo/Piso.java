package poo;

public class Piso {
    public String material;
    public String color;
    public String tamanio;

    public Piso(String material, String color, String tamanio) {
        this.material = material;
        this.color = color;
        this.tamanio = tamanio;
    }

    public void limpiar() {
        System.out.println("Piso - limpiar ejecutado.");
    }
    public void ensuciar() {
        System.out.println("Piso - ensuciar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Piso - " + "material: " + material + ", " + "color: " + color + ", " + "tamanio: " + tamanio);
    }
}