/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

import Library.Prestamo;

/**
 *
 * @author cardonapablo
 */
public class PrestamoNodo {
    private Prestamo prestamo;
    private PrestamoNodo next;

    public PrestamoNodo(Prestamo prestamo, PrestamoNodo next) {
        this.prestamo = prestamo;
        this.next = next;
    }

    public PrestamoNodo() {
        this.prestamo = null;
        this.next = null;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo Prestamo) {
        this.prestamo = Prestamo;
    }

    public PrestamoNodo getNext() {
        return next;
    }

    public void setNext(PrestamoNodo next) {
        this.next = next;
    }
}
