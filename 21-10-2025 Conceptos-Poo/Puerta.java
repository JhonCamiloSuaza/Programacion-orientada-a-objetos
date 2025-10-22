package poo;

public class Puerta {
    public String material;
    public String color;
    public boolean abierta;

    public Puerta(String material, String color, boolean abierta) {
        this.material = material;
        this.color = color;
        this.abierta = abierta;
    }

    public void abrir() {
        abierta = true;
        System.out.println("La puerta se ha abierto.");
    }

    public void cerrar() {
        abierta = false;
        System.out.println("La puerta se ha cerrado.");
    }

    public void mostrarInfo() {
        System.out.println("Puerta de " + material + ", color " + color + ", abierta: " + abierta);
    }
}
