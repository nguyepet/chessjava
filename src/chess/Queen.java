package chess;

public class Queen extends ChessPiece {
	
	public Queen(Player player) {
		super(player);
	}
	
	public String type() {
		return "Queen";
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		return false;
	}
}
