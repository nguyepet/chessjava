package chess;

public class Bishop extends ChessPiece {
	
	public Bishop(Player player) {
		super(player);
	}
	
	public String type() {
		return "Bishop";
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		return false;
	}
}
