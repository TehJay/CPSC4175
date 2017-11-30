// TODO: Auto-generated Javadoc
/**
 * The Class Knight.
 *
 * @author 
 */
public class Knight extends Piece{

	/** The name. */
	private String name = "N";
	
	/**
	 * Instantiates a new knight.
	 *
	 * @param w the w
	 */
	public Knight(boolean w){
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
		
		if (deltaX == 2 && deltaY == 1){
			return true;
		} else if (deltaX == 1 && deltaY == 2) {
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
