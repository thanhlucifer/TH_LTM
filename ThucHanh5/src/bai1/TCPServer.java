/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import bai1.ServerThread;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ACER
 */
public class TCPServer {

       static  final int PORT = 1234;
       private ServerSocket server=null;
       public  TCPServer(){
           try{
               server=new ServerSocket(PORT);
           }catch(Exception e){e.printStackTrace();}
       }
       public  void  action(){
           Socket socket =null;
           int i=0;
           System.out.println("Server listening.........");
           try {
               while((socket=server.accept())!=null){
                   new ServerThread(socket,"Clent#"+i);
                   System.out.printf("thread for client#%d generating .....%n",i++);
               }
                   
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
    public static void main(String[] args) {
        new TCPServer().action();
        // TODO code application logic here
    }
    
}
