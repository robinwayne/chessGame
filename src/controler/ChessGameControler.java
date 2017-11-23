package controler;

import model.BoardGames;
import model.ChessGame;
import model.Coord;

public class ChessGameControler implements ChessGameControlers {

	private BoardGames chessGame;
	
	public ChessGameControler(BoardGames chessGame) {
		this.chessGame= chessGame;
	}
	
	@Override
	public boolean move(Coord initCoord, Coord finalCoord) {
		// TODO Auto-generated method stub
		return chessGame.move(initCoord.x, initCoord.y, finalCoord.x, finalCoord.y);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return chessGame.getMessage();
	}

	@Override
	public boolean isEnd() {
		// TODO Auto-generated method stub
		return chessGame.isEnd();
	}

	@Override
	public boolean isPlayerOK(Coord initCoord) {
		// TODO Auto-generated method stub
		return false;
	}

}
