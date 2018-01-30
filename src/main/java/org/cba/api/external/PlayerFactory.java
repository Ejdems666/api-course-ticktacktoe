package org.cba.api.external;

import org.cba.api.internal.Symbol;

public interface PlayerFactory {
    Player getPlayer();
    Symbol getPrefferedSymbol();
    String getName();
}
