package poo;

public class Cuaderno {
    public String color;
    public int cantidadHojas;
    public String tamano;

    public Cuaderno(String color, int cantidadHojas, String tamano) {
        this.color = color;
        this.cantidadHojas = cantidadHojas;
        this.tamano = tamano;
    }

    public void organizarInformacion() {
        System.out.println("Cuaderno - organizarInformacion ejecutado.");
    }
    public void planificar() {
        System.out.println("Cuaderno - planificar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Cuaderno - " + "color: " + color + ", " + "cantidadHojas: " + cantidadHojas + ", " + "tamano: " + tamano);
    }
}