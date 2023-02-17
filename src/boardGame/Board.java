package boardGame;



public class Board {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	
	public Board(int linhas, int colunas) {
		if(linhas < 1 || colunas <1) {
			throw new BoardException("Erro criando tabuleiro é necessário que haja pelo menos 1 linha e uma colna ");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}


	public int getLinhas() {
		return linhas;
	}



	public int getColunas() {
		return colunas;
	}


	
	public Peca peca(int linha, int coluna) {
		if(!existePosition(linha,coluna)) {
			throw new BoardException("Posição não está no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Position position) {
		if(!existePosition(position)) {
			throw new BoardException("Posição não está no tabuleiro");
		}
		return pecas[position.getLinha()][position.getColuna()];
	}

	public void colocarPeca(Peca peca, Position position) {
		if(temPeca(position)){
			throw new BoardException("Já existe uma peça na posição: "+ position); 
		}
		pecas[position.getLinha()][position.getColuna()] = peca;
		peca.position = position;
	}
	
	private boolean existePosition(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 &&  coluna < colunas;
	}
	
	public boolean existePosition(Position position) {
		return existePosition(position.getLinha(), position.getColuna());
	}
	
	public boolean temPeca(Position position) {
		if(!existePosition(position)){
			throw new BoardException("Posição inexistente"); 
		}
		 return peca(position) != null;
	}
}
