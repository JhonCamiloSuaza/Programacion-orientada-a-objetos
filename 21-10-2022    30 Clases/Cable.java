package poo;

public class Cable {
    public String tipo;
    public double longitud;
    public String color;

    public Cable(String tipo, double longitud, String color) {
        this.tipo = tipo;
        this.longitud = longitud;
        this.color = color;
    }

    public void conectar() {
        System.out.println("Cable - conectar ejecutado.");
    }
    public void desconectar() {
        System.out.println("Cable - desconectar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Cable - " + "tipo: " + tipo + ", " + "longitud: " + longitud + ", " + "color: " + color);
    }
}