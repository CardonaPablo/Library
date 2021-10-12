/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

import Library.Libro;

/**
 *
 * @author cardonapablo
 */
public class Libros {
    private LibroNodo top;
    public short length;

    public Libros() {
        this.top = null;
        this.length = 0;
    }
    
    public void push(Libro libro) {
        LibroNodo newNode = new LibroNodo(libro, this.top);
        this.top = newNode;
        this.length++;
    }
    
    public Libro pop() {
        if(this.isEmpty())
            return null;
        Libro c = this.top.getLibro();
        this.top = this.top.getNext();
        this.length--;
        return c;
    }
    
    public void clear() {
        this.length = 0;
        this.top = null;
    }
    
    private boolean isEmpty() {
        return this.length == 0 && this.top == null;
    }
    
    public Libro search(String name) {
       
        if(this.isEmpty())
            return null;
        
        LibroNodo aux = this.top;
        while(aux != null) {
            String cName = aux.getLibro().getName();
            if(cName.equals(name))
                return aux.getLibro();
            aux = aux.getNext();
        }
        return null;
    }
    
    public Libro[] getAllLibros() {
        Libro[] Libros = new Libro[this.length];
        LibroNodo aux = this.top;
        for(int i = 0; i < this.length; i++, aux = aux.getNext()) {
            Libros[i] = aux.getLibro();
        }
        return Libros;
    }

    public short getLength() {
        return length;
    }
}
