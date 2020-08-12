package org.knowm.xchange.stablehouse.service;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.service.marketdata.MarketDataService;

public class StablehouseMarketDataService extends StablehouseMarketDataServiceRaw
        implements MarketDataService {

    /**
     * Constructor
     *
     * @param exchange
     */
    public StablehouseMarketDataService(Exchange exchange) {

        super(exchange);
    }
}
