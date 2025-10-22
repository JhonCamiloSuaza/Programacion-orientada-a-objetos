package poo;

public class MemoriaUSB {
    public int capacidad;
    public String marca;
    public String color;

    public MemoriaUSB(int capacidad, String marca, String color) {
        this.capacidad = capacidad;
        this.marca = marca;
        this.color = color;
    }

    public void conectar() {
        System.out.println("MemoriaUSB - conectar ejecutado.");
    }
    public void guardar() {
        System.out.println("MemoriaUSB - guardar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("MemoriaUSB - " + "capacidad: " + capacidad + ", " + "marca: " + marca + ", " + "color: " + color);
    }
}