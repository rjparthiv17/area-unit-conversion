// Java program to convert area unit
// cm sq to the meter sq and vice-versa
// using Java Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AreaUnit {

	public static void converter()
	{


		JFrame f = new JFrame("CONVERTER");
		JLabel l1, l2,l3,l4;
		JTextField t1, t2,t3,t4;
		// Creating three buttons
		JButton b1, b2, b3,b4,b5;
	        l1 = new JLabel("cm sq:");
		l1.setBounds(20, 40, 60, 30);
		l2 = new JLabel("m sq:");
		l2.setBounds(170, 40, 60, 30);
		t1 = new JTextField("0");
		t1.setBounds(80, 40, 60, 30);
		t2 = new JTextField("0");
		t2.setBounds(240, 40, 60, 30);
                //next unit
                l3 = new JLabel("m sq:");
		l3.setBounds(20, 120, 60, 30);
		l4 = new JLabel("km sq:");
		l4.setBounds(170, 120, 60, 30);
		t3 = new JTextField("0");
		t3.setBounds(80, 120, 60, 30);
		t4 = new JTextField("0");
		t4.setBounds(240, 120, 60, 30);

		// Creating a button for cm sq,
		// one button for the m sq
		// and one button to close
		// and setting the bounds
		b1 = new JButton("cm");
		b1.setBounds(50, 80, 60, 15);
		b2 = new JButton("meter");
		b2.setBounds(190, 80, 60, 15);
                 //new button

		b4 = new JButton("meter");
		b4.setBounds(50, 150, 60, 15);
		b5 = new JButton("km");
		b5.setBounds(190, 150, 60, 15);
		b3 = new JButton("close");
		b3.setBounds(150, 200, 60, 30);

		// Adding action listener
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				double d= Double.parseDouble(t1.getText());
				double d1 = (d / 10000);
				String str1 = String.valueOf(d1);
				t2.setText(str1);
			}
		});

		// Adding action listener
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				// Converting to double
				double d2= Double.parseDouble(t2.getText());
				// converting meter sq to cm sq
				double d3 = (d2 * 10000);
				String str2 = String.valueOf(d3);
				// Placing it in the text box
				t1.setText(str2);
			}
		});
                     ///////////////////////////
                 b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				// Converting to double
				double d4= Double.parseDouble(t3.getText());
				// converting meter sq to km sq
				double d5 = (d4/1000000);
				String str2 = String.valueOf(d5);
				// Placing it in the text box
				t4.setText(str2);
			}
		});
                    ////////////////////////
                 b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				// Converting to double
				double d6= Double.parseDouble(t4.getText());
				// converting km sq to m sq
				double d7 = (d6 * 1000000);
				String str2 = String.valueOf(d7);
				// Placing it in the text box
				t3.setText(str2);
			}
		});

		// Action listener to close the form
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				f.dispose();
			}
		});

		// Default method for closing the frame
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		// Adding the created objects
		// to the form
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
                f.add(l3);
                f.add(t3);
                f.add(l4);
                f.add(t4);
		f.add(b1);
		f.add(b2);
                f.add(b4);
                f.add(b5);
		f.add(b3);
                
		f.setLayout(null);
		f.setSize(400, 300);
		f.setVisible(true);
	}

	// Driver code
	public static void main(String args[])
	{
		converter();
	}
}
