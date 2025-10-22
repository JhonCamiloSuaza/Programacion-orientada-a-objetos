package poo;

public class Microfono {
    public String tipo;
    public String marca;

    public Microfono(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public void grabar() {
        System.out.println("Microfono - grabar ejecutado.");
    }
    public void silenciar() {
        System.out.println("Microfono - silenciar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Microfono - " + "tipo: " + tipo + ", " + "marca: " + marca);
    }
}