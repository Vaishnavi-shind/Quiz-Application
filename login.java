import javax.swing.*; //javax for java extended package
//for color property for frame
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener { //JFrame is located in Swing Package
    JButton rules,back;
    JTextField tfname;
    login() {
        //to make frame or another window
        setVisible(true); //by default frame chi visibility hidden asti tyala true karav lagt
        setSize(1000, 800);
        setLocation(200, 100);
        getContentPane().setBackground(Color.white);

        ImageIcon i1 = new ImageIcon("C:\\Users\\vaish\\IdeaProjects\\Quize Application\\src\\icons\\login.jpg");
        JLabel image = new JLabel(i1);
        add(image);
        //creation of own layout
        setLayout(null);
        //take 4 parameter left,top,with and height
        //setbounds is used for placing any component on created window
        image.setBounds(10, 0, 500, 450);

        JLabel headings = new JLabel("Simple Minds");
        headings.setBounds(700, 60, 300, 45);
        add(headings);
        headings.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        //changing the color of the text
        headings.setForeground(new Color(145, 4, 75));

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810, 150, 300, 25);
        add(name);
        name.setFont(new Font("Mongolian baiti", Font.BOLD, 18));
        //changing the color of the text
        name.setForeground(new Color(145, 4, 75));

        //for creating text field
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(145, 4, 75));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(145, 4, 75));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
        setResizable(false);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name;
            name = tfname.getText().toString();
            setVisible(false);

      new Rules(name);
  }
  else if (ae.getSource()==back){
      //ya method pn aapan use karu shakto
      //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // dispose();
      setVisible(false);
  }
    }

    public static void main(String []args){
       new login();  //we can create object like this also. also called anonymous object


    }
}
