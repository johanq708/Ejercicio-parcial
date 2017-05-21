/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_estudio;

/**
 *
 * @author Johan Quiñonez Ruiz
 */
public class Staff extends Employee{
    private String titulo;

    public Staff(String titulo, String oficina, String fechaContra, String nombre, String apellido, int salario) {
        super(oficina, fechaContra, nombre, apellido, salario);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
}
