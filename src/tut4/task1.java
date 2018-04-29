package tut4;
import java.awt.*;
/* We have extended the Frame class here,
 * thus our class &quot;SimpleExample&quot; would behave
 * like a Frame
 */
public class task1 extends Frame
{
    task1()
    {
        Button b=new Button("Button!!");

        // setting button position on screen
        b.setBounds(50,50,50,50);

        //adding button into frame
        add(b);

        //Setting Frame width and height
        setSize(500,300);

        //Setting the title of Frame
        setTitle("This is my First AWT example");

        //Setting the layout for the Frame
        setLayout(new FlowLayout());


        /* By default frame is not visible so
         * we are setting the visibility to true
         * to make it visible.
         */
        setVisible(true);
    }
        public static void main(String args[])
    {
        // Creating the instance of Frame
        task1 fr=new task1();
    }
}