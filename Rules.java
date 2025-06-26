import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton back,Start;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel headings = new JLabel("welcome "+name+" to simple minds");
        headings.setBounds(50, 20, 900, 30);
        add(headings);
        headings.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        //changing the color of the text
        headings.setForeground(new Color(145, 4, 75));

        JLabel rules = new JLabel();
        rules.setBounds(20, 20, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        //changing the color of the text
        rules.setForeground(new Color(145, 4, 75));
        rules.setText(
            "<html>"+
            "1. Each question has only one correct answer."+"<br><br>"+
            "2. No backtracking to previous question."+"<br><br>"+
            "3. You have time of 15 seconds per question."+"<br><br>"+
            "4. unanswered questions will be marked as incorrect once time expires."+"<br><br>"+
            "5. Each correct answer gets 10 points."+"<br><br>"+
            "6. 50-50 lifeline applicable only once during quiz." +"<br><br>"+
                    "<html>"
        );

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 50);
        back.setBackground(new Color(145, 4, 75));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        add(rules);
        Start = new JButton("Start");
        Start.setBounds(650, 500, 100, 50);
        Start.setBackground(new Color(145, 4, 75));
        Start.setForeground(Color.white);
        Start.addActionListener(this);
        add(Start);

        setSize(1000,650);
        setLocation(350,100);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==Start){
            setVisible(false);
         new Quiz(name);
        }else {
           setVisible(false);
           new login();
        }
    }
    public static void main(String args[]){
       new Rules("user");


    }
}
