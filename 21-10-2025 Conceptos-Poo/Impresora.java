package poo;

public class Impresora {
    public String marca;
    public String tipo;
    public String colorTinta;

    public Impresora(String marca, String tipo, String colorTinta) {
        this.marca = marca;
        this.tipo = tipo;
        this.colorTinta = colorTinta;
    }

    public void imprimir() {
        System.out.println("Impresora - imprimir ejecutado.");
    }
    public void escanear() {
        System.out.println("Impresora - escanear ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Impresora - " + "marca: " + marca + ", " + "tipo: " + tipo + ", " + "colorTinta: " + colorTinta);
    }
}