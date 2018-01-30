package org.cba.api.external;

import org.cba.api.internal.Board;
import org.cba.api.internal.Position;
import org.cba.api.internal.Symbol;

public interface Player {
    void start(Symbol symbol);

    Position doTurn(Position lastPlayedPosition, Board board);

    void gameOver(boolean amIwinner);
}
