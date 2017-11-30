

// TODO: Auto-generated Javadoc
/**
 * An abstract Piece, contains the methods that a Piece must have to navigate the board correctly.
 * 
 * @author 
 *
 */
public abstract class Piece {
	
	/**
	 * Says which player the piece belongs to. True is white, false is black.
	 */
	private boolean white = true;
	
	/** The first move. */
	public boolean firstMove = true;
	
	/**
	 * Sets the piece to belong to the white or black player. White is represented as True, black is represented as false.
	 * @param t - the true or false value.
	 */
	public void setWhite(boolean t){
		white = t;
	}
	
	
	
	/**
	 * Tells whether the piece is which or black. White is true, black is false.
	 *
	 * @return true, if is white
	 */
	public boolean isWhite(){
		return this.white;
	}
	
	
	
	/**
	 * Can move.
	 *
	 * @param oldX the old X
	 * @param oldY the old Y
	 * @param newX the new X
	 * @param newY the new Y
	 * @param isNewSpotEmpty the is new spot empty
	 * @return true, if successful
	 */
	public abstract boolean canMove(int oldX, int oldY, int newX, int newY, boolean isNewSpotEmpty);
	
	/**
	 * Move piece.
	 */
	public abstract void movePiece();
	
	/**
	 * Draw piece.
	 *
	 * @return the string
	 */
	public abstract String drawPiece();
}
