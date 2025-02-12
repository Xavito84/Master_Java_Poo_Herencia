package tareas.tarea23;

public class ArticuloLimpieza extends Producto{

    private String componentes;
    private double litros;

    public ArticuloLimpieza(String nombre, double precio, int cantidad, String componentes, double litros) {
        super(nombre, precio, cantidad);
        this.componentes = componentes;
        this.litros = litros;
    }

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
}
