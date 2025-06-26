import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {
    //2d array for storing questons and answer
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String user_ans[][]=new String[10][1];
    JLabel qno,que;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup groupoption;
    public static int timer=15;
    public static int ans_given=0;
    public static int count=0;
    JButton next,lifeline,submit;
    public static int score=0;

String name;

    Quiz(String name){
        this.name=name;
 setBounds(250,0,1000,850);
 getContentPane().setBackground(Color.white);
 setLayout(null);
        ImageIcon i1 = new ImageIcon("C:\\Users\\vaish\\IdeaProjects\\Quize Application\\src\\icons\\quize.jpg");
        JLabel image = new JLabel(i1);
        add(image);
        //take 4 parameter left,top,with and height
        //setbounds is used for placing any component on created window
        image.setBounds(0, 0, 1000, 300);

        qno=new JLabel("");
        qno.setBounds(30,350,50,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(qno);

        que=new JLabel(" ");
        que.setBounds(60,350,500,30);
        que.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(que);
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";


        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

         opt1=new JRadioButton("");
        opt1.setBounds(70,380,100,30);
        opt1.setBackground(Color.white);
        opt1.setFont(new Font("Dialog",Font.PLAIN,16));
        add(opt1);

         opt2=new JRadioButton("");
        opt2.setBounds(70,410,500,30);
        opt2.setBackground(Color.white);
        opt2.setFont(new Font("Dialog",Font.PLAIN,16));
        add(opt2);

         opt3=new JRadioButton("");
        opt3.setBounds(70,440,500,30);
        opt3.setBackground(Color.white);
        opt3.setFont(new Font("Dialog",Font.PLAIN,16));
        add(opt3);

        opt4=new JRadioButton("");
        opt4.setBounds(70,470,500,30);
        opt4.setBackground(Color.white);
        opt4.setFont(new Font("Dialog",Font.PLAIN,16));
        add(opt4);
         groupoption=new ButtonGroup();
        groupoption.add(opt1);
        groupoption.add(opt2);
        groupoption.add(opt3);
        groupoption.add(opt4);

         next=new JButton("Next");
        next.setBounds(580,400,150,30);
        next.setFont(new Font("Tahoma",Font.PLAIN,18));
        //rgb mix color ghyaycha asel tr color class cha object create karava lagto
        next.setBackground(new Color(145, 4, 75));
        next.setForeground(Color.white);
        next.addActionListener(this); //register action listener
        add(next);

            lifeline=new JButton("50-50 Lifeline");
           lifeline.setBounds(580,450,150,30);
           lifeline.setFont(new Font("Tahoma",Font.PLAIN,18));
           //rgb mix color ghyaycha asel tr color class cha object create karava lagto
           lifeline.setBackground(new Color(145, 4, 75));
           lifeline.setForeground(Color.white);
           lifeline.addActionListener(this);
           add(lifeline);

            submit=new JButton("Submit");
           submit.setBounds(580,500,150,30);
           submit.setFont(new Font("Tahoma",Font.PLAIN,18));
           //rgb mix color ghyaycha asel tr color class cha object create karava lagtoqu
           submit.setBackground(new Color(145, 4, 75));
           submit.setForeground(Color.white);
           //use to make button disabled
           submit.setEnabled(false);
           submit.addActionListener(this);
           add(submit);

           start(count); //for changing questions and option

           setResizable(false);
 setVisible(true);
    }

     public void actionPerformed(ActionEvent e){
        if(e.getSource()==next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given=1;

            if (groupoption.getSelection()==null){
                user_ans[count][0]="";
            }else {
                user_ans[count][0]=groupoption.getSelection().getActionCommand();//use to retrive the option as a ans  given by user
            }
            if (count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        } else if (e.getSource()==lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }else if(e.getSource()==submit){
            ans_given=1;
            if (groupoption.getSelection()==null){
                user_ans[count][0]="";
            }else {
                user_ans[count][0]=groupoption.getSelection().getActionCommand();//use to retrive the option as a ans  given by user
            }
            for (int i=0;i<user_ans.length;i++){
                if (user_ans[i][0].equals(answers[i][1])){
                    score+=10;
                }else {
                    score+=0;
                }
            }
            setVisible(false);
            //score class object
            new Score(name,score);
        }


     }

    //timer formation
       //graphics class method for again and again repainting the screen for timer because timer is changing per second
       public void paint( Graphics g){  //paint method automatically calls when graphics class object is created
           super.paint(g); //with the help super keyword paint method is invoked
           String time="Time left " +timer+" Seconds"; //15
           g.setColor(Color.RED);
           g.setFont(new Font("Tahoma",Font.BOLD,16));
           if(timer>0){
               g.drawString(time,600,400);
           }
           else {
               g.drawString("Times up..!",600,400);
           }
           timer--;
           //paint method call only once when object created if we want call again & again then we have to write repaint method
           try{
               Thread.sleep(1000);
               repaint(); //graphics class method
           }catch (Exception e){
               e.printStackTrace();
           }
           if (ans_given==1){
               ans_given=0;
               timer=15;
           } else if (timer<0) {
               timer=15;
               opt1.setEnabled(true);
               opt2.setEnabled(true);
               opt3.setEnabled(true);
               opt4.setEnabled(true);

               if (count==8){
                   next.setEnabled(false);
                   submit.setEnabled(true);
               }

               if (count==9){ //submit button
                   if (groupoption.getSelection()==null){
                       user_ans[count][0]="";
                   }else {
                       user_ans[count][0]=groupoption.getSelection().getActionCommand();//use to retrive the option as a ans  given by user
                   }
                   for (int i=0;i<user_ans.length;i++){
                       if (user_ans[i][0].equals(answers[i][1])){
                           score+=10;
                       }else {
                           score+=0;
                       }
                   }
                   setVisible(false);
                   //score
                   new Score(name,score);
               }else {  //next button

                   if (groupoption.getSelection()==null){
                       user_ans[count][0]="";
                   }else {
                       user_ans[count][0]=groupoption.getSelection().getActionCommand();//use to retrive the option as a ans  given by user
                   }
                   count++;
                   start(count);
               }
               }


       }

    public void start(int count){
           //set text fakt string input geto,pn aaplyala method madhe integer pass karaycha ahe we can easily dp that by only providing "" inverted commas
     qno.setText(""+(count+1)+".");
     que.setText(questions[count][0]);
     opt1.setText(questions[count][1]);
     opt1.setActionCommand(questions[count][1]);
     opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
     opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
     opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoption.clearSelection();//jevha aapla dusra que display hoil tevha aadhi select kelela option clear vhayla pahije
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new Quiz("user");
    }
}
