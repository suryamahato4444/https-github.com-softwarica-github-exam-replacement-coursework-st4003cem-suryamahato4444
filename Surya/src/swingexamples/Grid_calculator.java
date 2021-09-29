package swingexamples;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Grid_calculator implements ActionListener {
    JFrame fr;
    JTextField txt_display;
    JPanel p;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmul,btndiv,btnclr,btneql;
    Font fon_dispaly,btn_font;
    String input="";
    String operator="";
    String first_value;
    String second_value;
    public Grid_calculator(){
        fr=new JFrame("Basic Calculator");

//        fon_dispaly=new Font("arial",Font.BOLD,24);
//        btn_font=new Font("arial",Font.BOLD,16);
//
//        Border bd=BorderFactory.createLineBorder(Color.black,1);
//
//        txt_display=new JTextField("0");
//        txt_display.disable();
//        txt_display.setHorizontalAlignment(JTextField.RIGHT);
//        txt_display.setBorder(bd);
//        txt_display.setFont(fon_dispaly);
//        txt_display.setBackground(Color.white);
//        txt_display.setForeground(Color.black);
//        txt_display.setBounds(20,10,350,50);
//        fr.add(txt_display);
//
//        p=new JPanel();
//        p.setLayout(new GridLayout(4,4));
//        p.setBackground(Color.cyan);
//        p.setBounds(20,70,350,320);
//
//        btn0=new JButton("0");
//        btn0.setFont(btn_font);
//        p.add(btn0);
//
//        btn1=new JButton("1");
//        btn1.setFont(btn_font);
//        btn1.addActionListener(this);
//        p.add(btn1);
//
//        btn2=new JButton("2");
//        btn2.setFont(btn_font);
//        btn2.addActionListener(this);
//        p.add(btn2);
//
//        btn3=new JButton("3");
//        btn3.setFont(btn_font);
//        btn3.addActionListener(this);
//        p.add(btn3);
//
//        btn4=new JButton("4");
//        p.add(btn4);
//
//        btn5=new JButton("5");
//        p.add(btn5);
//
//        btn6=new JButton("6");
//        p.add(btn6);
//
//        btn7=new JButton("7");
//        p.add(btn7);
//
//        btn8=new JButton("8");
//        p.add(btn8);
//
//        btn9=new JButton("9");
//        p.add(btn9);
//
//        btnadd=new JButton("+");
//        btnadd.addActionListener(this);
//        p.add(btnadd);
//
//        btnsub=new JButton("-");
//        btnsub.addActionListener(this);
//        p.add(btnsub);
//
//
//        btnmul=new JButton("*");
//        p.add(btnmul);
//
//        btndiv=new JButton("/");
//        p.add(btndiv);
//
//        btneql=new JButton("=");
//        btneql.addActionListener(this);
//        p.add(btneql);
//
//        btnclr=new JButton("C");
//        btnclr.addActionListener(this);
//        p.add(btnclr);
//
//
//        fr.add(p);
//
//
//        fr.setSize(400,450);
//        fr.setLayout(null);
//        fr.setVisible(true);
//    }
//    public static void main(String[] args){
//        new Grid_calculator();
//    }
//
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        if(e.getSource()==btn1){
//            input=input+"1";
//            txt_display.setText(input);
//        }
//        if(e.getSource()==btn2){
//            input=input+"2";
//            txt_display.setText(input);
//        }
//        if(e.getSource()==btn3){
//            input=input+"3";
//            txt_display.setText(input);
//        }
//
//
//        if(e.getSource()==btnadd){
//            operator="+";
//            first_value=txt_display.getText();
//            input="";
//            txt_display.setText("");
//
//
//        }
//        if(e.getSource()==btnsub){
//            operator="-";
//            first_value=txt_display.getText();
//            input="";
//            txt_display.setText("");
//        }
//
//        if(e.getSource()==btneql){
//            second_value=txt_display.getText();
//            int num1=Integer.parseInt(first_value);
//            int num2=Integer.parseInt(second_value);
//            int result=0;
//            switch(operator) {
//                case "+":result=num1+num2;
//                break;
//                case "-": result=num1-num2;
//                break;
//            }
//
//
//            txt_display.setText(String.valueOf(result));
//
//        }
//
//        if(e.getSource()==btnclr){
//            input="";
//            txt_display.setText("");
//}

//    }
}
}
