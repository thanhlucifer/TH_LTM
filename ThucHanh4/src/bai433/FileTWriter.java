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

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class FileTWriter extends Thread {
    private String fileName;

    public FileTWriter(String fileName) {
        this.fileName = fileName;
    }
     @Override
    public void run() {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            Random random = new Random();

            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                fileWriter.write(Integer.toString(randomNumber) + "\n");
            }

            fileWriter.close();
            System.out.println("Đã ghi dữ liệu vào tập tin " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
