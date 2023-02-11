package chess;

import boardGame.Board;
import boardGame.Peca;

public class XadrezPeca extends Peca {
	
	private Color color;

	public XadrezPeca(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	
	

	
}
