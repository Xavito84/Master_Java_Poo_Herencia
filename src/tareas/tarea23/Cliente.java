package tareas.tarea23;

public class Cliente {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comprar(Producto producto, int cantidad) {
        if (producto == null) {
            System.out.println("Producto no válido.");
            return;
        }

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        if (producto.getCantidad() < cantidad) {
            System.out.println("No hay suficiente stock del producto " + producto.getNombre() + " para completar la compra.");
            return;
        }

        producto.vender(cantidad);
        System.out.println("El cliente " + nombre + " ha comprado " + cantidad + " unidades de " + producto.getNombre() + ".");
    }

}
