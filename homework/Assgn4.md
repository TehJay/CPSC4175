##Homework #4 ##

### Jay Patel ###

### 1. ###
Entity Class: models information which is log-lived throughout the software's life cycle (Bank account in a banking software)
  
Boundary Class: models interaction between the software product and its actors; mostly related to I/O between the USER and application.  

Control Class: models complex computations and algorithms. In the case of the banking software, this could be anything that does the actual calculations. 
### 2. ###
Player one will pick game color; 
Player one will take his/her turn;
Player two will take his/her turn.
### 3. ###
Successful can: Player 1 will initialize the game and along with player two, they will play (move chess pieces) and in the end one wins via a condition (checkmate) 
### 4. ###
Unsuccessful: Player 1 is able to initialize the game, however due to mistake in game algorithm neither players are able to win. 
### 5. ###
Stage 1: 2 Players will play a chess game. Both players will the assigned the game pieces. Their moves will be restricted by the game board and if the checkmate condition satisfies then one of two player will win.  
Stage 2: Nouns/Classlist: Player, GamePiece, GameBoard, GamePlayer.
Entity: Game piece, Player
Boundary: GamePlayer (lets the user select piece and move)
Control: GameBoard (check/restricts piece movement, also checks for winning condition)
### 6. - 10.###
Check HW4 Diagrams.pdf in repo.
