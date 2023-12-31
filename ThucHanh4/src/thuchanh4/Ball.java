/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh4;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author ADMIN
 */
public class Ball {
    private final JPanel box;
    private static final int XSIZE = 10;
    private static final int YSIZE = 10;
    private int x = 0;
    private int y = 0;
    private int dx = 2;
    private int dy = 2;
    public Ball(JPanel p){
        box = p;
    }
    public void draw(){
        Graphics g = box.getGraphics();
        g.fillOval(x, y, XSIZE, YSIZE);
        g.dispose();
    }
    public void move(){
        Graphics g = box.getGraphics();
        g.setXORMode(Color.CYAN);
        g.fillOval(x, y, XSIZE, YSIZE);
        x += dx;
        y += dy;
        Dimension d = box.getSize();
        if(x < 0){
            x = 0;
            dx = -dx;
        }
        if(x + XSIZE >= d.getWidth()){
            x = d.width - XSIZE;
            dx = -dx;
        }
        if(y < 0){
            y = 0;
            dy = -dy;
        }
        if(y + YSIZE >= d.getHeight()){
            y = d.height - YSIZE;
            dy = -dy;
        }
        g.fillOval(x, y, dx, XSIZE);
        g.dispose();
    }
    public void bounce(){
        draw();
        for(int i = 0; i < 1000; i++){
            move();
            try{
                Thread.sleep(5);
            }catch(InterruptedException ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }
}
