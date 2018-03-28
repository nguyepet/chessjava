package chess;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChessPanel extends JPanel{
		
		/* the display buttons for board */
		private JButton[][] board;
		
		/* the chess model to run game*/
		private ChessModel model;
		
		/* The image icons  */
		private ImageIcon iconBlank;
		private ImageIcon iconBKing;
		private ImageIcon iconBQueen;
		private ImageIcon iconB;
		
		/* listener for game action events*/
		private ButtonListener listener = new ButtonListener();
		
		
		/********************************************************************
		 * Constructor for chess panel
		 *******************************************************************/
		public ChessPanel() {
			
			
			setLayout(new GridLayout(8, 8));
			setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
			
			
		}
		
		/********************************************************************
		 *  Method that updates the board
		 ********************************************************************/
		private void displayBoard() {
			
		}
		
		/********************************************************************
		 * Action listener for buttons 
		 ********************************************************************/
		private class ButtonListener implements ActionListener{
			
			public void actionPerformed(ActionEvent event) {
				
			}
		}
		
		
}
