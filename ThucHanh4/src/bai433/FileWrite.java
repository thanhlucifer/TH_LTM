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

import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.JOptionPane;


public class FileWrite extends Thread{
    private static final int XSIZE = 10;
    private int x;
    private String name;
    
    public FileWrite(String ten){
        this.name = ten;
    }
    public void nhap(){
        try{
            FileWriter fra = new FileWriter(name);
            BufferedWriter bw = new BufferedWriter(fra);
            
            Random rd = new Random();
            for(int i=0; i<XSIZE; i++){
                x= rd.nextInt(XSIZE);
                if(i==9)
                    bw.write(String.valueOf(x));
                else
                    bw.write(String.valueOf(x)+",");
            }
            bw.close();
            fra.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,ex.toString(),"Thong bao loi",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void nhap2(String dlVao){
        try{
            FileWriter fra = new FileWriter(name);
            BufferedWriter bw = new BufferedWriter(fra);
            bw.write(dlVao);
            bw.close();
            fra.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,ex.toString(),"Thong bao loi",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
