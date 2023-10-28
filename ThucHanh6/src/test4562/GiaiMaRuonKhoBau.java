/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4562;

/**
 *
 * @author thanh
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiaiMaRuonKhoBau extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton decodeButton;
    private JLabel resultLabel;
  private JTextArea resultTextArea; // Changed from JLabel to JTextArea
    public GiaiMaRuonKhoBau() {
        setTitle("Giải Mã Rương Kho Báu");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel inputLabel = new JLabel("Nhập đoạn code:");
        inputLabel.setBounds(50, 30, 150, 30);
        add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(200, 30, 150, 30);
        add(inputField);

        decodeButton = new JButton("Giải mã");
        decodeButton.setBounds(150, 80, 100, 30);
        decodeButton.addActionListener(this);
        add(decodeButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(50, 120, 300, 60);
        add(resultLabel);
        
          resultTextArea = new JTextArea(); // Changed from JLabel to JTextArea
        resultTextArea.setBounds(50, 120, 300, 200); // Set bounds
        resultTextArea.setEditable(false); // Make it non-editable
        add(resultTextArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == decodeButton) {
            String input = inputField.getText().replaceAll("\\s", "").toUpperCase();
            int[] frequency = new int[9];

            for (char c : input.toCharArray()) {
                int value = getValue(c);
                if (value != -1) {
                    frequency[value - 1]++;
                }
            }

            int key4 = 0;
            int key5 = 0;

            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > 1) {
                    key4 += i + 1;
                }
                if (frequency[i] == 0) {
                    key5 += i + 1;
                }
            }

            int key6 = 0;
            for (int i : frequency) {
                if (i == 0) {
                    key6++;
                }
            }
 
            
            int key1 = getKey1(input);
            int key2 = getKey2(input);
            int key3 = getKey3(input);
            
            key4 = getKeyInRange(key4);
            key5 = getKeyInRange(key5);

              resultTextArea.setText("Chìa khóa số 1: " + key1 + "\nChìa khóa số 2: " + key2
                    + "\nChìa khóa số 3: " + key3 + "\nChìa khóa số 4: " + key4
                    + "\nChìa khóa số 5: " + key5 + "\nChìa khóa số 6: " + key6);
        }
    }

    private int getKey1(String input) {
        int sum = 0;
        for (char c : input.toCharArray()) {
            int value = getValue(c);
            if (value != -1) {
                sum += value;
            }
        }
        return getKeyInRange(sum);
    }

    private int getKey2(String input) {
        int sum = 0;
        for (char c : input.toCharArray()) {
            if ("AEIOUYaeiouy".indexOf(c) != -1) {
                int value = getValue(c);
                if (value != -1) {
                    sum += value;
                }
            }
        }
        return getKeyInRange(sum);
    }

    private int getKey3(String input) {
        int sum = 0;
        for (char c : input.toCharArray()) {
            if ("BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz".indexOf(c) != -1) {
                int value = getValue(c);
                if (value != -1) {
                    sum += value;
                }
            }
        }
        return getKeyInRange(sum);
    }
    private int getValue(char c) {
        switch (c) {
            case 'A': case 'J': case 'S':
                return 1;
            case 'B': case 'K': case 'T':
                return 2;
            case 'C': case 'L': case 'U':
                return 3;
            case 'D': case 'M': case 'V':
                return 4;
            case 'E': case 'N': case 'W':
                return 5;
            case 'F': case 'O': case 'X':
                return 6;
            case 'G': case 'P': case 'Y':
                return 7;
            case 'H': case 'Q': case 'Z':
                return 8;
            case 'I': case 'R':
                return 9;
            default:
                return -1;
        }
    }

    private int getKeyInRange(int key) {
        while (key > 9) {
            key = reduceToSingleDigit(key);
        }
        return key;
    }

    private int reduceToSingleDigit(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        GiaiMaRuonKhoBau program = new GiaiMaRuonKhoBau();
        program.setVisible(true);
    }
}

