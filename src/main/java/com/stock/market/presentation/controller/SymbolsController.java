package com.stock.market.presentation.controller;

import com.stock.market.core.domain.entities.Symbol;
import com.stock.market.core.domain.enums.Currency;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Controller("/symbols")
public class SymbolsController {

    @Get
    public List<Symbol> getAll() {
        // https://www.alphavantage.co/query?function=SYMBOL_SEARCH&keywords=PETR&apikey=IG38WIHOGQ07E0CL
        return Collections.singletonList(new Symbol(UUID.randomUUID(), "PETR3.SAO", Currency.BRL, "Petróleo Brasileiro S.A. - Petrobras"));
    }
}
