package tareas.tarea23;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor que cero.");
            return;
        }
        if (cantidad > this.cantidad) {
            System.out.println("No hay suficiente stock para realizar la venta.");
            return;
        }
        this.cantidad -= cantidad;
        System.out.println("Se han vendido " + cantidad + " unidades. Stock restante: " + this.cantidad);
    }

}
