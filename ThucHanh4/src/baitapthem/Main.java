/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapthem;

/**
 *
 * @author thanh
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class FileTWriter implements Runnable {
    private String fileName;

    public FileTWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\" + fileName));

            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                writer.write(Integer.toString(randomNumber) + " ");
            }

            writer.close();
            System.out.println("Đã viết vào tập tin " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new FileTWriter("file1.txt"));
        Thread thread2 = new Thread(new FileTWriter("file2.txt"));
        Thread thread3 = new Thread(new FileTWriter("file3.txt"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
