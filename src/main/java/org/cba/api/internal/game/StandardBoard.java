package org.cba.api.internal.game;

import org.cba.api.internal.Board;
import org.cba.api.internal.Position;
import org.cba.api.internal.Symbol;

import java.util.HashMap;
import java.util.List;

public class StandardBoard implements Board {

    private HashMap<Position,Symbol> positions;

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
        for (int x = 0; x < getXSize(); x++) {
            for (int y = 0; y < getYSize(); y++) {
                Symbol symbol = positions.get(new Position(x,y));
            }
        }
        return "";
    }
}
