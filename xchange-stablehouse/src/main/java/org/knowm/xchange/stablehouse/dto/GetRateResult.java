package org.knowm.xchange.stablehouse.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fundingMatrix"
})
public final class GetRateResult {

    @JsonProperty("fundingMatrix")
    private FundingMatrix fundingMatrix;

    public GetRateResult(FundingMatrix fundingMatrix) {
        this.fundingMatrix = fundingMatrix;
    }

    public GetRateResult() {
    }

    public FundingMatrix getFundingMatrix() {
        return fundingMatrix;
    }

    @Override
    public String toString() {
        return "GetRateResult{" +
                "fundingMatrix=" + fundingMatrix +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRateResult that = (GetRateResult) o;
        return Objects.equals(fundingMatrix, that.fundingMatrix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundingMatrix);
    }
}
