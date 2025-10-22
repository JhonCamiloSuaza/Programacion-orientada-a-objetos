package poo;

public class TomaCorriente {
    public int voltaje;
    public String color;

    public TomaCorriente(int voltaje, String color) {
        this.voltaje = voltaje;
        this.color = color;
    }

    public void conectar() {
        System.out.println("TomaCorriente - conectar ejecutado.");
    }
    public void desconectar() {
        System.out.println("TomaCorriente - desconectar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("TomaCorriente - " + "voltaje: " + voltaje + ", " + "color: " + color);
    }
}