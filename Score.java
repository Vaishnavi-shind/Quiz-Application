import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    JButton exit,submit;
     Score(String name,int score){
         setBounds(250,90,1000,600);
         getContentPane().setBackground(Color.white);
         setLayout(null);

         ImageIcon i1 = new ImageIcon("C:\\Users\\vaish\\IdeaProjects\\Quize Application\\src\\icons\\score.jpg");
         // for scaling an image
         Image i2=i1.getImage().getScaledInstance(200,100,Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         //take 4 parameter left,top,with and height
         //setbounds is used for placing any component on created window
         image.setBounds(300, 0, 300, 300);
         add(image);


         JLabel heading =new JLabel("Thank You "+name+" For Playing Simple Minds ");
         heading.setBounds(150,300,800,40);
         heading.setFont(new Font("Viner Hand ITC",Font.BOLD,32));
         heading.setForeground(new Color(145, 4, 75));
         add(heading);

         JLabel uscore =new JLabel("Your Score is "+score);
         uscore.setBounds(380,400,800,40);
         uscore.setFont(new Font("Tahoma",Font.BOLD,26));
         uscore.setForeground(new Color(145, 4, 75));
         add(uscore);

          submit=new JButton("Play Again");
         submit.setBounds(200,500,150,30);
         submit.setFont(new Font("Tahoma",Font.PLAIN,18));
         //rgb mix color ghyaycha asel tr color class cha object create karava lagtoqu
         submit.setBackground(new Color(145, 4, 75));
         submit.setForeground(Color.white);
         submit.addActionListener(this);
         add(submit);

          exit=new JButton("Exit");
         exit.setBounds(600,500,150,30);
         exit.setFont(new Font("Tahoma",Font.PLAIN,18));
         //rgb mix color ghyaycha asel tr color class cha object create karava lagtoqu
         exit.setBackground(new Color(145, 4, 75));
         exit.setForeground(Color.white);
         exit.addActionListener(this);
         add(exit);

         setResizable(false);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==submit){
            setVisible(false);
            new login();
        } else {
            setVisible(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }
    public static void main(String args[]){
       new Score("user",0);
    }
}
