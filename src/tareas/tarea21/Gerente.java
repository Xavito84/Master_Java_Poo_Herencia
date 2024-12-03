package tareas.tarea21;

public final class Gerente extends Empleado{

    private double presupuesto;

    //Construct


    public Gerente() {
    }

    public Gerente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Gerente(String nombre, String apellido, double presupuesto) {
        super(nombre, apellido);
        this.presupuesto = presupuesto;
    }

    public Gerente(String nombre, String apellido, double remuneracion, int empledoId) {
        super(nombre, apellido, remuneracion, empledoId);
    }

    public Gerente(String nombre, String apellido, double remuneracion, int empledoId, double presupuesto) {
        super(nombre, apellido, remuneracion, empledoId);
        this.presupuesto = presupuesto;
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empledoId) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empledoId);
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empledoId, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empledoId);
        this.presupuesto = presupuesto;
    }
    // getters and setters

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    //Metodo

    @Override
    public String toString() {
        return super.toString() +
                "\npresupuesto=" + presupuesto+"€";
    }
}
