/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author cardonapablo
 */
public class Libro {
    public String titulo;
    public String autor;
    public boolean disponible;
    public short paginas;

    public Libro(String titulo, String autor, boolean disponible, short paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        this.paginas = paginas;
    }
}
