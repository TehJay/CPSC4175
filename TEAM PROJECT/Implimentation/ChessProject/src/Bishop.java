// TODO: Auto-generated Javadoc
/**
 * The Class Bishop.
 *
 * @author 
 */
public class Bishop extends Piece{

	/** The name. */
	private String name = "B";
	
	/**
	 * Instantiates a new bishop.
	 *
	 * @param w the w
	 */
	public Bishop(boolean w){
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
		
		if (deltaX == deltaY) {
			//System.out.println("canMove:true");
			return true;
		}
		
		//System.out.println("canMove:false");
		
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
