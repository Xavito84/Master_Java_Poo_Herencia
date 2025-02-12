package tareas.tarea22;

public class Producto {

    private String nombre;
    private double precio;

    //Constructor

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //metodo
    @Override
    public String toString() {
        return  "nombre=" + nombre +
                "\nprecio=" + precio;
    }
}
