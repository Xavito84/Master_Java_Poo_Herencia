package tareas.tarea23;

import java.util.Date;

public class Perecedero extends Producto{

    private Date fechaExpiacion;

    public Perecedero(String nombre, double precio, int cantidad, Date fechaExpiacion) {
        super(nombre, precio, cantidad);
        this.fechaExpiacion = fechaExpiacion;
    }

    public Date getFechaExpiacion() {
        return fechaExpiacion;
    }

    public void setFechaExpiacion(Date fechaExpiacion) {
        this.fechaExpiacion = fechaExpiacion;
    }

    public boolean verificarEstado() {
        Date hoy = new Date();
        return !hoy.after(fechaExpiacion);
    }

}
