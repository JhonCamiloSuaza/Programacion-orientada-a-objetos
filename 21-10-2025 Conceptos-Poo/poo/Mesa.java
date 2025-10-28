package poo;

public class Mesa {
    public String material;
    public int altura;
    public String color;

    public Mesa(String material, int altura, String color) {
        this.material = material;
        this.altura = altura;
        this.color = color;
    }

    public void limpiar() {
        System.out.println("La mesa ha sido limpiada.");
    }

    public void usar() {
        System.out.println("La mesa está siendo usada.");
    }

    public void mostrarInfo() {
        System.out.println("Mesa de " + material + ", altura " + altura + " cm, color " + color);
    }
}
