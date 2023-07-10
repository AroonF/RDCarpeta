/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.renombrar;

import java.io.File;

/**
 *
 * @author aroon
 */
public class Directorios {
    public static void renombrarCarpetas(File path){
        if(path.isDirectory()){
             String namePath = path.getName()+"_nuevo";
             File newPath = new File(path.getParentFile(),namePath);
             path.renameTo(newPath);
             
             File[] subDirectorios = newPath.listFiles();
             if(subDirectorios != null){
                 renombrarSubCarpetas(subDirectorios,0);
            }
       }   
    }
    public static void renombrarSubCarpetas(File[] subdirectorios, int index){
        if(index<subdirectorios.length){
            File subDirectorio = subdirectorios[index];
            renombrarCarpetas(subDirectorio);
            renombrarSubCarpetas(subdirectorios, index+1);
        }
    }
}
