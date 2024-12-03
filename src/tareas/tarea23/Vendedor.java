package tareas.tarea23;

public class Vendedor  {

    private String nombre;

    public Vendedor( String nombre1) {

        this.nombre = nombre1;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrar(Producto producto, int cantidad) {
        if (producto == null) {
            System.out.println("Producto no válido.");
            return;
        }

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        if (producto.getCantidad() < cantidad) {
            System.out.println("Stock insuficiente para realizar la venta.");
            return;
        }

        producto.vender(cantidad);
        System.out.println("El vendedor " + nombre + " ha registrado la venta de " + cantidad + " unidades del producto " + producto.getNombre() + ".");
    }

}
