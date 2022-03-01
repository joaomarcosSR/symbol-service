package com.stock.market.core.domain.valueObjects.base;

import com.stock.market.core.domain.exceptions.ValueObjectException;

import static java.util.Objects.isNull;

public abstract class ValueObject<T> {
    T value;

    public ValueObject(T value) {
        if (isInvalid(value)) {
            throw new ValueObjectException(this.getClass(), value.toString());
        }
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    private boolean isInvalid(T value) {
        return isNull(value) || !isValid(value);
    }

    protected abstract boolean isValid(T value);
}
