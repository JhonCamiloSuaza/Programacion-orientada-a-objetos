package poo;

public class Mouse {
    public String marca;
    public String color;
    public String tipo;

    public Mouse(String marca, String color, String tipo) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
    }

    public void mover() {
        System.out.println("Mouse - mover ejecutado.");
    }
    public void conectar() {
        System.out.println("Mouse - conectar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Mouse - " + "marca: " + marca + ", " + "color: " + color + ", " + "tipo: " + tipo);
    }
}