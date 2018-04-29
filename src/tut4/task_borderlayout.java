package tut4;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

public class task_borderlayout {
    public static boolean RIGHT_TO_LEFT = false;
    public static void addComponentsToPane(Container pane)
    {
        if (!(pane.getLayout() instanceof BorderLayout))
        {
            pane.add(new JLabel("Container doesn't use BorderLayout!"));
            return;
        }

        if (RIGHT_TO_LEFT)
        {
            pane.setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }

        JButton button = new JButton("Top");
        pane.add(button, BorderLayout.PAGE_START);
        button = new JButton("Middle");
        button.setPreferredSize(new Dimension(200, 100));

        pane.add(button, BorderLayout.CENTER);
        button = new JButton("Left");

        pane.add(button, BorderLayout.LINE_START);
        button = new JButton("Bottom");

        pane.add(button, BorderLayout.PAGE_END);
        button = new JButton("Right");

        pane.add(button, BorderLayout.LINE_END);
    }

    private static void createAndShowGUI()
    {
        //Create and set up the window.
        JFrame frame = new JFrame("BorderLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}