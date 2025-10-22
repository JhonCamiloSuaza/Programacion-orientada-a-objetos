package poo;

public class Camara {
    public String marca;
    public String resolucion;
    public String tipo;

    public Camara(String marca, String resolucion, String tipo) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.tipo = tipo;
    }

    public void encender() {
        System.out.println("Camara - encender ejecutado.");
    }
    public void capturar() {
        System.out.println("Camara - capturar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Camara - " + "marca: " + marca + ", " + "resolucion: " + resolucion + ", " + "tipo: " + tipo);
    }
}