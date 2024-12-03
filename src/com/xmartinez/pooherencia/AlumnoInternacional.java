package com.xmartinez.pooherencia;

public final class AlumnoInternacional extends Alumno{

    private String pais;
    private double notaIdiomas;

    //constructor

    public AlumnoInternacional() {
        System.out.println("Inicia el constructor de AlumnoInternaconal");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        this(nombre, apellido);
        this.pais = pais;
    }

    //getter and setter


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return super.saludar()+ " y mi país de origen es: "+ getPais();
    }

    @Override
    public double calcularMedia() {
        //System.out.println("Calcular media: "+AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularMedia()*3)+getNotaIdiomas())/4;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
