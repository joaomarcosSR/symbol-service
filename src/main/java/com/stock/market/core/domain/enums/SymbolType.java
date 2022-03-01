package com.stock.market.core.domain.enums;

import com.stock.market.core.domain.exceptions.SymbolTypeException;

public enum SymbolType {
    EQUITY("Equity"),
    ETF("ETF");

    private final String value;

    SymbolType(String value) {
        this.value = value;
    }

    public static SymbolType toEnum(String value) {
        for (SymbolType type : SymbolType.values()) {
            if (type.value.equals(value)) return type;
        }
        throw new SymbolTypeException(value);
    }
}
