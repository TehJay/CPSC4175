
// TODO: Auto-generated Javadoc
/**
 * The Class Pawn.
 *
 * @author 
 */
public class Pawn extends Piece{

	/** The name. */
	private String name = "P";
	
	
	
	/**
	 * Instantiates a new pawn.
	 *
	 * @param w the w
	 */
	public Pawn(boolean w){
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
		boolean legal = false;
		
		if (this.isWhite() == true){
			deltaY = -(newY-oldY);
		}else{
			deltaY = newY - oldY;
		}
		
		deltaX = Math.abs(newX-oldX);

		if (deltaY == 1 && deltaX == 0 && isNewSpotEmpty == true){
			legal = true;
		} else if (deltaX == 1 && deltaY == 1 && isNewSpotEmpty == false){  //pawn capture
			legal  = true;
		} else if (this.firstMove == true && deltaY == 2 && deltaX == 0 && isNewSpotEmpty == true){
			legal = true;
		
		}
		
	/*	if (legal == true){
			this.firstMove = false;
		}
	*/	
		return legal;
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
