package com.xmartinez.ejemplo;

import com.xmartinez.pooherencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {


        System.out.println("===============Creando Instancia de la clase Alumno============");
        Alumno alumno = new Alumno("Lucas","Martinez",15,"Colegi Isidre Marti");
        alumno.setEmail("lucas@gmail.com");
        alumno.setNotaMatematicas(5.5);
        alumno.setNotaCastellano(6.3);
        alumno.setNotaHistoria(4.9);


        System.out.println("===============Creando Instancia de la clase AlumnoInternacional============");
        AlumnoInternacional alumnoInt= new AlumnoInternacional("Lola","Gospper","Australia");
        alumnoInt.setEmail("lola@gmail.com");
        alumnoInt.setEdad(15);
        alumnoInt.setInstituto("Colegi Isidre Martir");
        alumnoInt.setNotaIdiomas(6.9);
        alumnoInt.setNotaCastellano(5.8);
        alumnoInt.setNotaHistoria(5.6);
        alumnoInt.setNotaMatematicas(8.5);


        System.out.println("===============Creando Instancia de la clase Profesor============");
        Profesor profesor = new Profesor("Andres","Pérez","Matemáticas");
        profesor.setEmail("andres@andres.com");
        profesor.setEdad(45);

        System.out.println("****************************");
        imprimir(alumno);
        System.out.println("****************************");
        imprimir(alumnoInt);
        System.out.println("****************************");
        imprimir(profesor);
    }

    public static void imprimir (Persona persona){
        System.out.println("Persona = " + persona.getNombre()+" "
                +persona.getApellido()+ " edad: "
                +persona.getEdad()+", email: "
                +persona.getEmail());

        if (persona instanceof Alumno){
            System.out.println("Imprimiendo datos de Alumno");
            System.out.println("Institucion: "+((Alumno) persona).getInstituto());// hacemos un cast para que lea la clase persona
            System.out.println("Nota matemáticas: "+ ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota castellano: "+ ((Alumno) persona).getNotaCastellano());
            System.out.println("Nota historia: "+ ((Alumno) persona).getNotaHistoria());
            System.out.println("********Media del Alumno****************");


            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo datos de Alumno Internacional: ");
                System.out.println("Procedente del pais: "+ ((AlumnoInternacional) persona).getPais());
                System.out.println("La nota de idiomas: "+ ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("********Media del Alumno Internacional****************");
                //System.out.println("La media es: "+ ((AlumnoInternacional) persona).calcularMedia());

            }
            System.out.println("La media es: "+ ((Alumno) persona).calcularMedia());

        }
        if (persona instanceof  Profesor){
            System.out.println("Imprimiendo datos de Profesor");
            System.out.println("Instituto: "+ ((Profesor) persona).getAsignatura());
        }
        System.out.println("=============Saludar==============");
        System.out.println(persona.saludar());

    }
}
