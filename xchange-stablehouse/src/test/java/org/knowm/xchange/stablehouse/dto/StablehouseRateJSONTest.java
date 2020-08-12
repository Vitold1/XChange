package org.knowm.xchange.stablehouse.dto;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

/** Test StablehouseRate JSON parsing */
public class StablehouseRateJSONTest {
    @Test
    public void testUnmarshal() throws IOException {

        // Read in the JSON from the example resources
        InputStream is =
                StablehouseAddressJSONTest.class.getResourceAsStream(
                        "/org/knowm/xchange/stablehouse/dto/marketdata/example-rate-data.json");

        // Use Jackson to parse it
        ObjectMapper mapper = new ObjectMapper();
        StablehouseRate stablehouseRate = mapper.readValue(is, StablehouseRate.class);

        // Verify that the example data was unmarshalled correctly
        assertThat(stablehouseRate.getResult().getFundingMatrix().getFundingRate()[0].getCurrency1IsBase()).isEqualTo("string");
        assertThat(stablehouseRate.getResult().getFundingMatrix().getFundingRate()[0].getCurrencyCode1()).isEqualTo("string");
        assertThat(stablehouseRate.getResult().getFundingMatrix().getFundingRate()[0].getCurrencyCode2()).isEqualTo("string");
        assertThat(stablehouseRate.getResult().getFundingMatrix().getFundingRate()[0].getRate()).isEqualTo("string");
        assertThat(stablehouseRate.getResult().getFundingMatrix().getFundingRate()[0].getLiquidity()).isEqualTo("string");
        assertThat(stablehouseRate.getTimestamp()).isEqualTo(new BigDecimal(0));
        assertThat(stablehouseRate.getTimestamp()).isEqualTo(new BigDecimal(0));
        assertThat(stablehouseRate.getSuccessful()).isEqualTo(Boolean.TRUE);
        assertThat(stablehouseRate.getErrorMessage()).isEqualTo("string");
        assertThat(stablehouseRate.getErrorCode()).isEqualTo(new BigDecimal(0));
        assertThat(stablehouseRate.getRequestId()).isEqualTo("string");
    }
}
