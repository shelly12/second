/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.*;
import java.awt.event.*;
import java.util.HashSet;
import javax.swing.*;

/**
 *
 * @author WIN8.1
 */
public class quiz implements ActionListener{
    int count1=0;
    String reg;
    JFrame quiz_details;
    JLabel l;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JButton start_level_1;
    JFrame level_1;
    JButton submit_level_1;
    JLabel q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
    JRadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40;
    ButtonGroup bg1,bg2,bg3,bg4,bg5,bg6,bg7,bg8,bg9,bg10;
    quiz()
    {
        
    }

    quiz(String reg_no)
    {
      reg=reg_no;
      quiz_details=new JFrame("DETAILS OF QUIZ");
      l=new JLabel("READ THE FOLLOWING INSTRUCTIONS CAREFULLY:");
      l1=new JLabel("1. Test consists of 3 levels.with each level difficulty increases.");
      l2=new JLabel("2. If you solve all questions correctly of one level then you can go to next level.");
      l3=new JLabel("3. First level-10 questions  second level - 5 questions   third level- 2 questions.");
      l4=new JLabel("4. For each level you are given a time of 30 minutes");
      start_level_1=new JButton("start level-1");
      l.setBounds(100,50,500, 200);
      l1.setBounds(100, 150, 400, 100);
      l2.setBounds(100, 200, 400, 100);
      l3.setBounds(100, 250, 400, 100);
      l4.setBounds(100,300, 400, 100);
      start_level_1.setBounds(150,400,150, 30);
      start_level_1.addActionListener(this);
      quiz_details.add(l);quiz_details.add(l1);quiz_details.add(l2);quiz_details.add(l3);quiz_details.add(l4);quiz_details.add(start_level_1);
      quiz_details.setSize(600,600);
      quiz_details.setLayout(null);
      quiz_details.setVisible(true);      
    }
    public void level1()
    {
        count1=0;
        submit_level_1=new JButton("submit level-1");
        submit_level_1.addActionListener(this);
        level_1=new JFrame("level-1");
        q1=new JLabel("question1:");
        b1=new JRadioButton("A)");b1.addActionListener(this);
        b2=new JRadioButton("B)");b2.addActionListener(this);
        b3=new JRadioButton("C)");b3.addActionListener(this);
        b4=new JRadioButton("D)");b4.addActionListener(this);
        bg1=new ButtonGroup();
        bg1.add(b1);bg1.add(b2);bg1.add(b3);bg1.add(b4);
        q2=new JLabel("question2:");
        b5=new JRadioButton("A)");b5.addActionListener(this);
        b6=new JRadioButton("B)");b6.addActionListener(this);
        b7=new JRadioButton("C)");b7.addActionListener(this);
        b8=new JRadioButton("D)");b8.addActionListener(this);
        bg2=new ButtonGroup();
        bg2.add(b5);bg2.add(b6);bg2.add(b7);bg2.add(b8);
        q3=new JLabel("question3:");
        b9=new JRadioButton("A)");b9.addActionListener(this);
        b10=new JRadioButton("B)");b10.addActionListener(this);
        b11=new JRadioButton("C)");b11.addActionListener(this);
        b12=new JRadioButton("D)");b12.addActionListener(this);
        bg3=new ButtonGroup();
        bg3.add(b9);bg3.add(b10);bg3.add(b11);bg3.add(b12);
        q4=new JLabel("question4:");
        b13=new JRadioButton("A)");b13.addActionListener(this);
        b14=new JRadioButton("B)");b14.addActionListener(this);
        b15=new JRadioButton("C)");b15.addActionListener(this);
        b16=new JRadioButton("D)");b16.addActionListener(this);
        bg4=new ButtonGroup();
        bg4.add(b13);bg4.add(b14);bg4.add(b15);bg4.add(b16);
        q5=new JLabel("question5:");
        b17=new JRadioButton("A)");b17.addActionListener(this);
        b18=new JRadioButton("B)");b18.addActionListener(this);
        b19=new JRadioButton("C)");b19.addActionListener(this);
        b20=new JRadioButton("D)");b20.addActionListener(this);
        bg5=new ButtonGroup();
        bg5.add(b17); bg5.add(b18); bg5.add(b19); bg5.add(b20);
        q6=new JLabel("question6:");
        b21=new JRadioButton("A)");b21.addActionListener(this);
        b22=new JRadioButton("B)");b22.addActionListener(this);
        b23=new JRadioButton("C)");b23.addActionListener(this);
        b24=new JRadioButton("D)");b24.addActionListener(this);
        bg6=new ButtonGroup();
        bg6.add(b21); bg6.add(b22); bg6.add(b23); bg6.add(b24);
        q7=new JLabel("question7:");
        b25=new JRadioButton("A)");b25.addActionListener(this);
        b26=new JRadioButton("B)");b26.addActionListener(this);
        b27=new JRadioButton("C)");b27.addActionListener(this);
        b28=new JRadioButton("D)");b28.addActionListener(this);
        bg7=new ButtonGroup();
        bg7.add(b25); bg7.add(b26); bg7.add(b27); bg7.add(b28);
        q8=new JLabel("question8:");
        b29=new JRadioButton("A)");b29.addActionListener(this);
        b30=new JRadioButton("B)");b30.addActionListener(this);
        b31=new JRadioButton("C)");b31.addActionListener(this);
        b32=new JRadioButton("D)");b32.addActionListener(this);
        bg8=new ButtonGroup();
        bg8.add(b29); bg8.add(b30); bg8.add(b31); bg8.add(b32);
        q9=new JLabel("question9:");
        b33=new JRadioButton("A)");b33.addActionListener(this);
        b34=new JRadioButton("B)");b34.addActionListener(this);
        b35=new JRadioButton("C)");b35.addActionListener(this);
        b36=new JRadioButton("D)");b36.addActionListener(this);
        bg9=new ButtonGroup();
        bg9.add(b33); bg9.add(b34); bg9.add(b35); bg9.add(b36);
        q10=new JLabel("question10:");
        b37=new JRadioButton("A)");b37.addActionListener(this);
        b38=new JRadioButton("B)");b38.addActionListener(this);
        b39=new JRadioButton("C)");b39.addActionListener(this);
        b40=new JRadioButton("D)");b40.addActionListener(this);
        bg10=new ButtonGroup();
        bg10.add(b37); bg10.add(b38); bg10.add(b39); bg10.add(b40);
        q1.setBounds(100, 100, 300, 100);
        JPanel pnl=new JPanel();
        pnl.add(q1); pnl.add(b1); pnl.add(b2); pnl.add(b3); pnl.add(b4); 
         pnl.add(q2); pnl.add(b5); pnl.add(b6); pnl.add(b7); pnl.add(b8);
         pnl.add(q3); pnl.add(b9); pnl.add(b10); pnl.add(b11); pnl.add(b12);
         pnl.add(q4); pnl.add(b13); pnl.add(b14); pnl.add(b15); pnl.add(b16);
         pnl.add(q5); pnl.add(b17); pnl.add(b18); pnl.add(b19); pnl.add(b20);
         pnl.add(q6); pnl.add(b21); pnl.add(b22); pnl.add(b23); pnl.add(b24);
         pnl.add(q7); pnl.add(b25); pnl.add(b26); pnl.add(b27); pnl.add(b28);
         pnl.add(q8); pnl.add(b29); pnl.add(b30); pnl.add(b31); pnl.add(b32);
         pnl.add(q9); pnl.add(b33); pnl.add(b34); pnl.add(b35); pnl.add(b36);
         pnl.add(q10); pnl.add(b37); pnl.add(b38); pnl.add(b39); pnl.add(b40);
         pnl.add(submit_level_1);
         JScrollPane pane = new JScrollPane(pnl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
         pnl.setLayout(new BoxLayout (pnl, BoxLayout.Y_AXIS));
         level_1.setLayout(null); 
         level_1.setContentPane(pane);
         level_1.setSize(2000, 2000);
         level_1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand()=="start level-1")
        {
            quiz_details.dispose();
            level1();
        }
        else if(e.getActionCommand()=="submit level-1")
        {
            if(count1<10)
            {
                level_1.dispose();
                JOptionPane.showMessageDialog(level_1, "your score is "+count1+".you have not cleared first level.THANK YOU!!");
                try{
                add_marks(reg,count1);
                }catch(Exception x)
                {}
                String args[]={};
                Test.main(args);
            }
            else
            {
                level_1.dispose();
                JOptionPane.showMessageDialog(level_1, "Congratulations!!!you have cleared level 1. click ok to start level-2.");
                level_2 obj=new level_2(reg,count1);
            }
        }
        else if(b1.isSelected())
        {
            count1++;
        }
        else if(b7.isSelected())
        {
            count1++;
        }
        else if(b10.isSelected())
        {
            count1++;
        }
        else if(b14.isSelected())
        {
            count1++;
        }
        else if(b19.isSelected())
        {
            count1++;
        }
        else if(b22.isSelected())
        {
            count1++;
        }
        else if(b28.isSelected())
        {
            count1++;
        }
        else if(b30.isSelected())
        {
            count1++;
        }
        else if(b34.isSelected())
        {
            count1++;
        }
        else if(b39.isSelected())
        {
            count1++;
        }
    }
    public void  add_marks(String reg,int marks)throws Exception
    {
        FileWriter fw=new FileWriter("C:\\Users\\WIN8.1\\Documents\\NetBeansProjects\\test\\marks.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        FileReader fr=new FileReader("C:\\Users\\WIN8.1\\Documents\\NetBeansProjects\\test\\marks.txt");
        BufferedReader br=new BufferedReader(fr);
        if(br.readLine()!=null){
        bw.newLine();
        }
        bw.write(reg+" ");
        bw.write(String.valueOf(marks));
        bw.close();
        fw.close();
        br.close();
        fr.close();
    }
}
