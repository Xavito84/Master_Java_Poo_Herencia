package tareas.tarea21;

public class Empleado extends Persona{

    private double remuneracion;
    private int empledoId;

    //Contructor


    public Empleado() {
    }

    public Empleado(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Empleado(String nombre, String apellido, double remuneracion, int empledoId) {
        this(nombre, apellido);
        this.remuneracion = remuneracion;
        this.empledoId = empledoId;
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empledoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empledoId = empledoId;
    }

    //gettes and settes

    public int getEmpledoId() {
        return empledoId;
    }


    public void setEmpledoId(int empledoId) {
        this.empledoId = empledoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }
    //METODO


    public double aumentarRemuneracion(int porcentaje){
        double total= getRemuneracion()* porcentaje/100;
        return total+getRemuneracion();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nremuneracion=" + remuneracion+"€" +
                ", empledoId=" + empledoId;
    }
}
