package com.xmartinez.pooherencia;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    //Constructor

    public Persona(){
        System.out.println("Inicia el constructor persona");
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad, String email) {
        this(nombre, apellido,edad);
        this.email = email;
    }
    //getter and setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //metodos


    public String saludar() {
     return "Hola que tal!";
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", ,saludo= " + saludar();
    }
}
