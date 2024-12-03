package tareas.tarea22;

public final class Lacteo extends Producto{

    private int cantidad;
    private int proteinas;

    //Constructor

    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    //gettter and setter

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    //metodo

    @Override
    public String toString() {
        return super.toString() +
                "\ncantidad=" + cantidad +
                "\nproteinas=" + proteinas;
    }
}
