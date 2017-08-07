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
import java.io.*;
public class level_2 implements ActionListener{
     int count2=0;
     String regno;
     JFrame level_2;
    JButton submit_level_2;
    JLabel q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17;
    JRadioButton b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60;
     ButtonGroup bg1,bg2,bg3,bg4,bg5,bg6,bg7,bg8,bg9,bg10,bg11,bg12,bg13,bg14,bg15,bg16,bg17;
    level_2(String reg,int count1)
    {
        regno=reg;
        count2=count1;
        submit_level_2=new JButton("submit level-2");
        submit_level_2.addActionListener(this);
        q11=new JLabel("question1:");
        b41=new JRadioButton("A)");b41.addActionListener(this);
        b42=new JRadioButton("B)");b42.addActionListener(this);
        b43=new JRadioButton("C)");b43.addActionListener(this);
        b44=new JRadioButton("D)");b44.addActionListener(this);
        bg11=new ButtonGroup();
        bg11.add(b41);bg11.add(b42);bg11.add(b43);bg11.add(b44);
        q12=new JLabel("question2:");
        b45=new JRadioButton("A)");b45.addActionListener(this);
        b46=new JRadioButton("B)");b46.addActionListener(this);
        b47=new JRadioButton("C)");b47.addActionListener(this);
        b48=new JRadioButton("D)");b48.addActionListener(this);
        bg12=new ButtonGroup();
        bg12.add(b45);bg12.add(b46);bg12.add(b47);bg12.add(b48);
        q13=new JLabel("question3:");
        b49=new JRadioButton("A)");b49.addActionListener(this);
        b50=new JRadioButton("B)");b50.addActionListener(this);
        b51=new JRadioButton("C)");b51.addActionListener(this);
        b52=new JRadioButton("D)");b52.addActionListener(this);
        bg13=new ButtonGroup();
        bg13.add(b49);bg13.add(b50);bg13.add(b51);bg13.add(b52);
        q14=new JLabel("question4:");
        b53=new JRadioButton("A)");b53.addActionListener(this);
        b54=new JRadioButton("B)");b54.addActionListener(this);
        b55=new JRadioButton("C)");b55.addActionListener(this);
        b56=new JRadioButton("D)");b56.addActionListener(this);
        bg14=new ButtonGroup();
        bg14.add(b53);bg14.add(b54);bg14.add(b55);bg14.add(b56);
        q15=new JLabel("question5:");
        b57=new JRadioButton("A)");b57.addActionListener(this);
        b58=new JRadioButton("B)");b58.addActionListener(this);
        b59=new JRadioButton("C)");b59.addActionListener(this);
        b60=new JRadioButton("D)");b60.addActionListener(this);
        bg15=new ButtonGroup();
        bg15.add(b57); bg15.add(b58); bg15.add(b59); bg15.add(b60);
        level_2=new JFrame("level2");
        JPanel pnl=new JPanel();
        pnl.add(q11); pnl.add(b41); pnl.add(b42); pnl.add(b43); pnl.add(b44); 
        pnl.add(q12); pnl.add(b45); pnl.add(b46); pnl.add(b47); pnl.add(b48);
        pnl.add(q13); pnl.add(b49); pnl.add(b50); pnl.add(b51); pnl.add(b52);
        pnl.add(q14); pnl.add(b53); pnl.add(b54); pnl.add(b55); pnl.add(b56);
        pnl.add(q15); pnl.add(b57); pnl.add(b58); pnl.add(b59); pnl.add(b60);
        pnl.add(submit_level_2);
        JScrollPane pane = new JScrollPane(pnl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnl.setLayout(new BoxLayout (pnl, BoxLayout.Y_AXIS));
        level_2.setLayout(null); 
        level_2.setContentPane(pane);
        level_2.setSize(2000, 1500);
        level_2.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
         if(e.getActionCommand()=="submit level-2")
        {
            level_2.dispose(); 
            if(count2<5){ 
                quiz q=new quiz();
                try{
                q.add_marks(regno, count2);
                }catch(Exception x){}
                String args[]={};
                Test.main(args);
            }
            else {
                JOptionPane.showMessageDialog(level_2, "Congratulations!!!you have cleared level 2. click ok to start level-3.");
                level_3 obj=new level_3(regno,count2);
            } 
        }
        else if(b42.isSelected())
        {
            count2++;
        }
        else if(b45.isSelected())
        {
            count2++;
        }
        else if(b51.isSelected())
        {
            count2++;
        }
        else if(b56.isSelected())
        {
            count2++;
        }
        else if(b58.isSelected())
        {
            count2++;
        }
    }
}
