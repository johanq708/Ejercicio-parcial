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
public abstract class Person {
    protected String nombre;
    protected String apellido;
    protected int salario;

    public Person(String nombre, String apellido, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getSalario() {
        return salario;
    }
}
