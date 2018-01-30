package org.cba.api.internal.game;

import org.cba.api.internal.Board;
import org.cba.api.internal.Position;

import java.util.List;

public class StandardBoard implements Board{
    @Override
    public List<Position> getPositionsToTheLeft(Position position) {
        return null;
    }

    @Override
    public List<Position> getPositionsToTheRight(Position position) {
        return null;
    }

    @Override
    public List<Position> getPositionsToTheTop(Position position) {
        return null;
    }

    @Override
    public List<Position> getPositionsToTheBottom(Position position) {
        return null;
    }

    @Override
    public List<Position> getPositionsToTheBottomLeft(Position position) {
        return null;
    }

    @Override
    public List<Position> getPositionsToTheBottomRight(Position position) {
        return null;
    }

    @Override
    public List<Position> getPositionsToTheTopLeft(Position position) {
        return null;
    }

    @Override
    public List<Position> getPositionsToTheTopRight(Position position) {
        return null;
    }

    @Override
    public int getXSize() {
        return 10;
    }

    @Override
    public int getYSize() {
        return 10;
    }
}
