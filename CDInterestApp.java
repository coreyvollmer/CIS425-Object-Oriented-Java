package edu.buffalostate.cis425.sp17.exercises.vollmer;

import java.awt.BorderLayout;

/**
 * File: CDInterestApp.java
 *
 * Description: This program creates a CDInterestPanel and
 * adds it to the Frame's content pane and sets its size.
 *
 * Assignment: See CDInterestPanel.java file
 *
 */
/** 
 * 
 * @author Corey Vollmer
 * 
 */

import javax.swing.*;

public class CDInterestApp extends JFrame {

    public CDInterestApp() {
        getContentPane().add(new CDInterestPanel());
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    } // End CDInterestFrame() constructor

    /**
     * main()
     * @param args command line arguments
     */
    public static void main(String args[]){
        CDInterestApp aframe = new CDInterestApp();
        aframe.setTitle("CD Interest App");
        aframe.setSize(400,200);
        aframe.setResizable(false);
        aframe.setLocationRelativeTo(null); // Center the app on screen
        aframe.setVisible(true);
    } // End main()

} // End CDInterestApp class