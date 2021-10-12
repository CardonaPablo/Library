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
public class Prestamos {
    private PrestamoNodo top;
    public short length;

    public Prestamos() {
        this.top = null;
        this.length = 0;
    }
    
    public void push(Prestamo prestamo) {
        PrestamoNodo newNode = new PrestamoNodo(prestamo, this.top);
        this.top = newNode;
        this.length++;
    }
    
    public Prestamo pop() {
        if(this.isEmpty())
            return null;
        Prestamo c = this.top.getPrestamo();
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
    
    public Prestamo search(String name) {
       
        if(this.isEmpty())
            return null;
        
        PrestamoNodo aux = this.top;
        while(aux != null) {
            String cName = aux.getPrestamo().getName();
            if(cName.equals(name))
                return aux.getPrestamo();
            aux = aux.getNext();
        }
        return null;
    }
    
    public Prestamo[] getAllPrestamos() {
        Prestamo[] Prestamos = new Prestamo[this.length];
        PrestamoNodo aux = this.top;
        for(int i = 0; i < this.length; i++, aux = aux.getNext()) {
            Prestamos[i] = aux.getPrestamo();
        }
        return Prestamos;
    }

    public short getLength() {
        return length;
    }
}
