/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_estudio;

import java.util.ArrayList;

/**
 *
 * @author johit
 */
public class Universidad_SA {
    private ArrayList<Person> personas;
    
    public Universidad_SA(){
        this.personas=new ArrayList<>();
    }

    public ArrayList<Person> getPersonas() {
        return personas;
    }
    
    public int gerente(){
        int salarioStaff=0;
        for(int i=0;i<this.personas.size();i++){
            if(this.personas.get(i) instanceof Staff){
                salarioStaff+=this.personas.get(i).getSalario();
            }
        }
        return salarioStaff;
    }
    
    public int salarioTotal(){
        int salarioTotal=0;
        for(int i=0;i<this.personas.size();i++){
            salarioTotal+=this.personas.get(i).getSalario();
        }
        return salarioTotal;
    }
}
