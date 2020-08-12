package org.knowm.xchange.stablehouse.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "currencyCode",
        "depositAddress"
})
public final class GetAddressResult {


    /**
     * @param currencyCode
     * @param depositAddress
     */
    public GetAddressResult(String currencyCode, String depositAddress) {
        this.currencyCode = currencyCode;
        this.depositAddress = depositAddress;
    }

    public GetAddressResult() {
    }

    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("depositAddress")
    private String depositAddress;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getDepositAddress() {
        return depositAddress;
    }

    @Override
    public String toString() {
        return "GetAddressResult{" +
                "currencyCode='" + currencyCode + '\'' +
                ", depositAddress='" + depositAddress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAddressResult that = (GetAddressResult) o;
        return Objects.equals(currencyCode, that.currencyCode) &&
                Objects.equals(depositAddress, that.depositAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, depositAddress);
    }
}
