/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Vinyard82
 */
public class LeerLista {
    File fich;
    Scanner sc;
    ArrayList <String> list = new ArrayList<>();
    PrintWriter f= null;
    
     public void escribirTexto(String nombreFich){
        
        try {
            f=new PrintWriter(new FileWriter(nombreFich,true));
            f=new PrintWriter(fich);
            for(int i=0; i<list.size(); i++){
                f.print(list.get(i));
            }
            f.println("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally{
            f.close();
        }
        
    }
    public void leer(String lista){
        lista=JOptionPane.showInputDialog("Lista:");
        lista=sc.nextLine();
        String texto[] = lista.split(" ");
        list.addAll(Arrays.asList(texto));
        Collections.sort(list);
        escribirTexto("file.txt");
        }
    }
    

