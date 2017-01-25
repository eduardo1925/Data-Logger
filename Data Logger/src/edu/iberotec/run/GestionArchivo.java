package edu.iberotec.run;

import java.io.*;

/**
 * @author Eduadro
 */
public class GestionArchivo {
   FileInputStream entrada;
   FileOutputStream salida;
   File archivo;
   
   public GestionArchivo(){
    
   }
   
   public String AbrirTexto(File archivo){
       String contenido = "";
       try {
           entrada = new FileInputStream(archivo);
           int ascci;
           while((ascci = entrada.read())!= -1){
               char caracter = (char)ascci;
               contenido += caracter;
           }        
       } catch (Exception e) {
       
       }
       return contenido;    
   }

}
