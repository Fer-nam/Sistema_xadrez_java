package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.Rei;
import chess.pieces.Torre;

public class XadrezPartida {

	private Board board;
	
	public XadrezPartida() {
		board = new Board(8,8);
		setupInicial();
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
	private void setupInicial() {
		board.colocarPeca(new Torre(board,Color.BRANCO), new Position(2,1));
		board.colocarPeca(new Rei(board, Color.PRETO), new Position(0,4));
		board.colocarPeca(new Rei(board, Color.BRANCO), new Position(7,4));
	};
} 
