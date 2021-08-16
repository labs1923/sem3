import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Week14b extends Applet implements ChangeListener{
    JSlider s1,s2,s3;
    JLabel l1,l2,l3,heading;
    int x,y,z;
    Color c;
    
    public void stateChanged(ChangeEvent e)
    {
            x = s1.getValue();
            y = s2.getValue();
            z = s3.getValue();
            c = new Color(x,y,z);
            setBackground(c);
    }
    public void init(){
        heading=new JLabel("sliders");
        heading.setBounds(60,30,300,20);

        //labels
        l1=new JLabel("RED");
        l2=new JLabel("GREEN");
        l3=new JLabel("BLUE");
        l1.setBounds(50,80,100,20);
        l2.setBounds(50,120,100,20);
        l3.setBounds(50,160,100,20);
     
        //sliders
        s1 = new JSlider(JSlider.HORIZONTAL,0,255,100);
        s2=new JSlider(JSlider.HORIZONTAL,0,255,100);
        s3=new JSlider(JSlider.HORIZONTAL,0,255,100);
        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);
        s1.setBounds(160,80,100,20);
        s2.setBounds(160,120,100,20);
        s3.setBounds(160,160,100,20);

        setBackground(new Color(s1.getValue(),s2.getValue(),s3.getValue()));
       
        setLayout(null);
        add(heading);
        add(l1);add(s1);add(l2);
        add(s2);add(l3);add(s3);
    }
}