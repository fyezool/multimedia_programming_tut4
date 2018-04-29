package tut4;
import javax.swing.*;
import java.awt.*;

public class task2
{
    task2()
    {
        //Creating Frame
        Frame fr=new Frame();


        //Creating a label
        Label lb = new Label("UserId: ");
        fr.add(lb);
        TextField t = new TextField((50));
        fr.add(t);



        Label lb1 = new Label("UserName: ");
        fr.add(lb1);
        TextField t1 = new TextField((50));
        fr.add(t1);



        fr.setSize(500, 300);


        //Setting the layout for the Frame
        fr.setLayout(new FlowLayout());


        fr.setVisible(true);

    }
        public static void main(String args[])
        {
        task2 ex = new task2();
        }
}