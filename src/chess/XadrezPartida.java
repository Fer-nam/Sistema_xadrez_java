package chess;

import boardGame.Board;

public class XadrezPartida {

	private Board board;
	
	public XadrezPartida() {
		board = new Board(8,8);
	}
	
	
	public XadrezPeca[][] getPecas(){
		XadrezPeca[][] mat = new XadrezPeca[board.getLinhas()][board.getColunas()];
		for (int i=0; i<board.getLinhas(); i++) {
			for (int j = 0; j<board.getColunas();j++) {
				mat[i][j] = (XadrezPeca) board.peca(i, j);
			}
		}
		return mat;
	}
} 
