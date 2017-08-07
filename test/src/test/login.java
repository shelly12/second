/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.*;
import java.io.*;
import java.awt.event.*;

/**
 *
 * @author WIN8.1
 */
public class login implements ActionListener {
    JFrame login_frame;
    JLabel Login;
    JLabel enter_reg_no;
    JLabel enter_password;
    JTextField reg_no;
    JPasswordField password;
    JButton give_test;
    JButton result;
    JLabel wrong_detail;
    login()
    {
        login_frame=new JFrame("login");
        Login=new JLabel("--------------------LOGIN PROCESS----------------------");
        enter_reg_no=new JLabel("reg. no:");
        enter_password=new JLabel("password:");
        reg_no=new JTextField();
        password=new JPasswordField();
        give_test=new JButton("submit to give test");
        result=new JButton("submit to see result");
        wrong_detail=new JLabel();
        Login.setBounds(100,50,500, 100);
        enter_reg_no.setBounds(100, 200, 100, 30);
        enter_password.setBounds(100, 250, 100, 30);
        reg_no.setBounds(200, 200, 100, 30);
        password.setBounds(200, 250, 100, 30);
        give_test.setBounds(50, 300, 200, 30);
        result.setBounds(250,300,200,30);
        wrong_detail.setBounds(100, 350, 400, 100);
        give_test.addActionListener(this);
        result.addActionListener(this);
        login_frame.add(Login);login_frame.add(enter_reg_no);login_frame.add(enter_password);login_frame.add(reg_no);login_frame.add(password);login_frame.add(give_test);login_frame.add(wrong_detail);login_frame.add(result);
        login_frame.setSize(500, 500);
        login_frame.setLayout(null);
        login_frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="submit to give test")
        {
            boolean b = false;
            try{
            b=check_record();
                
            }
            catch(Exception x)
            {
                System.out.println(e);
            }
            if(!b)
            {
                wrong_detail.setText("invalid registeration no. or password");
            }
            else {
                login_frame.dispose();
                try{
                    if(!check()){
                        JOptionPane.showMessageDialog(login_frame,"sorry!!you have already given the test.");
                        String args[]={};
                        Test.main(args);
                    }
                    else
                    {
                       quiz q=new quiz(reg_no.getText());  
                    }
                    
                }catch(Exception y){}
            }
        }
        else if(e.getActionCommand()=="submit to see result")
        {
            boolean b = false;
            try{
            b=check_record();
                
            }
            catch(Exception x)
            {
                System.out.println(e);
            }
            if(!b)
            {
                wrong_detail.setText("invalid registeration no. or password");
            }
            else {
                login_frame.dispose();
                try{
                result r=new result(reg_no.getText());
                }catch(Exception x)
                {
                    System.out.println(x);
                }
            }
        }
    }
    public boolean check_record()throws Exception
    {
        boolean b=false;
        FileReader fr=new FileReader("C:\\Users\\WIN8.1\\Documents\\NetBeansProjects\\test\\candidates.txt");
        BufferedReader br=new BufferedReader(fr);
        String rno=reg_no.getText();
        char pass[]=password.getPassword();
        String password=String.valueOf(pass);
        String input;
        while((input=br.readLine())!=null)
        {
            String[] words=input.split("\\s");
            if(rno.equals(words[0]))
            {
                if(password.equals(words[2]))
                {
                    b=true;
                }
                break;
            }
        }
        return b;
    }
    public boolean check()throws Exception
    {
        FileReader fr=new FileReader("C:\\Users\\WIN8.1\\Documents\\NetBeansProjects\\test\\marks.txt");
        BufferedReader br=new BufferedReader(fr);
        String input;
        while((input=br.readLine())!=null)
        {
            String words[]=input.split("\\s");
            if(words[0].equals(reg_no.getText()))
            {
                br.close();
                fr.close();
                return false;
            }
        }
        br.close();
        fr.close();
        return true;
    }
  }

