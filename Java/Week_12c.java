// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;

// public class Week_12c{
//     public static void main(String ... s){
//         MouseAdapterEx e = new MouseAdapterEx();
//     }
// }

// //Extending mouse adapter class.
// class MouseAdapterEx extends MouseAdapter{
//     JFrame f;
//     MouseAdapterEx(){
//         f = new JFrame("Mouse Adapter");
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         f.addMouseListener(this);
//         f.setSize(400,400);
//         f.setLocationRelativeTo(null);
//         f.setVisible(true);
//     }

//     //function for what happens if mouse clicked.
//     public void mouseClicked(MouseEvent me){
//         Graphics g = f.getGraphics();
//         g.setColor(Color.blue);
//         g.fillRect(me.getX(),me.getY(),20,20);
//     }
// }

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Week_12c extends MouseAdapter{
    public void mouseClicked(MouseEvent me){
        Graphics g = f.getGraphics();
        g.setColor(Color.blue);
        g.fillRect(me.getX(),me.getY(),20,20);
    }
    public static void main(String ... s){
        Frame f = new JFrame("Mouse Adapter");
        f.addMouseListener();
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}