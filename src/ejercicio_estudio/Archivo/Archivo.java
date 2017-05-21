/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_estudio.Archivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import ejercicio_estudio.*;
import java.util.Scanner;
/**
 *
 * @author Johan Quiñonez Ruiz
 */
public class Archivo {
    private File a;
    Scanner scanner;
    public Archivo() throws FileNotFoundException{
        this.a=new File("datos.txt");
        this.scanner=new Scanner(this.a);
    }
    public void escribir(Universidad_SA u) throws FileNotFoundException{
        PrintStream p=new PrintStream(a);
        for(int i=0;i<u.getPersonas().size();i++){
            if(u.getPersonas().get(i) instanceof Student){
                Student e=(Student)u.getPersonas().get(i);
                p.print("Estudiante, ");
                p.print(e.getNombre()+", ");
                p.print(e.getApellido()+", ");
                p.print(e.getStatus()+".");
                p.println();
            }else
            if(u.getPersonas().get(i) instanceof Faculty){
                Faculty f=(Faculty)u.getPersonas().get(i);
                p.print("Facultad, ");
                p.print(f.getRango()+", ");
                p.print(f.getOficina()+", ");
                p.print(f.getFechaContra()+", ");
                p.print(f.getNombre()+", ");
                p.print(f.getApellido()+", ");
                p.print(f.getSalario()+".");
                p.println();
            }else
            if(u.getPersonas().get(i) instanceof Employee){
                Staff s=(Staff)u.getPersonas().get(i);
                p.print("Staff, ");
                p.print(s.getTitulo()+", ");
                p.print(s.getOficina()+", ");
                p.print(s.getFechaContra()+", ");
                p.print(s.getNombre()+", ");
                p.print(s.getApellido()+", ");
                p.print(s.getSalario()+".");
                p.println();
            }
        }
    }
    public static char AsciiDecToChar(int leido){
        return (char)leido;
    }
    public char[] desencriptar(String d){
        char[]cambio=d.toCharArray();
        for(int i=6;i<d.length();i++){
            int car=d.codePointAt(i);
            if(((car>67)&&(car<91))||(car>99)&&(car<123)){
                cambio[i]=AsciiDecToChar(d.codePointAt(i)-3);
            }else
            if(((car>64)&&(car<68))||(car>96)&&(car<100)){
                cambio[i]=AsciiDecToChar(d.codePointAt(i)+23);
            }else{
                cambio[i]=AsciiDecToChar(d.codePointAt(i));
            }
        }
        return cambio;
    }
    public void sobreEscribir() throws FileNotFoundException{
        while(this.scanner.hasNext()){
            String escan=this.scanner.next();
            if(escan.equalsIgnoreCase("student")||escan.equalsIgnoreCase("faculty")||escan.equalsIgnoreCase("staff")){
                System.out.print(escan);
            }else{
                System.out.println(this.desencriptar(escan));
            }
        }
    }
}
