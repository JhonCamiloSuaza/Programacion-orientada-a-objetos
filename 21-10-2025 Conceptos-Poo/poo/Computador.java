package poo;

public class Computador {
    public String marca;
    public int memoria;
    public String modelo;

    public Computador(String marca, int memoria, String modelo) {
        this.marca = marca;
        this.memoria = memoria;
        this.modelo = modelo;
    }

    public void encender() {
        System.out.println("El computador " + marca + " está encendido.");
    }

    public void apagar() {
        System.out.println("El computador " + marca + " se ha apagado.");
    }

    public void mostrarInfo() {
        System.out.println("Computador: " + marca + ", Modelo: " + modelo + ", Memoria: " + memoria + "GB");
    }
}
