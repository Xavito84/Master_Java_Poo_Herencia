package tareas.tarea21;

public final class Cliente extends Persona{

    private int clienteId;

    //construtor

    public Cliente() {   }

    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Cliente(String nombre, String apellido, int clienteId) {
        super(nombre, apellido);
        this.clienteId = clienteId;
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    //gettere and setters

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    //metodo

    @Override
    public String toString() {
        return super.toString()+
                "\nclienteId=" + clienteId;
    }
}
