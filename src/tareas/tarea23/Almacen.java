package tareas.tarea23;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private String nombre;
    private String direccion;
    private List<Producto> productos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public Almacen(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarProductos(Producto producto) {
        if (producto == null) {
            System.out.println("El producto no puede ser nulo.");
            return;
        }
        productos.add(producto);
        System.out.println("Producto " + producto.getNombre() + " agregado al almacén.");
    }

    public void registrarCliente(Cliente cliente) {
        if (cliente == null) {
            System.out.println("El cliente no puede ser nulo.");
            return;
        }
        clientes.add(cliente);
        System.out.println("Cliente " + cliente.getNombre() + " registrado en el almacén.");
    }
}
