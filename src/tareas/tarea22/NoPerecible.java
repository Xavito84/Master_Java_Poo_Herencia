package tareas.tarea22;

public class NoPerecible extends Producto{
    private int contenido;
    private int calorias;

    //constructor

    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    //getter and setter

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

    //metodo

    @Override
    public String toString() {
        return super.toString() +
                "\ncontenido=" + contenido +
                "\ncalorias=" + calorias;
    }
}
