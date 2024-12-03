package tareas.tarea21;

public class Start {
    /*
    Una compañía maneja empleados y clientes, entre los empleados hay gerentes que manejan presupuesto para su área (modificable) y a todos los empleados se les puede aumentar el sueldo,
     se pide una jerarquía de clase de los tipos de persona mencionados, tomando como base la figura del diagrama UML de clases.

    Para todas las clases de la jerarquía tenga en cuenta los métodos getter, un constructor y el toString() con sobre-escritura, para Gerente además el método setter de presupuesto.

    También incluir una clase main con algún ejemplo de un Gerente e imprimir todos sus datos (y heredados) vía toString().
     */

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Lucas", "Perez", "48975647L", "Barcelona",
                2056.95,1578,
                1897546.58);

        System.out.println(gerente.toString());
    }


}

