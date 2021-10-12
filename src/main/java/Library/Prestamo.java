/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author cardonapablo
 */
public class Prestamo {
    public boolean retornado;
    public String titulo;
    public String notas;
    public int registro;

    public Prestamo(boolean retornado, String titulo, String notas, int registro) {
        this.retornado = retornado;
        this.titulo = titulo;
        this.notas = notas;
        this.registro = registro;
    }
}
