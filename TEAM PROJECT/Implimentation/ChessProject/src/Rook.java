// TODO: Auto-generated Javadoc
/**
 * The Class Rook.
 *
 * @author 
 */
public class Rook extends Piece{

	/** The name. */
	private String name = "R";
	
	/**
	 * Instantiates a new rook.
	 *
	 * @param w the w
	 */
	public Rook(boolean w){
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
		
		if (deltaX == 0 && deltaY != 0){
			return true;
		} else if (deltaX != 0 && deltaY == 0) {
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
