/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai433;

/**
 *
 * @author HUUHAO_PC
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class FileRead extends Thread{
    String name;
    public FileRead(String ten){
        this.name = ten;
    }
    public void load(){
        try{
            FileReader fvao = new FileReader(name);
            BufferedReader br = new BufferedReader(fvao);
            int c;
            while((c = br.read()) != -1){
                System.out.println(this.name + ":" +(char)c); 
            }
            br.close();
            fvao.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,ex.toString(),"Thong bao loi",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
