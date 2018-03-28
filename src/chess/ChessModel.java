package chess;


/**********************************************************************************
* Class responsible for storing the chess board and implementing the game logic.
***********************************************************************************/
public class ChessModel implements IChessModel {
	
	/* the chess board*/
	private IChessPiece[][] board;
	
	/* the current player*/
	private Player player;
	
	
	/****************************************************************************
	 * Class Constructor creates a chess board and starting player
	 *****************************************************************************/
	public ChessModel() {
		
		//starting player is white
		player = Player.WHITE;
		
		//board is filled with chess pieces
		board[0][0] = new Rook(Player.BLACK);
		board[0][1] = new Knight(Player.BLACK);
		board[0][2] = new Bishop(Player.BLACK);
		board[0][3] = new Queen(Player.BLACK);
		board[0][4] = new King(Player.BLACK);
		board[0][5] = new Bishop(Player.BLACK);
		board[0][6] = new Knight(Player.BLACK);
		board[0][7] = new Rook(Player.BLACK);
		
		board[1][0] = new Pawn(Player.BLACK);
		board[1][1] = new Pawn(Player.BLACK);
		board[1][2] = new Pawn(Player.BLACK);
		board[1][3] = new Pawn(Player.BLACK);
		board[1][4] = new Pawn(Player.BLACK);
		board[1][5] = new Pawn(Player.BLACK);
		board[1][6] = new Pawn(Player.BLACK);
		board[1][7] = new Pawn(Player.BLACK);
		
		board[2][0] = null;
		board[2][1] = null;
		board[2][2] = null;
		board[2][3] = null;
		board[2][4] = null;
		board[2][5] = null;
		board[2][6] = null;
		board[2][7] = null;		
		board[3][0] = null;
		board[3][1] = null;
		board[3][2] = null;
		board[3][3] = null;
		board[3][4] = null;
		board[3][5] = null;
		board[3][6] = null;
		board[3][7] = null;
		board[4][0] = null;
		board[4][1] = null;
		board[4][2] = null;
		board[4][3] = null;
		board[4][4] = null;
		board[4][5] = null;
		board[4][6] = null;
		board[4][7] = null;
		board[5][0] = null;
		board[5][1] = null;
		board[5][2] = null;
		board[5][3] = null;
		board[5][4] = null;
		board[5][5] = null;
		board[5][6] = null;
		board[5][7] = null;
		
		board[6][0] = new Pawn(Player.WHITE);
		board[6][1] = new Pawn(Player.WHITE);
		board[6][2] = new Pawn(Player.WHITE);
		board[6][3] = new Pawn(Player.WHITE);
		board[6][4] = new Pawn(Player.WHITE);
		board[6][5] = new Pawn(Player.WHITE);
		board[6][6] = new Pawn(Player.WHITE);
		board[6][7] = new Pawn(Player.WHITE);
		
		board[7][0] = new Rook(Player.WHITE);
		board[7][1] = new Knight(Player.WHITE);
		board[7][2] = new Bishop(Player.WHITE);
		board[7][3] = new Queen(Player.WHITE);
		board[7][4] = new King(Player.WHITE);
		board[7][5] = new Bishop(Player.WHITE);
		board[7][6] = new Knight(Player.WHITE);
		board[7][7] = new Rook(Player.WHITE);
		
	}
	
	/****************************************************************************
	 * Returns whether the game is complete
	 *****************************************************************************/
	public boolean isComplete() {
		return false;
	}
	
	
	/**********************************************************************************
	 * Returns whether the piece at location is allowed to be moved to target location
	 ***********************************************************************************/
	public boolean isValidMove(Move move) {
		//check if within bounds
		if(move.toRow >= 0 && move.toRow < 8 || move.toColumn >= 0 && move.toColumn < 8) {
			throw new IndexOutOfBoundsException("Invalid locations on board");
		}
		
		if(move.fromRow >= 0 && move.fromRow < 8 || move.fromColumn >= 0 && move.fromColumn < 8) {
			throw new IndexOutOfBoundsException("Invalid locations on board");
		}
		
		//GRABS PIECE TYPE AND CHECK VALID MOVE?
		return (pieceAt(move.fromRow, move.fromColumn).isValidMove(move, board));
	}
	
	
	/*****************************************************************************
	 * Moves the piece from starting position to target position
	 *****************************************************************************/
	public void move(Move move) {
		//check if within bounds
		if(move.toRow >= 0 && move.toRow < 8 || move.toColumn >= 0 && move.toColumn < 8) {
			throw new IndexOutOfBoundsException("Invalid locations on board");
		}
				
		if(move.fromRow >= 0 && move.fromRow < 8 || move.fromColumn >= 0 && move.fromColumn < 8) {
			throw new IndexOutOfBoundsException("Invalid locations on board");
		}
		
		//copies piece at starting location
		IChessPiece movingPiece = pieceAt(move.fromRow, move.fromColumn);
		
		//empties starting position
		board[move.fromRow][move.fromColumn] = null;
		
		//copies piece over to new position
		board[move.toRow][move.toColumn] = movingPiece;
		
	}
	
	
	/*****************************************************************************
	 * Reports whether player is in check
	 *****************************************************************************/
	public boolean inCheck(Player p) {
		return false;
	}
	
	
	/******************************************************************************
	 * Returns current player
	 ******************************************************************************/
	public Player currentPlayer() {
		return player;
	}
	
	
	/******************************************************************************
	 * Returns number of rows in board
	 ******************************************************************************/
	public int numRows(){
		return 8;
	}
	
	
	/******************************************************************************
	 * Returns number of columns in board
	 ******************************************************************************/
	public int numColumns(){
		return 8;
	}
	
	
	/******************************************************************************
	 * Returns chess piece at given location.
	 ******************************************************************************/
	public IChessPiece pieceAt(int row, int column) {
		return board[row][column];
	}
}
