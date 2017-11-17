package edu.buffalostate.cis425.sp17.assignments.vollmer;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 
 * @author: Corey Vollmer

 *
 */ 

 public class SimpleButtons{
	 
	 private static JFrame frame;
	 private static JPanel mainPanel, buttonPanel, labelPanel;
	 private static JButton zeroBtn, oneBtn, twoBtn, threeBtn;
	 private static JTextField theField;

    private static final long serialVersionUID = 1L;

	SimpleButtons() {
   }  //constructor

	// event handler here
	public static void main( String args[ ] ) { 
		createGui();
   } // main here
	
	private static boolean createGui(){
		frame = new JFrame("Simple Buttons");
		frame.setSize(250,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(2,2,1,1));
		
		zeroBtn = new JButton("0");
		zeroBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { 
				theField.setText("0");
			} 
		});
		oneBtn = new JButton("1");
		oneBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { 
				theField.setText("1"); 
			} 
		});
		twoBtn = new JButton("2");
		twoBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { 
				theField.setText("2");    
			} 
		});
		threeBtn = new JButton("3");
		threeBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { 
				theField.setText("3");    
			} 
		});
		
		labelPanel = new JPanel();
		theField = new JTextField(15);
		labelPanel.add(theField);
		
		buttonPanel.add(zeroBtn);
		buttonPanel.add(oneBtn);
		buttonPanel.add(twoBtn);
		buttonPanel.add(threeBtn);
		
		
		mainPanel.add(buttonPanel, BorderLayout.NORTH);
		mainPanel.add(labelPanel, BorderLayout.SOUTH);
		frame.add(mainPanel);
		frame.setVisible(true);
		return true;
	}
}