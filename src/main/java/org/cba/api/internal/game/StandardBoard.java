package org.cba.api.internal.game;

import org.cba.api.internal.Board;
import org.cba.api.internal.Position;
import org.cba.api.internal.Symbol;

import java.util.HashMap;
import java.util.List;

public class StandardBoard implements Board {

    private HashMap<Position, Symbol> positions;

    public StandardBoard(HashMap<Position, Symbol> positions) {
        this.positions = positions;
    }

    @Override
    public int getXSize() {
        return 10;
    }

    @Override
    public int getYSize() {
        return 10;
    }

    @Override
    public String toString() {
        String board = "------------\n";
        for (int y = 0; y < getYSize(); y++) {
            board += "|";
            for (int x = 0; x < getXSize(); x++) {
                Symbol symbol = positions.get(new Position(x, y));
                if (symbol == null) {
                    board += ".";
                } else if (symbol == Symbol.CIRCLE) {
                    board += "O";
                } else {
                    board += "X";
                }
            }
            board += "|\n";

        }
        board += "------------";

        return board;
    }
}
