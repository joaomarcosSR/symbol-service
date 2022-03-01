package com.stock.market.core.domain.exceptions;

public class SymbolTypeException extends RuntimeException {
    private static final String MESSAGE_TEMPLATE = "Couldn't create a symbol type. Invalid value passed: %s.";

    public SymbolTypeException(String value) {
        super(String.format(MESSAGE_TEMPLATE, value));
    }
}
