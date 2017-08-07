/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author WIN8.1
 */
public class level_3 implements ActionListener{
    int count3=0;
    String regno;
    JFrame level_3;
    JButton submit_level_3;
    JLabel q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17;
    JRadioButton b61,b62,b63,b64,b65,b66,b67,b68;
    ButtonGroup bg1,bg2,bg3,bg4,bg5,bg6,bg7,bg8,bg9,bg10,bg11,bg12,bg13,bg14,bg15,bg16,bg17;
    level_3(String reg,int count2)
    {
        regno=reg;
        count3=count2;
        q16=new JLabel("question1:");
        b61=new JRadioButton("A)");b61.addActionListener(this);
        b62=new JRadioButton("B)");b62.addActionListener(this);
        b63=new JRadioButton("C)");b63.addActionListener(this);
        b64=new JRadioButton("D)");b64.addActionListener(this);
        bg16=new ButtonGroup();
        bg16.add(b61);bg16.add(b62);bg16.add(b63);bg16.add(b64);
        q17=new JLabel("question2:");
        b65=new JRadioButton("A)");b65.addActionListener(this);
        b66=new JRadioButton("B)");b66.addActionListener(this);
        b67=new JRadioButton("C)");b67.addActionListener(this);
        b68=new JRadioButton("D)");b68.addActionListener(this);
        bg17=new ButtonGroup();
        bg17.add(b65);bg17.add(b66);bg17.add(b67);bg17.add(b68);
        level_3=new JFrame("level3");
        submit_level_3=new JButton("submit level-3");
        submit_level_3.addActionListener(this);
        JPanel pnl=new JPanel();
        pnl.add(q16); pnl.add(b61); pnl.add(b62); pnl.add(b63); pnl.add(b64); 
        pnl.add(q17); pnl.add(b65); pnl.add(b66); pnl.add(b67); pnl.add(b68);
        pnl.add(submit_level_3);
        JScrollPane pane = new JScrollPane(pnl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnl.setLayout(new BoxLayout (pnl, BoxLayout.Y_AXIS));
        level_3.setLayout(null); 
        level_3.setContentPane(pane);
        level_3.setSize(2000, 1500);
        level_3.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand()=="submit level-3")
        {
            level_3.dispose();
            if(count3==2)
            {
             JOptionPane.showMessageDialog(level_3,"Congratulations!!!you have scored maximum marks");   
            }
            else{
            JOptionPane.showMessageDialog(level_3,"Congratulations!!!you have scored total "+count3+"marks");
            }
            quiz q=new quiz();
            try{
            q.add_marks(regno, count3);
            }catch(Exception x){}
            String args[]={};
            Test.main(args);
            Test.main(args);
        }
         else if(b63.isSelected())
        {
            count3++;
        }
        else if(b66.isSelected())
        {
            count3++;
        }
    }
}
