package poo;

public class Router {
    public String marca;
    public int velocidad;
    public String tipoConexion;

    public Router(String marca, int velocidad, String tipoConexion) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.tipoConexion = tipoConexion;
    }

    public void conectar() {
        System.out.println("Router - conectar ejecutado.");
    }
    public void reiniciar() {
        System.out.println("Router - reiniciar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Route -  " + "marca: " + marca + ", " + "velocidad: " + velocidad + ", " + "tipoConexion: " + tipoConexion);
    }
}