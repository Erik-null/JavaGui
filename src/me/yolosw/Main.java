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
    JLabel pewBackground;

    public Main(){

        button = new JButton("Click");
        button.setBounds(50, 50, 100, 30);
        button.addActionListener(this);
        button.setBackground(Color.CYAN);

        label = new JLabel("Number of brofists: " + count);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        panel.add(label);
        panel.add(button);
        panel.setSize(100, 20);
        panel.setLayout(new GridBagLayout());

        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BroFist GUI");
        frame.pack();

        pewBackground = new JLabel();
        pewBackground.setBounds(100, 100, 1200, 700);
        frame.setContentPane(new JLabel((new ImageIcon("C:\\Users\\eriks\\IdeaProjects\\Javaproject\\src\\me\\yolosw\\brofist.png"))));
        frame.add(pewBackground);
        frame.setSize(1000, 1000);
        label.setBounds(110, 50, 1000, 10);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);



    }

    public static void main(String[] args){
        new Main();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText( "Number of brofists: " + count);
        if(count == 10){
            label.setText(count + " Brofists");
        }

    }
}