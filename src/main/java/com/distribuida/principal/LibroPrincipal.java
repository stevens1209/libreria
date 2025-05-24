package com.distribuida.principal;

import com.distribuida.entities.Libro;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Autor;

public class LibroPrincipal {
    public static void main(String[] Args){

        Categoria categoria = new Categoria(1,"Novelas","Relatos");
        Autor autor = new Autor(1,"Michael","Caiza","Ecuador","Puembo","0984863102","mcchilcanan@outlook.com");
        Libro libro = new Libro(1,"Habitos Atomicos","Roca editorial",300,"Primera Edicion","Esp","Superacion","Pasta blanda","001-01-001",10,"azul","Libro de bolsillo","10.99");

        libro.setCategoria(categoria);
        libro.setAutor(autor);

        System.out.println(libro.toString());

    }
}
