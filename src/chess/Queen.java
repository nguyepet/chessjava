package chess;

public class Queen extends ChessPiece {
	
	public Queen(Player player) {
		super(player);
	}
	
	public String type() {
		return "Queen";
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if(!super.isValidMove(move, board)) {
			return false;
		}
		boolean valid = false;
		//checks to see if this piece is being moved horizontally
		if(move.toRow == move.fromRow) {
			for(int i = 1; i < 8; i++) {
				//checks for right movements
				if(move.fromColumn == move.toColumn + i) {
					if(isClearPath(move, board)) {
						valid = true;
					}
				}
				//checks for left movements
				if(move.fromColumn == move.toColumn - i) {
					if(isClearPath(move, board)) {
						valid = true;
					}
				}
			}
		}
		//checks to see if this piece is being moved vertically
		if(move.toColumn == move.fromColumn) {
			for(int i = 1; i < 8; i++) {
				//checks for up movements
				if(move.fromRow == move.toRow + i) {
					if(isClearPath(move, board)) {
						valid = true;
					}
				}
				//checks for down movements
				if(move.fromRow == move.toRow - i) {
					if(isClearPath(move, board)) {
						valid = true;
					}
				}
			}
		}
		
		//diagonal
		if(Math.abs(move.toRow - move.fromRow) == Math.abs(move.toColumn - move.fromColumn)) {
			
			valid = true;	

		}
		return valid;
	}
}
