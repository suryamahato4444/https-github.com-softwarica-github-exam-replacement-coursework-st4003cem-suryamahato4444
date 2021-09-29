package swingexamples;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Layout extends JFrame {

    public Layout(){

        initComponents();

    }

    private void initComponents(){

        JPanel panelScreen = new JPanel(new GridLayout(0,1));

        JTextArea screen = new JTextArea();
        panelScreen.add(screen);

        JFrame frame = new JFrame("Surya_Calculator");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panelButtons = new JPanel(new GridLayout(3,3));



        frame.getContentPane().add(panelScreen, BorderLayout.NORTH);
        //frame.getContentPane().add(new JSeparator(), BorderLayout.CENTER);
        frame.getContentPane().add(panelButtons, BorderLayout.SOUTH);
        frame.setBounds(50, 50, 500, 500);
        frame.setResizable(false);
        //frame.pack();
        frame.setVisible(true);


    }


    public static void main(String[] args) {

        new Layout();

    }

}