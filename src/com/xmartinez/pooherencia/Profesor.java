package com.xmartinez.pooherencia;

public final class Profesor extends Persona {

    private String asignatura;

    //Construct
    public Profesor() {
        System.out.println("Inicia el constructor de profesor");
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, int edad, String asignatura) {
        super(nombre, apellido, edad);
        this.asignatura = asignatura;
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        this(nombre, apellido);
        this.asignatura = asignatura;
    }

    //getter and setter

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos dias soy el profesor de la asignatura "+ getAsignatura()+" y mi nombre es "+getNombre();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nasignatura='" + asignatura;
    }
}
