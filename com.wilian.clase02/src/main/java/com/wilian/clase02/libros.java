package com.wilian.clase02;

public class libros {

    private int Id; // Abstrayendo atributos del objeto 
    private String NombreLibro;
    private int NumeroPaginas;
    private String Autor;

    /*A traves del constructor se solicitara el ingreso de los datos 
    necesarios para los atributos de la clase*/
    public libros(int Id, String NombreLibro, int NumeroPaginas, String Autor) {
        this.Id = Id;                       //Asignando los datos
        this.NombreLibro = NombreLibro;     //obtenidos, a los respectivos
        this.NumeroPaginas = NumeroPaginas; //atributos de la clase libros
        this.Autor = Autor;
    }
    
    /*Con el get y set se obtendran o modificaran los datos de los atributos;
    get para obtener un dato y mostrarlo, y set para modificar el dato 
    del atributo*/
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /*Sera llamado para mostrar los datos que se almacenan en los atributos
    de la clase libros; el nombre del atributo y el dato contenido*/
    @Override
    public String toString() {
        return "libros{" + "Id=" + Id + ", NombreLibro=" + NombreLibro + ", NumeroPaginas=" + NumeroPaginas + ", Autor=" + Autor + '}';
    }

}
