/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai632;

/**
 *
 * @author thanh
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

public class MulticastChatApp extends JFrame {
    private JTextField messageField;
    private JTextArea chatArea;
    private MulticastSocket socket;
    private InetAddress group;
    private int port = 6789;
    private String username;

    public MulticastChatApp() {
        // Yêu cầu người dùng nhập tên
        username = JOptionPane.showInputDialog("Nhập tên của bạn:");

        setTitle("Multicast Chat App");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        messageField = new JTextField();
        chatArea = new JTextArea();
        chatArea.setEditable(false);

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(messageField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        add(chatArea, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);
    }

    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
            try {
                message = username + ": " + message; // Thêm tên vào tin nhắn
                DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), group, port);
                socket.send(packet);
                messageField.setText("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class Receiver implements Runnable {
        public void run() {
            try {
                while (true) {
                    byte[] buffer = new byte[1000];
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                    socket.receive(packet);
                    String message = new String(buffer, 0, packet.getLength());
                    chatArea.append(message + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MulticastChatApp app = new MulticastChatApp();
                app.setVisible(true);

                try {
                    app.socket = new MulticastSocket(app.port);
                    app.group = InetAddress.getByName("224.0.0.1");
                    app.socket.joinGroup(app.group);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Thread receiverThread = new Thread(app.new Receiver());
                receiverThread.start();
            }
        });
    }
}
