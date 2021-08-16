import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Week12_b extends JFrame{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField tf1,tf2,tf3,tf4;
    ButtonGroup bg;
    JRadioButton rb1,rb2;
    JButton b1,b2;
    JPanel p;
    Font f1,f2;
    JPasswordField p1,p2;
    JTextArea ta;
    JCheckBox cb1;

    Week12_b(){
        //Fonts
        f1 = new Font(null,Font.BOLD,22);
        //labels
        l1 = new JLabel("Registration Form");l1.setFont(f1);
        l2 = new JLabel("First Name :");
        l3 = new JLabel("Last Email :");
        l4 = new JLabel("E - mail Id :");
        l5 = new JLabel("Password :");
        l6 = new JLabel("Confirm Password:");
        l7 = new JLabel("Phone No:");
        l8 = new JLabel("Gender :");
        l9 = new JLabel("Describe Yourself (100 words) :");
        //textFields
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        tf3 = new JTextField(20);
        tf4 = new JTextField(20);
        //password fielsd
        p1 = new JPasswordField(20);
        p2 = new JPasswordField(20);
        //radio buttons
        rb1 = new JRadioButton("Male",false);
        rb2 = new JRadioButton("Female",false);
        bg = new ButtonGroup();
        bg.add(rb1);bg.add(rb2);
        JPanel p_g = new JPanel();
        p_g.add(rb1);p_g.add(rb2);
        //buttons.
        JPanel p_b = new JPanel();
        b1 = new JButton("Clear");b1.setBounds(120,5,100,30);
        b2 = new JButton("Register");b2.setBounds(270,5,100,30);
        p_b.setSize(500,40);
        p_b.add(b1);p_b.add(b2);
        //checkbox
        cb1 = new JCheckBox("I Accept the Terms and Conditions.");
        //layout
        GridBagConstraints g = new GridBagConstraints();
        p = new JPanel();
        p.setLayout(new GridBagLayout());
        //text area
        ta = new JTextArea(8,50);
        //grids.
        g.gridwidth = 2;
        g.insets = new Insets(10,0,20,0);
        g.gridx = 0;g.gridy = 0;p.add(l1,g);
        g.anchor = GridBagConstraints.LINE_START;
        g.gridwidth = 1;
        g.insets = new Insets(20,0,0,0);
        g.gridx = 0;g.gridy = 1;p.add(l2,g);
        g.gridx = 1;g.gridy = 1;p.add(tf1,g);
        g.gridx = 0;g.gridy = 2;p.add(l3,g);
        g.gridx = 1;g.gridy = 2;p.add(tf2,g);
        g.gridx = 0;g.gridy = 3;p.add(l4,g);
        g.gridx = 1;g.gridy = 3;p.add(tf3,g);
        g.gridx = 0;g.gridy = 4;p.add(l5,g);
        g.gridx = 1;g.gridy = 4;p.add(p1,g);
        g.gridx = 0;g.gridy = 5;p.add(l6,g);
        g.gridx = 1;g.gridy = 5;p.add(p2,g);
        g.gridx = 0;g.gridy = 6;p.add(l7,g);
        g.gridx = 1;g.gridy = 6;p.add(tf4,g);
        g.gridx = 0;g.gridy = 7;p.add(l8,g);
        g.gridx = 1;g.gridy = 7;p.add(p_g,g);
        g.gridx = 0;g.gridy = 8;p.add(l9,g);
        g.gridx = 0;g.gridy = 10;p.add(cb1,g);
        g.anchor = GridBagConstraints.LINE_END;
        g.gridx = 1;g.gridy = 11;p.add(p_b,g);
        g.gridwidth = 2;
        g.anchor = GridBagConstraints.LINE_START;
        g.gridx = 0;g.gridy = 9;p.add(ta,g);
        //ations
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf1.setText("");tf2.setText("");tf3.setText("");tf4.setText("");
                p1.setText("");p2.setText("");bg.clearSelection();
                cb1.setSelected(false);ta.setText("");
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
        String pass1 = p1.getText() , pass2 = p2.getText();
        if((tf1.getText()).equals("")||(tf2.getText()).equals("")||(tf3.getText()).equals("")||(tf4.getText()).equals("")){
                    JOptionPane.showMessageDialog(null,"Please Fill Form Completely","Warning",JOptionPane.WARNING_MESSAGE,null);
                }
                else if(cb1.isSelected() == false){
                    JOptionPane.showMessageDialog(null,"Please Accept the Terms and Conditions.","Information",JOptionPane.INFORMATION_MESSAGE,null);
                }
                else if(pass1.equals(pass2) && !pass1.equals("")){
                    JOptionPane.showMessageDialog(null,"                Successful Registration","Success",JOptionPane.PLAIN_MESSAGE,null);
                }
                else{
                    p1.setText("");
                    p2.setText("");
                    JOptionPane.showMessageDialog(null,"Password Mismatch","Error",JOptionPane.YES_NO_OPTION,null);
                }
            }
        });
        //display
        add(p);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        setSize(600,700);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String... s){
        new Week12_b();
    }
}