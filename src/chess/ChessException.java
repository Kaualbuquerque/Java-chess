package chess;

import boardgame.BoardExepition;

public class ChessException extends BoardExepition {
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}
}
