/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author WIN8.1
 */
public class register implements ActionListener{
    JFrame Reg_frame;
    JLabel registeration;
    JTextField enter_name;
    JPasswordField enter_password;
    JLabel name;
    JLabel password;
    JButton Register;
    JLabel success;
    register()
    {
        Reg_frame=new JFrame("registration");
        registeration=new JLabel("------------------------------REGISTERATION PROCESS--------------------------------------");
        enter_name=new JTextField();
        enter_password=new JPasswordField();
        name=new JLabel("name:");
        password=new JLabel("set password:");
        Register=new JButton("register");
        success=new JLabel();
        registeration.setBounds(50,50, 500, 100);
        name.setBounds(100,200, 100, 30);
        password.setBounds(100, 300, 100, 30);
        enter_name.setBounds(200,200, 100, 30);
        enter_password.setBounds(200,300, 100, 30);
        Register.setBounds(150, 400, 100, 30);
        success.setBounds(100,450,500, 100);
        Register.addActionListener(this);
        Reg_frame.add(success);Reg_frame.add(registeration);Reg_frame.add(enter_name);Reg_frame.add(enter_password);Reg_frame.add(name);Reg_frame.add(password);Reg_frame.add(Register);
        Reg_frame.setSize(600,600);
        Reg_frame.setLayout(null);
        Reg_frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand()=="register")
        {
            try{
            String regno=add_record();
            JOptionPane.showMessageDialog(Reg_frame,"YOU HAVE SUCCESSFULLY REGISTERED.  YOUR REGISTERATION NO. IS "+regno );
            }
            catch(Exception x){
                System.out.println(x);
            }
            Reg_frame.dispose();
            String args[]={};
            Test.main(args);
            
        }
    }
    public String add_record()throws Exception
    {
        String name=enter_name.getText();
        int rno;
        char pass[]=enter_password.getPassword();
        String password=String.valueOf(pass);
        String input;
        FileReader fr=new FileReader("C:\\Users\\WIN8.1\\Documents\\NetBeansProjects\\test\\candidates.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("C:\\Users\\WIN8.1\\Documents\\NetBeansProjects\\test\\candidates.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        if((input=br.readLine())==null)
        {
            rno=1;
            bw.write("1"+" ");
            bw.write(name+" ");
            bw.write(password+" ");
            bw.close();
            fw.close();
        }
        else
        {
            String words[]=input.split("\\s");
            rno=Integer.parseInt(words[0]);
           while((input=br.readLine())!=null)
           {
               String words2[]=input.split("\\s");
               rno=Integer.parseInt(words2[0]);
           }
           rno++;
           bw.newLine();
           bw.write(String.valueOf(rno)+" ");
           bw.write(name+" ");
           bw.write(password+" ");
           bw.close();
           fw.close();
           br.close();
           fr.close();
        }
        return String.valueOf(rno);
    }
}