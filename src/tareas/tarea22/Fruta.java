package tareas.tarea22;

public class Fruta extends Producto {

    private double peso;
    private String color;

    //Constructor

    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }
    //getter and setter

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //metodo

    @Override
    public String toString() {
        return super.toString() +
                "\npeso=" + peso +
                "\ncolor=" + color;
    }
}
