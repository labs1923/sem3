import java.awt.*;
import java.applet.*;

public class Week_12a extends Applet implements Runnable {
    String text;
    int x,y,value;
    Thread t;
    public void init(){
        text = "J A V A";
        x = 10;y = 150;
        value = 1;
        t = new Thread(this);t.start();
    }
    public void update(){
        x = x + 10 * value;
        if (x > 260)
            value = -1;
        if (x < 100)
            value = 1;
    }
    public void run(){
        while(true){
            update();
            repaint();
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
    public void paint(Graphics g){
        g.drawString(text,x,y);
    }
}