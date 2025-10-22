package poo;

public class Reloj {
    public String marca;
    public String hora;
    public String tipo;

    public Reloj(String marca, String hora, String tipo) {
        this.marca = marca;
        this.hora = hora;
        this.tipo = tipo;
    }

    public void mostrarHora() {
        System.out.println("Reloj - mostrarHora ejecutado.");
    }
    public void mostrarDia() {
        System.out.println("Reloj - mostrarDia ejecutado.");
    }
    public void cambiarHora() {
        System.out.println("Reloj - cambiarHora ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("Reloj - " + "marca: " + marca + ", " + "hora: " + hora + ", " + "tipo: " + tipo);
    }
}