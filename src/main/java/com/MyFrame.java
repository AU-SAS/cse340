package com;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame {

    private final JFrame frame;
    private final JLabel label;
    private String name;

    public MyFrame() {
        // 1. Create a new JFrame instance with a title
        frame = new JFrame("My Basic JFrame");

        // 2. Set the size of the frame (width, height)
        frame.setSize(400, 300);

        // 3. Set the default close operation (exit the application on close)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Optional: Add a simple component like a JLabel
        name = "Hello, JFrame!";
        label = new JLabel(name);
        JButton comp = new JButton("Click Me!");
        comp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        frame.add(comp);

        // 4. Make the frame visible

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.label.setText(name);
    }

    public void run() {
        frame.setVisible(true);
    }

}