package swingexamples;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame fr;
    JTextField txt_display;
    JPanel p;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmul,btndiv,btnclr,btneql;
    
    Font fon_dispaly,btn_font;
    String input="";
    String operator="";
    String first_value;
    String second_value;
    String final_result;
   
    public Calculator(){
        fr=new JFrame("Surya_Calculator");

        fon_dispaly=new Font("arial",Font.BOLD,30);
        btn_font=new Font("arial",Font.BOLD,30);

        Border bd=BorderFactory.createLineBorder(Color.white,1);

        txt_display=new JTextField("0");
        txt_display.disable();
        txt_display.setHorizontalAlignment(JTextField.RIGHT);
        txt_display.setBorder(bd);
        txt_display.setFont(fon_dispaly);
        txt_display.setBackground(Color.black);
        txt_display.setForeground(Color.black);
        txt_display.setBounds(20,10,350,50);
        fr.add(txt_display);

        p=new JPanel();
        p.setLayout(new GridLayout(4,5));
        p.setBackground(Color.cyan);
        p.setBounds(20,70,350,320);
        
        
        btn1=new JButton("1");
        btn1.setFont(btn_font);
        btn1.addActionListener(this);
        p.add(btn1);
        
        
        btn2=new JButton("2");
        btn2.setFont(btn_font);
        btn2.addActionListener(this);
        p.add(btn2);
        
        

        btn3=new JButton("3");
        btn3.setFont(btn_font);
        btn3.addActionListener(this);
        p.add(btn3);
        
        
        btnclr=new JButton("C");
        btnclr.setFont(btn_font);
        btnclr.addActionListener(this);
        p.add(btnclr);
        
        

        btn4=new JButton("4");
        btn4.setFont(btn_font);
        btn4.addActionListener(this);
        p.add(btn4);
        
        btn5=new JButton("5");
        btn5.setFont(btn_font);
        btn5.addActionListener(this);
        p.add(btn5);

        btn6=new JButton("6");
        btn6.setFont(btn_font);
        btn6.addActionListener(this);
        p.add(btn6);
        
        btndiv=new JButton("/");
        btndiv.setFont(btn_font);
        btndiv.addActionListener(this);
        p.add(btndiv);
        
        
        btn7=new JButton("7");
        btn7.setFont(btn_font);
        btn7.addActionListener(this);
        p.add(btn7);

        btn8=new JButton("8");
        btn8.setFont(btn_font);
        btn8.addActionListener(this);
        p.add(btn8);

        btn9=new JButton("9");
        btn9.setFont(btn_font);
        btn9.addActionListener(this);
        p.add(btn9);
        
        btnmul=new JButton("*");
        btnmul.setFont(btn_font);
        btnmul.addActionListener(this);
        p.add(btnmul);


        btn0=new JButton("0");
        btn0.setFont(btn_font);
        btn0.addActionListener(this);
        p.add(btn0);

       
  
        btnadd=new JButton("+");
        btnadd.setFont(btn_font);
        btnadd.addActionListener(this);
        p.add(btnadd);
        

        btnsub=new JButton("-");
        btnsub.setFont(btn_font);
        btnsub.addActionListener(this);
        p.add(btnsub);
        

        btneql=new JButton("=");
        btneql.setFont(btn_font);
        btneql.addActionListener(this);
        p.add(btneql);

       

        fr.add(p);


        fr.setSize(400,450);
        fr.setLayout(null);
        fr.setVisible(true);
    }
    public static void main(String[] args){
        new Calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btn1){
            input=input+"1";
            txt_display.setText(input);
          
        }
        if(e.getSource()==btn2){
            input=input+"2";
            txt_display.setText(input);
        }
        if(e.getSource()==btn3){
            input=input+"3";
            txt_display.setText(input);
        }
    
    if(e.getSource()==btn4){
        input=input+"4";
        txt_display.setText(input);
        
    }
    if(e.getSource()==btn5){
        input=input+"5";
        txt_display.setText(input);
    }
    
    if(e.getSource()==btn6){
        input=input+"6";
        txt_display.setText(input);
        
    }

    if(e.getSource()==btn7){
        input=input+"7";
        txt_display.setText(input);
        
    }
    if(e.getSource()==btn8){
        input=input+"8";
        txt_display.setText(input);
    

    }
    if(e.getSource()==btn9){
        input=input+"9";
        txt_display.setText(input);
    

    }
    if(e.getSource()==btn0){
        input=input+"0";
        txt_display.setText(input);
    }
   
   
        if(e.getSource()==btnadd){
            operator="+";
            first_value=txt_display.getText();
//            second_value=txt_display.getText();
            
            input="";
            txt_display.setText("+");
           


   }
        
        if(e.getSource()==btnmul){
            operator="*";
            first_value=txt_display.getText();
            input="";
            txt_display.setText("*");


  }
        if(e.getSource()==btndiv){
            operator="/";
            first_value=txt_display.getText();
            input="";
            txt_display.setText("/");

  }
        if(e.getSource()==btnsub){
            operator="-";
            first_value=txt_display.getText();
            input="";
            txt_display.setText("-");
  }

        if(e.getSource()==btneql){
            second_value=txt_display.getText();
            float num1=Integer.parseInt(first_value);
            float num2=Integer.parseInt(second_value);
            
            float result=0;
            switch(operator) {
                case "+":result=num1+num2;
                break;
                case "-": result=num1-num2;
                break;
                case "*": result=num1*num2;
                break;
                case "/": result=num1/num2;
                break;

       
                
           }
            final_result=first_value+operator+second_value+"="+result;
            txt_display.setText(String.valueOf(final_result));


//            txt_display.setText(String.valueOf(first_value+operator+second_value+"="+result));

        }

        if(e.getSource()==btnclr){
            input="";
            txt_display.setText("");
        }
    }
    }


