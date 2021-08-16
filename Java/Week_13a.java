import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class Week_13a extends Applet implements MouseMotionListener{
    JRadioButton rb1,rb2,rb3;
    ButtonGroup bg;
    Panel p1,p2;
    Label l,size_l;
    Button b1,b2;
    TextField tf1;
    int x;
    public void init(){

        setBackground(Color.red);
        //pannel 1
        p1 = new Panel(null);
        p1.setBackground(Color.blue);
        p1.setBounds(0,40,500,600);
        p1.addMouseMotionListener(this);


        //pannel 2
        p2 = new Panel(null);
        p2.setBackground(Color.white);
        p2.setBounds(530,40,300,600);
      
        //adding label.
        l = new Label("Choose :");
        l.setBounds(20,20,100,30);
        l.setFont(new Font("",Font.BOLD,22));
        p2.add(l);    

        //adding button group.
        rb1 = new JRadioButton("Line");
        rb1.setBounds(40,80,60,20);
        rb2 = new JRadioButton("Rectangle",true);
        rb2.setBounds(40,125,100,20);
        rb3 = new JRadioButton("Oval");
        rb3.setBounds(40,165,60,20);
        bg = new ButtonGroup();
        bg.add(rb1);bg.add(rb2);bg.add(rb3);

        //Size Field.
        size_l = new Label("Change Size :");
        size_l.setBounds(20,210,100,20);
        size_l.setFont(new Font("",Font.BOLD,16));
        p2.add(size_l);

        b1 = new Button("-");
        b1.setBounds(130,210,20,20);
        tf1 = new TextField(5);
        tf1.setEnabled(false);
        tf1.setText("8");
        tf1.setBounds(160,210,50,20);
        b2 = new Button("+");
        b2.setBounds(220,210,20,20);

        x = Integer.parseInt(tf1.getText());
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(x!=0)
                    x -= 1 ;
                tf1.setText(String.valueOf(x));
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                x += 1 ;
                tf1.setText(String.valueOf(x));
            }
        });
        //adding to the applet.
        p2.add(rb1);p2.add(rb2);p2.add(rb3);
        p2.add(b1);p2.add(tf1);p2.add(b2);
        add(p1);add(p2);

    }

    public void mouseDragged(MouseEvent me){
        Graphics g = p1.getGraphics();
        g.setColor(Color.white);
        if(rb1.isSelected())
        g.drawLine(me.getX(),me.getY(),me.getX(),me.getY()+10);
        if(rb2.isSelected())
        g.fillRect(me.getX(),me.getY(),x,x);
        if(rb3.isSelected())
        g.fillOval(me.getX(),me.getY(),x,x);
    }

    public void mouseMoved(MouseEvent me){}
}