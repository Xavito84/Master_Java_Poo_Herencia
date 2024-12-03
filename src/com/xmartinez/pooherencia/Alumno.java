package com.xmartinez.pooherencia;

public class Alumno extends Persona{

    private String instituto;
    private double notaMatematicas;
    private double notaCastellano;
    private double notaHistoria;


    //Construct

    public Alumno() {
        System.out.println("Incia constructor alumnno");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido,int edad, String instituto) {
        this(nombre, apellido,edad);
        this.instituto = instituto;
    }

    public Alumno(String nombre, String apellido,int edad, String instituto, double notaMatematicas, double notaCastellano, double notaHistoria) {
        this(nombre, apellido,edad,instituto);
        this.notaMatematicas = notaMatematicas;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }
    //getters and setters

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar() {
        return super.saludar()+" mi nombre es "+ getNombre();
    }
    public double calcularMedia(){
        //System.out.println("Calcular media: "+Alumno.class.getCanonicalName());
        return (getNotaHistoria()+getNotaCastellano()+getNotaMatematicas())/3;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\ninstituto='" + instituto + '\'' +
                ", notaMatematicas=" + notaMatematicas +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria +
                ", media=" + calcularMedia() ;

    }
}
