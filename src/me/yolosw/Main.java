package me.yolosw;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    int count = 0;
    JLabel label;
    JPanel panel;
    JFrame frame;
    JButton button;

    public Main(){



        label = new JLabel("Number of clicks: ");

        button = new JButton("Click");
        button.getPreferredSize().getHeight();
        button.setBounds(50, 50, 100, 30);
        button.addActionListener(this);
// g
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(200, 300, 200, 300));
        panel.add(button);
        panel.add(label);
        panel.setSize(10, 20);
        panel.setLayout(null);



        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My gui");
        frame.setSize(100, 100);
        frame.pack();
        frame.setVisible(true);


    }
    public static void main(String[] args){
        new Main();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
        if (count == 10) {
            label.setText("You just clicked " + count + " clicks");
        }
        if (count == 1000) {
            System.exit(0);
        }

    }
}



