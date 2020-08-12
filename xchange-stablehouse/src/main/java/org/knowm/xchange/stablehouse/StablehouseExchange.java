package org.knowm.xchange.stablehouse;

import org.knowm.xchange.BaseExchange;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.stablehouse.service.StablehouseMarketDataService;
import si.mazi.rescu.SynchronizedValueFactory;

public class StablehouseExchange extends BaseExchange implements Exchange {

    @Override
    protected void initServices() {
        this.marketDataService = new StablehouseMarketDataService(this);
    }

    @Override
    public ExchangeSpecification getDefaultExchangeSpecification() {
        ExchangeSpecification exchangeSpecification =
                new ExchangeSpecification(this.getClass().getCanonicalName());
        exchangeSpecification.setSslUri("https://api.stablehouse.io/v1");
        exchangeSpecification.setHost("www.stablehouse.io/");
        // exchangeSpecification.setPort(443);
        exchangeSpecification.setExchangeName("Stablehouse");
        exchangeSpecification.setExchangeDescription(
                "Stablehouse is a stablecoin exchange");
        return null;
    }

    @Override
    public SynchronizedValueFactory<Long> getNonceFactory() {
        // No private API implemented. Not needed for this exchange at the moment.
        return null;
    }
}
