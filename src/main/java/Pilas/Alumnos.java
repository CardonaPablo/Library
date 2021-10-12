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
public class Alumnos {
    private AlumnoNodo top;
    public short length;

    public Alumnos() {
        this.top = null;
        this.length = 0;
    }
    
    public void push(Alumno alumno) {
        AlumnoNodo newNode = new AlumnoNodo(alumno, this.top);
        this.top = newNode;
        this.length++;
    }
    
    public Alumno pop() {
        if(this.isEmpty())
            return null;
        Alumno c = this.top.getAlumno();
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
    
    public Alumno search(String name) {
       
        if(this.isEmpty())
            return null;
        
        AlumnoNodo aux = this.top;
        while(aux != null) {
            String cName = aux.getAlumno().getName();
            if(cName.equals(name))
                return aux.getAlumno();
            aux = aux.getNext();
        }
        return null;
    }
    
    public Alumno[] getAllAlumnos() {
        Alumno[] Alumnos = new Alumno[this.length];
        AlumnoNodo aux = this.top;
        for(int i = 0; i < this.length; i++, aux = aux.getNext()) {
            Alumnos[i] = aux.getAlumno();
        }
        return Alumnos;
    }

    public short getLength() {
        return length;
    }
    
}
