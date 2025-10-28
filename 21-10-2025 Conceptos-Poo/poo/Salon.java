package poo;

public class Salon {
    public String nombre;
    public int capacidad;
    public String ubicacion;

    public Salon(String nombre, int capacidad, String ubicacion) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
    }

    public void ambienteEducativo() {
        System.out.println("Salon - ambienteEducativo ejecutado.");
    }
    public void lugarDeAprendizaje() {
        System.out.println("Salon - lugarDeAprendizaje ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Salon - " + "nombre: " + nombre + ", " + "capacidad: " + capacidad + ", " + "ubicacion: " + ubicacion);
    }
}