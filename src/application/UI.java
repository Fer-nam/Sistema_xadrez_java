package application;

import chess.XadrezPeca;

public class UI {

	public static void imprimirBoard(XadrezPeca[][] pecas) {
		for (int i =0;i< pecas.length; i++) {
			System.out.print((8-i)+ " ");
			for(int j= 0 ;j<pecas.length; j++) {
				imprimirPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.print(" a b c d e f g h");
	}
	
	private static void imprimirPeca(XadrezPeca peca) {
		if(peca ==null) {
			System.out.print("-");
		}
		else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
