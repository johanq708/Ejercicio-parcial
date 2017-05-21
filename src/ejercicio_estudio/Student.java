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
public class Student extends Person{
    private String status;

    public Student(String status, String nombre, String apellido, int salario) {
        super(nombre, apellido, salario);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
}
