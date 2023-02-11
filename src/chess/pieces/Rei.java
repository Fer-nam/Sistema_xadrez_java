package chess.pieces;

import boardGame.Board;
import chess.Color;
import chess.XadrezPeca;

public class Rei extends XadrezPeca {

	public Rei(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R"; //R de rei
	}

}
