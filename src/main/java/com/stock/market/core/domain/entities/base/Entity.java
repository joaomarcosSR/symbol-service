package com.stock.market.core.domain.entities.base;

import java.util.UUID;

public abstract class Entity {
    private final UUID id;

    public Entity(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
