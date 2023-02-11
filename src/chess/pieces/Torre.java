package chess.pieces;

import boardGame.Board;
import chess.Color;
import chess.XadrezPeca;

public class Torre extends XadrezPeca{

	public Torre(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "T";//T de torre
	}
}
