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
public class Faculty extends Employee{
    private String rango;

    public Faculty(String rango, String oficina, String fechaContra, String nombre, String apellido, int salario) {
        super(oficina, fechaContra, nombre, apellido, salario);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }
    
}
