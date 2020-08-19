package com.wilian.clase02;

public class claseInicial {

    public static void main(String[] args) {
        //Creando intancias de la clase libros; creando objetos.
        libros objetoLibro1 = new libros(1, "Programación JAVA", 100, "Deitel");
        libros objetoLibro2 = new libros(2, "Programación PHP", 600, "Deitel");

        //Ejemplo de get y set
        System.out.println("UTILIZANDO GET Y SET");
        //Modificando el atributo NumeroPaginas con un set
        objetoLibro1.setNumeroPaginas(200);
        
        //Obteniendo los datos del atributo NumeroPaginas y mostrandolo
        System.out.println(objetoLibro1.getNumeroPaginas());
        System.out.println(""); //para dejar una linea en blanco

        System.out.println("UTILIZANDO toString()");
         /*utilizando toString() para mostrar los datos de los atributos del objeto
        <objetoLibro1> de la clase <libros>*/
        System.out.println(objetoLibro1.toString());
        System.out.println(""); //para dejar una linea en blanco

        //Practicando con if y else
        System.out.println("UTILIZANDO IF Y ELSE");
        if (objetoLibro1.getNumeroPaginas() < objetoLibro2.getNumeroPaginas()) {
            System.out.println("¡El libro 2 tiene más páginas que el libro 1: " + objetoLibro2.getNumeroPaginas() + " páginas! \n");
            System.out.println("La información del libro 2 es: \n" + objetoLibro2.toString());
        } else {
            System.out.println("¡El libro 1 tiene más páginas que el libro 2: " + objetoLibro1.getNumeroPaginas() + " páginas! \n");
            System.out.println("La información del libro 1 es: \n" + objetoLibro1.toString());
        }

    }

}
