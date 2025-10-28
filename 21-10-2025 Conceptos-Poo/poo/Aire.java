package poo;

public class Aire {
    public int velocidad;
    public String marca;
    public String tamanio;

    public Aire(int velocidad, String marca, String tamanio) {
        this.velocidad = velocidad;
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public void encender() {
        System.out.println("Aire encendido.");
    }
    public void apagar() {
        System.out.println("Aire apagado.");
    }
    public void mostrarInfo() {
        System.out.println("Aire - " + "velocidad: " + velocidad + ", " + "marca: " + marca + ", " + "tamanio: " + tamanio);
    }
}