package com.Scroller.Game.Main;

import java.awt.BorderLayout;


import javax.swing.JFrame;

public class Main {

	public static void main (String[] args) {
		JFrame Frame = new JFrame("Scroller");
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setResizable(false);
		Frame.setLayout(new BorderLayout());
		Frame.add(new GamePanel(), BorderLayout.CENTER);
		Frame.pack();
		Frame.setLocationRelativeTo(null);
		Frame.setVisible(true);
		
		
	}

	
	
}
