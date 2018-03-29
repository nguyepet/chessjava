package chess;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChessGUI {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Chess Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		ChessPanel panel = new ChessPanel();
		frame.getContentPane().add(panel);
		
		
		frame.pack();
		frame.setVisible(true);
				
	}
}
