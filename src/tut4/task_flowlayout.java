package tut4;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class task_flowlayout extends JFrame
{


    public task_flowlayout(String name)
    {
        super(name);
    }

    public void addComponentsToPane(final Container pane)
    {
        final JPanel compsToExperiment = new JPanel();
        JPanel controls = new JPanel();
        controls.setLayout(new FlowLayout());


        //Add buttons to the experiment layout
        compsToExperiment.add(new JButton("Button 1"));
        compsToExperiment.add(new JButton("Button 2"));
        compsToExperiment.add(new JButton("Button 3"));
        compsToExperiment.add(new JButton("Long-Named Button 4"));
        compsToExperiment.add(new JButton("5"));
        //Left to right component orientation is selected by default
        pane.add(compsToExperiment, BorderLayout.CENTER);
        pane.add(controls, BorderLayout.SOUTH); ;
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI()
    {
        //Create and set up the window.
        task_flowlayout frame = new task_flowlayout("FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {

        UIManager.put("swing.boldMetal", Boolean.FALSE);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}