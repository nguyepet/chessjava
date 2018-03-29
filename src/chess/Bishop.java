package chess;
import java.lang.*;

public class Bishop extends ChessPiece {
	
	public Bishop(Player player) {
		super(player);
	}
	
	public String type() {
		return "Bishop";
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(!super.isValidMove(move, board)) {
			return false;
		}
		boolean valid = false;
		//checks to see if diagonal
		if(Math.abs(move.toRow - move.fromRow) == Math.abs(move.toColumn - move.fromColumn)) {
			
			valid = true;	

		}
	
		return valid;
	}
}
