package poo;

public class Estudiante {
    public String nombre;
    public int edad;
    public String grado;

    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public void estudiar() {
        System.out.println("Estudiante - estudiar ejecutado.");
    }
    public void participar() {
        System.out.println("Estudiante - participar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Estudiante - " + "nombre: " + nombre + ", " + "edad: " + edad + ", " + "grado: " + grado);
    }
}