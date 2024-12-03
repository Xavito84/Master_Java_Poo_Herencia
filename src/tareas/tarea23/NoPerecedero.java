package tareas.tarea23;

public class NoPerecedero extends Producto{

    private int contenido;
    private int calorias;

    public NoPerecedero(String nombre, double precio, int cantidad, int contenido, int calorias) {
        super(nombre, precio, cantidad);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
