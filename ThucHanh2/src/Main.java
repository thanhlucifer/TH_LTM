/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Random;

/**
 *
 * @author thanh
 */
public class Main {
    private static final String FILE_PATH = "D:\\phanso.dat";

    private static void savePhanSoToFile(PhanSo[] phanSoArr) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            outputStream.writeObject(phanSoArr);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static PhanSo[] readPhanSoFromFile() {
        PhanSo[] phanSoArr = null;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            phanSoArr = (PhanSo[]) inputStream.readObject();
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return phanSoArr;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Phan So");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton generateButton = new JButton("Tạo phân số ngẫu nhiên");
        JTextArea resultTextArea = new JTextArea();
        JButton displayPrimesButton = new JButton("Hiển thị phân số có mẫu là số nguyên tố");
        JButton displayNonPrimesButton = new JButton("Hiển thị phân số có mẫu không là số nguyên tố");

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                PhanSo[] phanSoArr = new PhanSo[5];
                for (int i = 0; i < 5; i++) {
                    int tuSo = random.nextInt(10) + 1;
                    int mauSo = random.nextInt(10) + 1;
                    PhanSo phanSo = new PhanSo(tuSo, mauSo);
                    phanSoArr[i] = phanSo;
                }
                savePhanSoToFile(phanSoArr);
                JOptionPane.showMessageDialog(null, "Đã tạo và lưu phân số ngẫu nhiên vào file.");
                
            }
        });

        displayPrimesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PhanSo[] phanSoArr = readPhanSoFromFile();
                StringBuilder result = new StringBuilder();
                for (PhanSo phanSo : phanSoArr) {
                    if (phanSo.isMauSoNguyenTo()) {
                        result.append(phanSo).append("\n");
                    }
                }
                resultTextArea.setText(result.toString());
            }
        });

        displayNonPrimesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PhanSo[] phanSoArr = readPhanSoFromFile();
                StringBuilder result = new StringBuilder();
                for (PhanSo phanSo : phanSoArr) {
                    if (!phanSo.isMauSoNguyenTo()) {
                        result.append(phanSo).append("\n");
                    }
                }
                resultTextArea.setText(result.toString());
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(generateButton);
        frame.add(resultTextArea);
        frame.add(displayPrimesButton);
        frame.add(displayNonPrimesButton);

        frame.setVisible(true);
    }
}
