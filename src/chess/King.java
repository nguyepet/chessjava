package chess;

public class King extends ChessPiece{
	
	public King(Player player) {
		super(player);
	}
	
	public String type() {
		return "King";
	}
	
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		return false;
	}
}
