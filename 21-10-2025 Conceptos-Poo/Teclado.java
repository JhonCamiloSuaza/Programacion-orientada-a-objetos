package poo;

public class Teclado {
    public String marca;
    public String tamanio;
    public int teclas;

    public Teclado(String marca, String tamanio, int teclas) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.teclas = teclas;
    }

    public void escribir() {
        System.out.println("Teclado - escribir ejecutado.");
    }
    public void conectar() {
        System.out.println("Teclado - conectar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Teclado - " + "marca: " + marca + ", " + "tamanio: " + tamanio + ", " + "teclas: " + teclas);
    }
}