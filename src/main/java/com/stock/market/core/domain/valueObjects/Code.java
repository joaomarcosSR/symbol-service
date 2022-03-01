package com.stock.market.core.domain.valueObjects;

import com.stock.market.core.domain.valueObjects.base.ValueObject;

public class Code extends ValueObject<String> {
    public Code(String value) {
        super(value);
    }

    @Override
    protected boolean isValid(String value) {
        int MINIMUM_LENGTH = 3;
        return value.length() >= MINIMUM_LENGTH;
    }
}
