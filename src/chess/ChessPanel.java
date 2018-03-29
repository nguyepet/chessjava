package chess;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ChessPanel extends JPanel{
		
	    /* GUI Visual for the game board model */
		private JButton[][] board;
		
		/* the chess model to run game*/
		private ChessModel model;
		
		/* The image icons  */
		private ImageIcon iconBlank = new ImageIcon("imgs/blank.png");
		private ImageIcon iconBKing = new ImageIcon("imgs/bKing.png");
		private ImageIcon iconBQueen = new ImageIcon("imgs/bQueen.png");
		private ImageIcon iconBBishop = new ImageIcon("imgs/bBishop.png");
		private ImageIcon iconBKnight = new ImageIcon("imgs/bKnight.png");
		private ImageIcon iconBRook = new ImageIcon("imgs/bRook.png");
		private ImageIcon iconBPawn = new ImageIcon("imgs/bPawn.png");
		private ImageIcon iconWKing = new ImageIcon("imgs/wKing.png");
		private ImageIcon iconWQueen = new ImageIcon("imgs/wQueen.png");
		private ImageIcon iconWBishop = new ImageIcon("imgs/wBishop.png");
		private ImageIcon iconWKnight = new ImageIcon("imgs/wKnight.png");
		private ImageIcon iconWRook = new ImageIcon("imgs/wRook.png");
		private ImageIcon iconWPawn = new ImageIcon("imgs/wPawn.png");
		
		
		/* listener for game action events*/
		private ButtonListener listener = new ButtonListener();
		
		
		/********************************************************************
		 * Constructor for chess GUI panel.
		 *******************************************************************/
		public ChessPanel() {
			
			//starts a new chess model game
			model = new ChessModel();
			setLayout(new GridLayout(8,8));
			setBorder(new LineBorder(Color.BLACK));
			
			//starts GUI board
			board = new JButton[8][8];
					
			//add buttons to the gui board
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; j++) {
					board[i][j] = new JButton(iconBlank); 
					board[i][j].setMargin(new Insets(0,0,0,0));
					board[i][j].setPreferredSize(new Dimension(60,60));
					if(j % 2 == 1 && i % 2 == 1 || j % 2 == 0 && i % 2 == 0) {
						board[i][j].setBackground(Color.WHITE);
					}
					else {
						board[i][j].setBackground(Color.GRAY);
					}
					board[i][j].addActionListener(listener);
					add(board[i][j]);
				}
			}
			
			displayBoard();
		}
		
		
		
		/******************************************************************************
		 *  Method that updates the gui board with corresponding pieces from model
		 ******************************************************************************/
		private void displayBoard() {
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j ++ ) {
					if(model.pieceAt(i, j) != null) {
						
						if( model.pieceAt(i,j).player() == Player.WHITE && model.pieceAt(i,j).type() == "King") {
							board[i][j].setIcon(iconWKing);
						}
						if( model.pieceAt(i,j).player() == Player.WHITE && model.pieceAt(i,j).type() == "Queen") {
							board[i][j].setIcon(iconWQueen);
						}
						if( model.pieceAt(i,j).player() == Player.WHITE && model.pieceAt(i,j).type() == "Bishop") {
							board[i][j].setIcon(iconWBishop);
						}
						if( model.pieceAt(i,j).player() == Player.WHITE && model.pieceAt(i,j).type() == "Knight") {
							board[i][j].setIcon(iconWKnight);
						}
						if( model.pieceAt(i,j).player() == Player.WHITE && model.pieceAt(i,j).type() == "Rook") {
							board[i][j].setIcon(iconWRook);
						}
						if( model.pieceAt(i,j).player() == Player.WHITE && model.pieceAt(i,j).type() == "Pawn") {
							board[i][j].setIcon(iconWPawn);
						}
						
						if( model.pieceAt(i,j).player() == Player.BLACK && model.pieceAt(i,j).type() == "King") {
							board[i][j].setIcon(iconBKing);
						}
						if( model.pieceAt(i,j).player() == Player.BLACK && model.pieceAt(i,j).type() == "Queen") {
							board[i][j].setIcon(iconBQueen);
						}
						if( model.pieceAt(i,j).player() == Player.BLACK && model.pieceAt(i,j).type() == "Bishop") {
							board[i][j].setIcon(iconBBishop);
						}
						if( model.pieceAt(i,j).player() == Player.BLACK && model.pieceAt(i,j).type() == "Knight") {
							board[i][j].setIcon(iconBKnight);
						}
						if( model.pieceAt(i,j).player() == Player.BLACK && model.pieceAt(i,j).type() == "Rook") {
							board[i][j].setIcon(iconBRook);
						}
						if( model.pieceAt(i,j).player() == Player.BLACK && model.pieceAt(i,j).type() == "Pawn") {
							board[i][j].setIcon(iconBPawn);
						}
					
					} else
						board[i][j].setIcon(iconBlank);
				}				
			}			

		}
		
		
		/********************************************************************
		 * Action listener for buttons 
		 ********************************************************************/
		private class ButtonListener implements ActionListener{
			
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Hi" +  event.getSource() );
			}
		}
		
		
}
