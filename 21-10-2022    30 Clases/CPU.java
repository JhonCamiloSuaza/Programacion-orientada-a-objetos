package poo;

public class CPU {
    public String marca;
    public double velocidad;
    public int memoriaRAM;

    public CPU(String marca, double velocidad, int memoriaRAM) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.memoriaRAM = memoriaRAM;
    }

    public void encender() {
        System.out.println("CPU encendido.");
    }
    public void procesar() {
        System.out.println("CPU - procesar ejecutado.");
    }
    public void mostrarInfo() {
        System.out.println("CPU - " + "marca: " + marca + ", " + "velocidad: " + velocidad + ", " + "memoriaRAM: " + memoriaRAM);
    }
}