import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Week_13b{
    JFrame f;
    JTable t;
    JScrollPane sp;
    JLabel l;
        Week_13b(){
         f = new JFrame("Exam Schedule");
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] headings = {"Date","B.Tech VI sem","B.Tech IV sem"};
        String[][] data = {
            {"12-Aug-21" , "Lab Exam 1","Mid1 & Mid2 - sub 1"},
            {"13-Aug-21" , "Lab Exam 2","Mid1 & Mid2 - sub 2"},
            {"14-Aug-21" , "Lab Exam 3","Mid1 & Mid2 - sub 3"},
            {"16-Aug-21" , "Lab Exam 4","Mid1 & Mid2 - sub 4"},
            {"17-Aug-21" , "Lab Exam 5","Mid1 & Mid2 - sub 5"},
            {"18-Aug-21" , "Lab Exam 6","Mid1 & Mid2 - sub 6"},
            {"","",""},
            {"20-Aug-21" , "Mid1 & Mid2 - sub 1","Lab Exam 1"},            
            {"21-Aug-21" , "Mid1 & Mid2 - sub 2","Lab Exam 2"},            
            {"22-Aug-21" , "Mid1 & Mid2 - sub 3","Lab Exam 3"},            
            {"23-Aug-21" , "Mid1 & Mid2 - sub 4","Lab Exam 4"},            
            {"24-Aug-21" , "Mid1 & Mid2 - sub 5","Lab Exam 5"},            
            {"25-Aug-21" , "Mid1 & Mid2 - sub 6","Lab Exam 6"},            

        };
        t = new JTable(data,headings);
        sp = new JScrollPane(t);
        f.add(sp);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public static void main(String... s){
       new Week_13b();
    }
}