/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;
import Library.Alumno;

/**
 *
 * @author cardonapablo
 */
public class AlumnoNodo {
    private Alumno alumno;
    private AlumnoNodo next;

    public AlumnoNodo(Alumno alumno, AlumnoNodo next) {
        this.alumno = alumno;
        this.next = next;
    }

    public AlumnoNodo() {
        this.alumno = null;
        this.next = null;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.alumno = Alumno;
    }

    public AlumnoNodo getNext() {
        return next;
    }

    public void setNext(AlumnoNodo next) {
        this.next = next;
    }
}
