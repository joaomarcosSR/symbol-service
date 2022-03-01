package com.stock.market.core.domain.exceptions;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;

public class ValueObjectException extends RuntimeException {
    private static final String MESSAGE_TEMPLATE = "Couldn't create a value object of type %s. The value %s is invalid.";

    public ValueObjectException(@NotNull Type type, String value) {
        super(String.format(MESSAGE_TEMPLATE, type.getTypeName(), value));
    }
}
