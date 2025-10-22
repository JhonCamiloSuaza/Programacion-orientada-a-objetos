package poo;

public class Audifono {
    public String marca;
    public String tipo;
    public int volumen;

    public Audifono(String marca, String tipo, int volumen) {
        this.marca = marca;
        this.tipo = tipo;
        this.volumen = volumen;
    }

    public void escuchar() {
        System.out.println("Audifono - escuchar ejecutado.");
    }
    public void silenciar() {
        System.out.println("Audifono - silenciar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Audifono - " + "marca: " + marca + ", " + "tipo: " + tipo + ", " + "volumen: " + volumen);
    }
}