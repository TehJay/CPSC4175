// TODO: Auto-generated Javadoc
/**
 * The Class King.
 *
 * @author 
 */
public class King extends Piece{

	/** The name. */
	private String name = "K";
	
	/**
	 * Instantiates a new king.
	 *
	 * @param w the w
	 */
	public King(boolean w){
		this.setWhite(w);
		
		if (w == true){
			this.name = "w" + this.name; 
		}else{
			this.name = "b" + this.name; 
		}
	}
	
	/* (non-Javadoc)
	 * @see Piece#canMove(int, int, int, int, boolean)
	 */
	public boolean canMove(int oldX, int oldY, int newX, int newY, boolean isNewSpotEmpty) {
	
		int deltaX;
		int deltaY;
		
		deltaX = Math.abs(newX-oldX);
		deltaY = Math.abs(newY-oldY);
		
		if (deltaX == deltaY && deltaX == 1 && deltaY == 1){
			return true;
		}else if (deltaX == 0 && deltaY == 1){
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			return true;
		}
		
		return false;
	}

	/* (non-Javadoc)
	 * @see Piece#drawPiece()
	 */
	public String drawPiece() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see Piece#movePiece()
	 */
	public void movePiece() {
		
	}

}
