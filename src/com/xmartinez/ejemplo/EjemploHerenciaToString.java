package com.xmartinez.ejemplo;

import com.xmartinez.pooherencia.Alumno;
import com.xmartinez.pooherencia.AlumnoInternacional;
import com.xmartinez.pooherencia.Persona;
import com.xmartinez.pooherencia.Profesor;

public class EjemploHerenciaToString {
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


        imprimir(alumno);

        imprimir(alumnoInt);

        imprimir(profesor);
    }

    public static void imprimir (Persona persona){
        System.out.println("***********************************************************");
        System.out.println(persona.toString());

    }
}
