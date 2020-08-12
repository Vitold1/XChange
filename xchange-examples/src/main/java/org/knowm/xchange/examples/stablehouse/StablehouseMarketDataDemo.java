package org.knowm.xchange.examples.stablehouse;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.stablehouse.StablehouseExchange;
import org.knowm.xchange.stablehouse.dto.StablehouseRate;
import org.knowm.xchange.stablehouse.dto.StablehouseAddress;
import org.knowm.xchange.stablehouse.service.StablehouseMarketDataServiceRaw;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.OrderBook;
import org.knowm.xchange.dto.marketdata.Ticker;
import org.knowm.xchange.service.marketdata.MarketDataService;

import java.io.IOException;

public class StablehouseMarketDataDemo {
    public static void main(String[] args) throws Exception {

        ExchangeSpecification exchangeSpecification =
                new ExchangeSpecification(StablehouseExchange.class.getName());
        exchangeSpecification.setApiKey("DqVJMxtOadAlM4ARD7iZt2+f7gpOAS+2AtR4lmOz8jU=");
        exchangeSpecification.setSecretKey("wdMi666tjjLI3hwlHCHjBhHxAtx1KLMMhP9fM/i0rzU=");
        //Here must be ecrypt for SH-SIGNATURE
        System.out.println(exchangeSpecification.toString());
        Exchange stablehouseExchange = ExchangeFactory.INSTANCE.createExchange(exchangeSpecification);

        //  generic(stablehouseExchange);
        //    raw(stablehouseExchange);
    }

    private static void generic(Exchange exchange) throws IOException {

        // Interested in the public market data feed (no authentication)
        MarketDataService bitcoiniumGenericMarketDataService = exchange.getMarketDataService();

        // Get the latest ticker data showing BTC to USD
        Ticker ticker =
                bitcoiniumGenericMarketDataService.getTicker(new CurrencyPair("BTC", "BITSTAMP_USD"));

        System.out.println("Last: " + ticker.getLast());
        System.out.println("Bid: " + ticker.getBid());
        System.out.println("Ask: " + ticker.getAsk());
        System.out.println("Volume: " + ticker.getVolume());

        // Get the latest order book data for BTC/USD
        OrderBook orderBook =
                bitcoiniumGenericMarketDataService.getOrderBook(
                        new CurrencyPair("BTC", "BITSTAMP_USD"), "TEN_PERCENT");

        System.out.println("Order book: " + orderBook);
    }
}