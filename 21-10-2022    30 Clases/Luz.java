package poo;

public class Luz {
    public boolean encendida;
    public int nivelBrillo;

    public Luz(boolean encendida, int nivelBrillo) {
        this.encendida = encendida;
        this.nivelBrillo = nivelBrillo;
    }

    public void encender() {
        encendida = true;
        System.out.println("La luz está encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("La luz está apagada.");
    }

    public void mostrarInfo() {
        System.out.println("Luz encendida: " + encendida + ", nivel de brillo: " + nivelBrillo);
    }
}
