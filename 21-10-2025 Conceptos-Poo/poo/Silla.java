package poo;

public class Silla {
    public String color;
    public String material;
    public boolean ocupada;

    public Silla(String color, String material, boolean ocupada) {
        this.color = color;
        this.material = material;
        this.ocupada = ocupada;
    }

    public void ocupar() {
        ocupada = true;
        System.out.println("La silla ahora está ocupada.");
    }

    public void desocupar() {
        ocupada = false;
        System.out.println("La silla ahora está desocupada.");
    }

    public void mostrarInfo() {
        System.out.println("Silla de " + material + ", color " + color + ", ocupada: " + ocupada);
    }
}
