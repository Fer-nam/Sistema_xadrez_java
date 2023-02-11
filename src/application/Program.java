package application;

import boardGame.Board; 
import chess.XadrezPartida;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XadrezPartida xadrezPartida = new XadrezPartida();
		UI.imprimirBoard(xadrezPartida.getPecas());
	}

}
