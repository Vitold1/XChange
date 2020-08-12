package org.knowm.xchange.stablehouse.service;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.service.BaseExchangeService;
import org.knowm.xchange.service.BaseService;

public class StablehouseBaseService extends BaseExchangeService implements BaseService {

    /**
     * Constructor
     *
     * @param exchange
     */
    public StablehouseBaseService(Exchange exchange) {

        super(exchange);
    }
}
