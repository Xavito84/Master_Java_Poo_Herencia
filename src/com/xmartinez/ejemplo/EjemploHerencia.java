package com.xmartinez.ejemplo;

import com.xmartinez.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {


        System.out.println("===============Creando Instancia de la clase Alumno============");
        Alumno alumno = new Alumno();
        alumno.setNombre("Lucas"); // si estuviera en el mismo package seria alumno.nombre= "Lucas"; pero no estaria oculto en caso que lo pongas en private
        alumno.setApellido("Martinez");
        alumno.setInstituto("Colegi Isidre Martir");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaCastellano(6.3);
        alumno.setNotaHistoria(4.9);


        System.out.println("===============Creando Instancia de la clase AlumnoInternacional============");
        AlumnoInternacional alumnoInt= new AlumnoInternacional();
        alumnoInt.setNombre("Lola");
        alumnoInt.setApellido("Gospper");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstituto("Colegi Isidre Martir");
        alumnoInt.setNotaIdiomas(6.9);
        alumnoInt.setNotaCastellano(5.8);
        alumnoInt.setNotaHistoria(5.6);
        alumnoInt.setNotaMatematicas(8.5);


        System.out.println("===============Creando Instancia de la clase Profesor============");
        Profesor profesor = new Profesor();
        profesor.setNombre("Andres");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");

        System.out.println("alumno = " + alumno.getNombre()+" "+alumno.getApellido()+ " "+alumno.getInstituto());
        System.out.println("alumnoInternacional = " + alumnoInt.getNombre()+" "+ alumnoInt.getApellido()+ " "+alumnoInt.getInstituto()
        +" "+alumnoInt.getPais());
        System.out.println("profesor = " + profesor.getNombre()+" "+profesor.getApellido()+" "+profesor.getAsignatura());

        Class clase= alumnoInt.getClass();
        while (clase.getSuperclass() !=null){
            String hija= clase.getName();
            String padre= clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre "+ padre);
            clase = clase.getSuperclass();
        }

    }
}

/*
para hacer un cast seria:

        Persona alumno= Alumno();
        alumno.setNombre("Lucas");
        alumno.setApellido("Martinez");
        ((Alumno)alumno).setInstituto(" Isidre Martir");

         System.out.println("alumno = " + alumno.getNombre()+" "+alumno.getApellido()+ " "+ ((Alumno)alumno).getInstituto);
 */
