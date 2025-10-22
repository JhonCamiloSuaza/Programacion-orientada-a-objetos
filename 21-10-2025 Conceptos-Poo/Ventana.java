package poo;

public class Ventana {
    public String tipo;
    public String tamanio;
    public String material;
     public boolean abierta;

    public Ventana(String tipo, String tamanio, String material) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.material = material;
    }

    public void abrir() {
        this.abierta = true;
        System.out.println("Ventana abierta.");
    }
    public void cerrar() {
        this.abierta = false;
        System.out.println("Ventana cerrada.");
    }
    public void mostrarInfo() {
        System.out.println("Ventana - " + "tipo: " + tipo + ", " + "tamanio: " + tamanio + ", " + "material: " + material);
    }
}