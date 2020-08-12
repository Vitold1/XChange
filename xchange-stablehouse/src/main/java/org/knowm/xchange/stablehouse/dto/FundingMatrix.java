package org.knowm.xchange.stablehouse.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fundingRates"
})
public final class FundingMatrix {

    @JsonProperty("fundingRates")
    private FundingRate[] fundingRate;

    public FundingMatrix(FundingRate[] fundingRate) {
        this.fundingRate = fundingRate;
    }

    public FundingRate[] getFundingRate() {
        return fundingRate;
    }

    public FundingMatrix() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FundingMatrix that = (FundingMatrix) o;
        return Arrays.equals(fundingRate, that.fundingRate);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(fundingRate);
    }

    @Override
    public String toString() {
        return "FundingMatrix{" +
                "fundingRate=" + Arrays.toString(fundingRate) +
                '}';
    }
}