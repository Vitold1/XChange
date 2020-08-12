package org.knowm.xchange.stablehouse.service;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.stablehouse.Stablehouse;
import si.mazi.rescu.RestProxyFactory;

public class StablehouseMarketDataServiceRaw extends StablehouseBaseService{
    private final Stablehouse stablehouse;
    /**
     * Constructor
     *
     * @param exchange
     */
    public StablehouseMarketDataServiceRaw(Exchange exchange) {

        super(exchange);
        this.stablehouse =
                RestProxyFactory.createProxy(
                        Stablehouse.class, exchange.getExchangeSpecification().getSslUri(), getClientConfig());
    }

}