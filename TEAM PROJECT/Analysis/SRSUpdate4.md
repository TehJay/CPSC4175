### SRS4 - Chess Game - Jay P & Isaac M ###

## 1.1 Functional Requirements ##
	1.1.1 	Have two human players
	1.1.2	have two playable full sets of pieces (Black & white)
	1.1.3	Pieces can move
	1.1.4	When a Piece lands on top of an enemy piece, it will remove it.
	1.1.5   8 unique pieces as follows:
		1.1.5.1 Pawn x 8
		1.1.5.2 Rook x 2 
		1.1.5.3 bishop x 2
		1.1.5.4 knight x 2
		1.1.5.5 Queen x 1
		1.1.5.6 King x 1
	1.1.6 Pieces will have a move unique to them.
		1.1.6.1 Pawn: By 2 on initial turn, then 1 up, down, left, and right. Attack diagonally by 1.
		1.1.6.2 Rook: Moves in cardinal direction.
		1.1.6.3 Bishop: Moves diagonally.
		1.1.6.4 Knight: Moves to a square that is two squares away horizontally and
					    one square vertically or two squares vertically and one square horizontally
		1.1.6.5 Queen: Combines the movements of the Rook & Bishop.
		1.1.6.6. King: Moves 1 space in any direction
	1.1.7   When a king is in danger of being attacked the game will call check
	1.1.8   When a king is in check, but also can not move out of danger, the other player will win, and the game will end
	1.1.9   Piece Movement will depend on a clear path. 
    1.1.10  Inclusion of Pawn Promotion: If the pawn is able to traverse to the other edge,
            it will automatically transform into queen
	1.1.11  Any player should have the option to 'resign' from game
	1.1.12  Planned features *(unimplemented)
		1.1.12.1 GUI: Chess board along with load/save/quit buttons
		1.1.12.3 Be able to load/save game state
		1.1.12.4 User can load or open up previously saved game
  
  

## 1.2 External Interface Requirement ##
	1.2.1   User Interface: Command line required for gameplay (GUI in works)
	1.2.2   Software Interface: Latest Java RE required. (Current version: 8u152).