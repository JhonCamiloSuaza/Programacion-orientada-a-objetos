package poo;

public class Profesor {
    public String nombre;
    public String materia;
    public int experiencia;

    public Profesor(String nombre, String materia, int experiencia) {
        this.nombre = nombre;
        this.materia = materia;
        this.experiencia = experiencia;
    }

    public void ensenar() {
        System.out.println(nombre + " está enseñando " + materia + ".");
    }

    public void calificar() {
        System.out.println(nombre + " está calificando exámenes.");
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + ", Materia: " + materia + ", Años de experiencia: " + experiencia);
    }
}
