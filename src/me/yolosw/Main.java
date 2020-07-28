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

        button = new JButton("Click");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: ");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panel.add(button);
        panel.add(label);
        panel.setLayout(new GridLayout(0, 1));



        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My gui");
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
        switch (count){
            case 10:
                label.setText("You just clicked " + count + " clicks");
        }
        switch (count){
            case 1000:
                System.exit(0);
        }

    }
}



