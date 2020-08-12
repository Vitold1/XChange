package org.knowm.xchange.stablehouse.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

/** Test StablehouseAddress JSON parsing */
public class StablehouseAddressJSONTest {
    @Test
    public void testUnmarshal() throws IOException {

        // Read in the JSON from the example resources
        InputStream is =
                StablehouseAddressJSONTest.class.getResourceAsStream(
                        "/org/knowm/xchange/stablehouse/dto/marketdata/example-address-data.json");

        // Use Jackson to parse it
        ObjectMapper mapper = new ObjectMapper();
        StablehouseAddress stablehouseAddress = mapper.readValue(is, StablehouseAddress.class);

        // Verify that the example data was unmarshalled correctly

        assertThat(stablehouseAddress.getResult()).isEqualTo(new GetAddressResult("string", "string"));
        assertThat(stablehouseAddress.getTimestamp()).isEqualTo(new BigDecimal(0));
        assertThat(stablehouseAddress.getSuccessful()).isEqualTo(Boolean.TRUE);
        assertThat(stablehouseAddress.getErrorMessage()).isEqualTo("string");
        assertThat(stablehouseAddress.getErrorCode()).isEqualTo(new BigDecimal(0));
        assertThat(stablehouseAddress.getRequestId()).isEqualTo("string");
    }
}
