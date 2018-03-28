package chess;
import java.lang.Math;

public abstract class ChessPiece implements IChessPiece
{
   
    private Player owner;

    /**
     * Constructor for objects of class ChessPiece
     */
    public ChessPiece(Player player)
    {
        // initialize instance variables
        this.owner = player;
    }

    public abstract String type();
    
    public Player player() {
        return owner;
    }
    
    public boolean isValidMove(Move move,IChessPiece[][] board) {
       if (move.fromRow == move.toRow && move.fromColumn == move.toColumn) {
           return false;
        }
        
        if ( this != board[move.fromRow][move.fromColumn] ) {
            return false;
        }
        
        if ( board[move.toRow][move.toColumn] != null &&
             board[move.toRow][move.toColumn].player() == owner ) {
            return false;
        }
        
        return true;
        
    }
    
    /****************************************************************************
     * Checks the path of the move to see if path is clear
     * @param move the move to be checked
     * @param the chess board
     * @return true if path is clear
     ****************************************************************************/
    public boolean isClearPath(Move move, IChessPiece[][] board) {
    		
    		//find direction path of move
    		int rowDirection = (int) Math.signum(move.toRow - move.fromRow);
    		int colDirection = (int) Math.signum(move.toColumn - move.fromColumn);
    		
    		//starts checking point at start of move
    		int rowCheckPt = move.fromRow;
    		int colCheckPt = move.fromColumn;
    		
    		//moves along path until hits ending point
    		while(!(rowCheckPt == move.toRow && colCheckPt == move.toColumn)) {
    			//if there is obstacle return false
    			if(board[rowCheckPt][colCheckPt] != null) {
    				return false;
    			}
    			//increments to next spot on path
    			rowCheckPt = rowCheckPt + rowDirection;
    			colCheckPt = colCheckPt + colDirection;
    		}
    		
    		return true;
    }
}

