
/**
 * The data structure that stores the pieces, tracks their locations on the board as the game progresses, checks whether a movement of a piece is legal. 
 * 
 * @author
 *
 */
public class Board {
	
	Piece[][] board;
	
	
	/**
	 * Initializes the board and the appropriate amount of black and white pieces in their initial states.
	 * 
	 */	
	public Board(){
		board = new Piece[8][8];
		
		initializeBoard();
		
	}
	
	
	public void initializeBoard(){
		//initialize the board
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				board[i][j] = null;
			}
		}
		
		
		/*
		 *|bR|bN|bB|bQ|bK|bB|bN|bR| 8 
		 *|wP|wP|wP|wP|wP|wP|wP|wP| 7
		 *|  |##|  |##|  |##|  |##| 4
		 *|##|  |##|  |##|  |##|  | 5
		 *|  |##|  |##|  |##|  |##| 4
		 *|##|  |##|  |##|  |##|  | 3
		 *|bP|bP|bP|bP|bP|bP|bP|bP| 2
		 *|bR|bN|bB|bQ|bK|bB|bN|bR| 1
		 * a   b  c  d  e  f  g  h
		 */
		
		/*  i
		 *  0   1  2  3  4  5  6  7  
		 *|bR|bN|bB|bQ|bK|bB|bN|bR| 0  j
		 *|wP|wP|wP|wP|wP|wP|wP|wP| 1
		 *|  |##|  |##|  |##|  |##| 2
		 *|##|  |##|  |##|  |##|  | 3
		 *|  |##|  |##|  |##|  |##| 4
		 *|##|  |##|  |##|  |##|  | 5
		 *|bP|bP|bP|bP|bP|bP|bP|bP| 6
		 *|bR|bN|bB|bQ|bK|bB|bN|bR| 7
		 * 
		 */
		
		//initialize the pieces and place them on the board.
		//white
		board[0][1] = new Pawn(false);
		board[1][1] = new Pawn(false);
		board[2][1] = new Pawn(false);
		board[3][1] = new Pawn(false);
		board[4][1] = new Pawn(false);
		board[5][1] = new Pawn(false);
		board[6][1] = new Pawn(false);
		board[7][1] = new Pawn(false);
		
		board[0][0] = new Rook(false);
		board[1][0] = new Knight(false);
		board[2][0] = new Bishop(false);
		board[3][0] = new Queen(false);
		board[4][0] = new King(false);
		board[5][0] = new Bishop(false);
		board[6][0] = new Knight(false);
		board[7][0] = new Rook(false);
		
		//black
		board[0][6] = new Pawn(true);
		board[1][6] = new Pawn(true);
		board[2][6] = new Pawn(true);
		board[3][6] = new Pawn(true);
		board[4][6] = new Pawn(true);
		board[5][6] = new Pawn(true);
		board[6][6] = new Pawn(true);
		board[7][6] = new Pawn(true);
		
		board[0][7] = new Rook(true);
		board[1][7] = new Knight(true);
		board[2][7] = new Bishop(true);
		board[3][7] = new Queen(true);
		board[4][7] = new King(true);
		board[5][7] = new Bishop(true);
		board[6][7] = new Knight(true);
		board[7][7] = new Rook(true);
	
		//board[4][4] = new Pawn(true);
		//board[5][2] = new Pawn(true);
		//board[5][0] = new Pawn(false);
		//board[5][5] = new King(true);
		
		
	}
	
	public boolean isPathClear(int oldX, int oldY, int newX, int newY){
		
		//System.out.println("isPathClear");
		
		String pieceName = board[oldX][oldY].drawPiece();
		
		if (pieceName.equalsIgnoreCase("wk") || pieceName.equalsIgnoreCase("bk")) {
			return true;
		} else if (pieceName.equalsIgnoreCase("wn") || pieceName.equalsIgnoreCase("bn")) {
			return true;
		//} else if (pieceName.equalsIgnoreCase("wp") || pieceName.equalsIgnoreCase("bp")) {
		//	return true;
		}
		
		int deltaX;
		int deltaY;
		
		deltaX = newX-oldX;
		deltaY = newY-oldY;
		
		int tempx = oldX;
		int tempy = oldY;
		int dx = 0;
		int dy = 0;
		
		if (deltaX > 0) {
			dx = 1;
		}else if (deltaX < 0) {
			dx = -1;
		}
		
		if (deltaY > 0) {
			dy = 1;
		}else if (deltaY < 0) {
			dy = -1;
		}
		
		
		boolean clearPath = true;
		
		
		
		if (deltaY == 0) {
			tempx = tempx + dx;
			//System.out.println("newx:"+newX+" newy:"+newY);
			for (int i = 0; i < Math.abs(deltaX)-1; i++) {
				//System.out.println("tempx:"+tempx+ " tempy:"+tempy);
				if (board[tempx][tempy] != null) {
					clearPath = false;
					break;
				}
				
				tempx = tempx + dx;
			} 
			return clearPath;
		}
		
		
		if (deltaX == 0) {
		/*	System.out.println(deltaX + " "+ deltaY + " " + dx + " " + dy+ " " + tempx + " " + tempy);
			System.out.println(oldX + " " + oldY );
			System.out.println(newX + " " + newY ); */
			tempy = tempy + dy;
			//System.out.println("newx:"+newX+" newy:"+newY);
			for (int i = 0; i < Math.abs(deltaY)-1; i++) {
				//System.out.println("tempx:"+tempx+ " tempy:"+tempy);
				if (board[tempx][tempy] != null) {
					clearPath = false;
					break;
				}
				
				tempy = tempy + dy;
			}
			
			return clearPath;
		}
		
		if (deltaX != 0 && deltaY != 0) {
			tempx = tempx + dx;
			tempy = tempy + dy;
			//System.out.println("newx:"+newX+" newy:"+newY);
			for (int i = 0; i < Math.abs(deltaY)-1; i++) {
			//while ((tempx != newX && tempy != newY)) { 
				//System.out.println("tempx:"+tempx+ " tempy:"+tempy);
				if (board[tempx][tempy] != null) {
					clearPath = false;
					break;
				}
				
				tempx = tempx + dx;
				tempy = tempy + dy;
			} 
		}
		
		return clearPath;
		
	}
		
	public boolean detectCheck(boolean whiteturn) {
		int kingLocX = 0;
		int kingLocY = 0;
		
			
		if (whiteturn == true) {//if whiteturn is false, check if the white is in check
			for (int y = 0; y < 8; y++){
				for (int x = 0; x < 8; x++){
					if (board[x][y] != null) {
						if (board[x][y].drawPiece().equalsIgnoreCase("wk")) {
							kingLocX = x;
							kingLocY = y;
							break;
						}
					}
				}
			}
			
			for (int y = 0; y < 8; y++){
				for (int x = 0; x < 8; x++){
					if (board[x][y] != null) {
						if (board[x][y].isWhite() == false) {
							if (board[x][y].canMove(x, y, kingLocX, kingLocY, true)) {
								if (isPathClear(x, y, kingLocX, kingLocY)) {
									//System.out.println("white king is in check by "+board[x][y].drawPiece());
									//System.out.println("CHECK");
									return true;
								}
							}
						}
					}
				}
			}
		}
		
		
		if (whiteturn == false) {//if whiteturn is true, check if the black is in check
			for (int y = 0; y < 8; y++){
				for (int x = 0; x < 8; x++){
					if (board[x][y] != null) {
						if (board[x][y].drawPiece().equalsIgnoreCase("bk")) {
							kingLocX = x;
							kingLocY = y;
							break;
						}
					}
				}
			}
			
			for (int y = 0; y < 8; y++){
				for (int x = 0; x < 8; x++){
					if (board[x][y] != null) {
						if (board[x][y].isWhite() == true) {
							if (board[x][y].canMove(x, y, kingLocX, kingLocY, true)) {
								if (isPathClear(x, y, kingLocX, kingLocY)) {
									//System.out.println("black king is in check by "+board[x][y].drawPiece());
									//System.out.println("CHECK");
									return true;
								}
							}
						}
					}
				}
			}
		}
		
	
		return false;
	}
	
}
