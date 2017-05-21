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
public abstract class Employee extends Person{
    protected String oficina;
    protected String fechaContra;

    public Employee(String oficina, String fechaContra, String nombre, String apellido, int salario) {
        super(nombre, apellido, salario);
        this.oficina = oficina;
        this.fechaContra = fechaContra;
    }

    public String getOficina() {
        return oficina;
    }

    public String getFechaContra() {
        return fechaContra;
    }
    
}
