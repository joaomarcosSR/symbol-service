package com.stock.market.core.domain.entities;

import com.stock.market.core.domain.entities.base.Entity;
import com.stock.market.core.domain.enums.Currency;
import com.stock.market.core.domain.enums.SymbolType;
import com.stock.market.core.domain.valueObjects.Code;
import com.stock.market.core.domain.valueObjects.Name;

import java.util.UUID;

public class Symbol extends Entity {
    private final Currency currency;
    private Code code;
    private Name name;
    private SymbolType type;
    private String region;
    private String marketOpen;
    private String marketClose;
    private String timezone;

    public Symbol(UUID id, String code, Currency currency, String name) {
        super(id);
        this.currency = currency;
        setCode(code);
        setName(name);
    }

    public Symbol(UUID id, String code, Currency currency, String name, SymbolType type, String region,
                  String marketOpen, String marketClose, String timezone) {
        super(id);
        this.currency = currency;
        setCode(code);
        setName(name);
        setType(type);
        setRegion(region);
        setMarketOpen(marketOpen);
        setMarketClose(marketClose);
        setTimezone(timezone);
    }

    public String getCode() {
        return code.getValue();
    }

    private void setCode(String code) {
        this.code = new Code(code);
    }

    public String getName() {
        return name.getValue();
    }

    public void setName(String name) {
        this.name = new Name(name);
    }

    public SymbolType getType() {
        return type;
    }

    public void setType(SymbolType type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMarketOpen() {
        return marketOpen;
    }

    public void setMarketOpen(String marketOpen) {
        this.marketOpen = marketOpen;
    }

    public String getMarketClose() {
        return marketClose;
    }

    public void setMarketClose(String marketClose) {
        this.marketClose = marketClose;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Currency getCurrency() {
        return currency;
    }
}
