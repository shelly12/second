/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author WIN8.1
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
public class Test implements ActionListener{
    /**
     * @param args the command line arguments
     */
    JFrame test;
    JButton login;
    JButton register;
    JLabel l;
    JLabel heading;
    Test()
    {
      test=new JFrame("SWING");
      login=new JButton("login");
      register=new JButton("register");
      l=new JLabel("click login if already registered else click register");
      heading=new JLabel("-------------------------------JAVA QUIZ---------------------------------");
      heading.setBounds(100,10 , 400, 100);
      l.setBounds(100, 80, 300, 100);
      login.setBounds(100, 200, 100, 30);
      register.setBounds(200, 200, 100, 30);
      login.addActionListener(this);
      register.addActionListener(this);
      test.add(heading);test.add(l);test.add(login);test.add(register);
      test.setSize(500, 500);
      test.setLayout(null);
      test.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
      test.dispose();
      if(e.getActionCommand()=="register")
      {
          register reg=new register();
      }
      else if(e.getActionCommand()=="login")
      {
          login log=new login();
      }
    }
     public static void main(String[] args){
    
        Test t=new Test();
    }
}
