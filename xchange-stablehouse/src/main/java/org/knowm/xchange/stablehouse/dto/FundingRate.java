package org.knowm.xchange.stablehouse.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "currency1IsBase",
        "currencyCode1",
        "currencyCode2",
        "rate",
        "liquidity"
})
public final class FundingRate {

    @JsonProperty("currency1IsBase")
    private String currency1IsBase;
    @JsonProperty("currencyCode1")
    private String currencyCode1;
    @JsonProperty("currencyCode2")
    private String currencyCode2;
    @JsonProperty("rate")
    private String rate;
    @JsonProperty("liquidity")
    private String liquidity;

    public FundingRate(String currency1IsBase, String currencyCode1, String currencyCode2, String rate, String liquidity) {
        this.currency1IsBase = currency1IsBase;
        this.currencyCode1 = currencyCode1;
        this.currencyCode2 = currencyCode2;
        this.rate = rate;
        this.liquidity = liquidity;
    }

    public FundingRate() {
    }

    public String getCurrency1IsBase() {
        return currency1IsBase;
    }

    public String getCurrencyCode1() {
        return currencyCode1;
    }

    public String getCurrencyCode2() {
        return currencyCode2;
    }

    public String getRate() {
        return rate;
    }

    public String getLiquidity() {
        return liquidity;
    }

    @Override
    public String toString() {
        return "FundingRate{" +
                "currency1IsBase='" + currency1IsBase + '\'' +
                ", currencyCode1='" + currencyCode1 + '\'' +
                ", currencyCode2='" + currencyCode2 + '\'' +
                ", rate='" + rate + '\'' +
                ", liquidity='" + liquidity + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FundingRate that = (FundingRate) o;
        return Objects.equals(currency1IsBase, that.currency1IsBase) &&
                Objects.equals(currencyCode1, that.currencyCode1) &&
                Objects.equals(currencyCode2, that.currencyCode2) &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(liquidity, that.liquidity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency1IsBase, currencyCode1, currencyCode2, rate, liquidity);
    }
}
