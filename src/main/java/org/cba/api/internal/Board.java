package org.cba.api.internal;

import java.util.List;

public interface Board {
    List<Position> getPositionsToTheLeft(Position position);

    List<Position> getPositionsToTheRight(Position position);

    List<Position> getPositionsToTheTop(Position position);

    List<Position> getPositionsToTheBottom(Position position);

    List<Position> getPositionsToTheBottomLeft(Position position);

    List<Position> getPositionsToTheBottomRight(Position position);

    List<Position> getPositionsToTheTopLeft(Position position);

    List<Position> getPositionsToTheTopRight(Position position);

    int getXSize();

    int getYSize();
}
