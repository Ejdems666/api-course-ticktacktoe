package org.cba.api.internal.game;

import org.cba.api.internal.Position;
import org.cba.api.internal.Symbol;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Position, Symbol> positions = new HashMap<>();
        positions.put(new Position(3, 6), Symbol.CIRCLE);
        positions.put(new Position(6, 2), Symbol.CROSS);


        StandardBoard sb = new StandardBoard(positions);

        System.out.println(sb);
    }
}
