package poo;

public class Basurero {
    public String color;
    public String tamanio;
    public boolean lleno;

    public Basurero(String color, String tamanio, boolean lleno) {
        this.color = color;
        this.tamanio = tamanio;
        this.lleno = lleno;
    }

    public void llenar() {
        System.out.println("Basurero - llenar ejecutado.");
    }
    public void vaciar() {
        System.out.println("Basurero - vaciar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Basurero - " + "color: " + color + ", " + "tamanio: " + tamanio + ", " + "lleno: " + lleno);
    }
}