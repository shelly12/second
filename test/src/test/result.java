/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author WIN8.1
 */
public class result {
    JFrame f;
    result(String reg_no)throws Exception
    {
        f=new JFrame();
        FileReader fr=new FileReader("C:\\Users\\WIN8.1\\Documents\\NetBeansProjects\\test\\marks.txt");
        BufferedReader br=new BufferedReader(fr);
        String input;
        int marks=0;
        int rank=1;
        while((input=br.readLine())!=null)
        {
            String words[]=input.split("\\s");
            if(words[0].equals(reg_no))
            {
                marks=Integer.parseInt(words[1]);
                break;
            }
        }
        br.close();
        fr.close();
        FileReader fr2=new FileReader("C:\\Users\\WIN8.1\\Documents\\NetBeansProjects\\test\\marks.txt");
        BufferedReader br2=new BufferedReader(fr2);
        while((input=br2.readLine())!=null)
        {
           String words[]=input.split("\\s");
           if(Integer.parseInt(words[1])>marks)
           {
               rank=rank+1;
           }
        }
       
        JOptionPane.showMessageDialog(f,"CONGRATULATIONS!!! you have got "+marks+" marks and your present rank is "+String.valueOf(rank));
        String args[]={};
        Test.main(args);
            
        }
}
