package tareas.tarea22;

public class Limpieza extends Producto{

    private String componentes;
    private double litros;

    //Constructor

    public Limpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }
    //getter and setter

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    //metodo

    @Override
    public String toString() {
        return super.toString() +
                "\ncomponentes=" + componentes  +
                "\nlitros=" + litros;
    }
}
