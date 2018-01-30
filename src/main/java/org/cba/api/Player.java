package org.cba.api;

public interface Player {
    void start(Symbol symbol);

    Position doTurn(Position lastPlayedPosition, Board board);
}
