package org.cba.api.internal.game;

import org.cba.api.internal.Board;

public class StandardBoard implements Board {

    @Override
    public int getXSize() {
        return 10;
    }

    @Override
    public int getYSize() {
        return 10;
    }
}
