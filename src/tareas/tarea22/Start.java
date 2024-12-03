package tareas.tarea22;

public class Start {
    /*
    Para la tarea se pide desarrollar un diseño orientado a objetos para un almacén y verdulería, como requerimiento vamos a tener 4 clases de productos Fruta, Limpieza, Lacteo y NoPerecible, todas tiene en común dos atributos el nombre (string)
    y precio (double) que deben heredar de la clase padre Producto, pero ademas cada una van a tener dos atributos propios adicionales, sus métodos getter y constructor para inicializar los 4 atributos (los 2 del padre y los 2 propios).

    Para el ejemplo de la clase main se pide crear dos objetos por cada tipo de producto que deben ser almacenados en un arreglo del tipo Producto, se debe mostrar iterando el arreglo,
    por cada uno el detalle completo, el precio, nombre y los atributos adicionales.
     */
    public static void main(String[] args) {

        Lacteo leche = new Lacteo("Leche", 0.93, 10,12);
        Lacteo yogurt= new Lacteo("Yogurt", 0.87, 12,6);

        Fruta manzana= new Fruta("Manzana", 0.56,0.250,"Rojo");
        Fruta pera = new Fruta("Pera", 0.89,0.654, "Verde");

        Limpieza lejia= new Limpieza("Lejía", 2.60, "Hipoclorito sódico: 26.7 % Agua desionizada: 73.3%", 2.0);
        Limpieza limpiacristales= new Limpieza("Limpiacristales", 3.65, "Más del 30% de alcohol; menos del 5% de fosfonatos y perfume (coumarin, citronellol)",1.2);

        NoPerecible atun= new NoPerecible("Atún en lata", 3.20,100,240);
        NoPerecible arroz = new NoPerecible("Arroz redondo", 1.03, 1000, 300);

        Producto [] productos= new Producto[8];
        productos[0]= leche;
        productos[1]= yogurt;
        productos[2]= manzana;
        productos[3]= pera;
        productos[4]= lejia;
        productos[5]=limpiacristales;
        productos[6]= atun;
        productos[7]=arroz;

        for (int i=0; i< productos.length; i++){
            Producto producto= productos[i];
            System.out.println(producto.toString());
            System.out.println("*********************************************");
        }

    }
}
