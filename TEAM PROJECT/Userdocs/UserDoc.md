## User Document - Chess Game by Jay P. & Isaac M. ##

### This document will give detailed instructions on running the Chess Project ###

Location of the executable jar file: [Executable](https://github.com/TehJay/CPSC4175Jay/tree/master/TEAM%20PROJECT)  
  

Starting the program:  
  
	  Double click the .jar executable to run the game

Playing the game:  

	After choosing between the player color, the player, who has been assigned white, will play first. 
    The chess board is in a 8x8 area; piece-position are noted by Letters 'A-H' & Numbers '1-8'.
	To move a chess piece, use the following input format:
		"[letter-position][number-position] [letter-position][number-position]"
		- E.g "a1 a3"
    

Chess Rules: 
	
	Piece Movements:
		King - The king can only move one square in any direction - up, down, to the sides, and diagonally. 
				The king may never move himself into check (where he could be captured). 
				When the king is attacked by another piece this is called "check".
		Queen - She can move in any one straight direction - forward, backward, sideways, or diagonally - 
				as far as possible as long as she does not move through any of her own pieces.
		Rook - The rook may move as far as it wants, but only forward, backward, and to the sides. 
		Bishop - The bishop may move as far as it wants, but only diagonally. 
				Each bishop starts on one color (light or dark) and must always stay on that color.
		Knight - Knights move in a very different way from the other pieces – 
				going two squares in one direction, and then one more move at a 90 degree angle,
	    		just like the shape of an “L”. Knights are also the only pieces that can move over other pieces.
		Pawn - Pawns are unusual because they move and capture in different ways: 
				they move forward, but capture diagonally. Pawns can only move forward one square at a time,
				except for their very first move where they can move forward two squares. 
				Pawns can only capture one square diagonally in front of them. They can never move or capture backwards. 
				If there is another piece directly in front of a pawn he cannot move past or capture that piece.

	Pawn Promotion: 
		Pawns have another special ability and that is that if a pawn reaches the other side of the 
		board it can become any other chess piece (called promotion). A pawn may be promoted to any piece. 
		A common misconception is that pawns may only be exchanged for a piece that has been captured.
		That is NOT true. A pawn is usually promoted to a queen. Only pawns may be promoted.

	Checkmate & winning the game: 
		The purpose of the game is to checkmate the opponent's king. This happens when the king is put into check and cannot get out of 
		check. There are only three ways a king can get out of check: move out of the way (though he cannot castle!), block
		the check with another piece, or capture the piece threatening the king. If a king cannot escape checkmate then
		the game is over. Customarily the king is not captured or removed from the board, the game is simply declared over.