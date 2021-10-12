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
public class LibroNodo {
    private Libro libro;
    private LibroNodo next;

    public LibroNodo(Libro libro, LibroNodo next) {
        this.libro = libro;
        this.next = next;
    }

    public LibroNodo() {
        this.libro = null;
        this.next = null;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro Libro) {
        this.libro = Libro;
    }

    public LibroNodo getNext() {
        return next;
    }

    public void setNext(LibroNodo next) {
        this.next = next;
    }
}
