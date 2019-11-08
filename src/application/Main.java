package application;

import boardGame.Board;
import chess.ChessMatch;
import chess.ChessPiece;

public class Main {
	public static void main(String[] args) {
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}
