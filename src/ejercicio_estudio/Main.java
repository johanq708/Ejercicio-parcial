/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_estudio;

import ejercicio_estudio.Archivo.Archivo;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author Johan Quiñonez Ruiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        Universidad_SA uni=new Universidad_SA();
        Archivo arch=new Archivo();
        arch.sobreEscribir();
    }
    
}
