package edu.buffalostate.cis425.sp17.exercises.vollmer;

import java.awt.BorderLayout;

/**
 * File: LeftRightApp.java
 *
 * Description: This program creates a LeftRightPanel and
 *  adds it to the Frame's content pane and sets its size.
 *
 * Assignment: See LeftRightPanel.java
 *
 */

/** 
 *
 * @author CoreyVollmer
 * 
 */

import javax.swing.*;

public class LeftRightApp extends JFrame{
    public LeftRightApp(){
        getContentPane().add(new LeftRightPanel());
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    } // LeftRightFrame() constructor


    public static void main(String args[]){
        LeftRightApp aframe = new LeftRightApp();
        aframe.setTitle("Exercise 14 App");
        aframe.setSize(300,90);
        aframe.setLocationRelativeTo(null);
        aframe.setVisible(true);
    } // main()

} // LeftRightApp class