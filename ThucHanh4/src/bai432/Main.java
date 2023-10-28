/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai432;

/**
 *
 * @author thanh
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileTReader implements Runnable {
    private String fileName;

    public FileTReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\" + fileName));
            String line;

            System.out.println("Nội dung của tập tin " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new FileTReader("file1.txt"));
        Thread thread2 = new Thread(new FileTReader("file2.txt"));
        Thread thread3 = new Thread(new FileTReader("file3.txt"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

