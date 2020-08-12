package org.knowm.xchange.stablehouse.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.util.Objects;

/** Data object representing Address from Stablehouse Web Service */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "result",
        "timestamp",
        "isSuccessful",
        "errorMessage",
        "errorCode",
        "requestId"
})
public class StablehouseAddress {

    @JsonProperty("result")
    private GetAddressResult result;
    @JsonProperty("timestamp")
    private BigDecimal timestamp;
    @JsonProperty("isSuccessful")
    private Boolean isSuccessful;
    @JsonProperty("errorMessage")
    private String errorMessage;
    @JsonProperty("errorCode")
    private BigDecimal errorCode;
    @JsonProperty("requestId")
    private String requestId;
    /**
     * Constructor
     *
     * @param result
     * @param timestamp
     * @param isSuccessful
     * @param errorMessage
     * @param errorCode
     * @param requestId
     */
    public StablehouseAddress(GetAddressResult result,
                              BigDecimal timestamp,
                              Boolean isSuccessful,
                              String errorMessage,
                              BigDecimal errorCode,
                              String requestId)
    {
        this.result = result;
        this.timestamp = timestamp;
        this.isSuccessful = isSuccessful;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.requestId = requestId;

    }

    public StablehouseAddress() {
    }

    public GetAddressResult getResult() {
        return result;
    }

    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public Boolean getSuccessful() {
        return isSuccessful;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public BigDecimal getErrorCode() {
        return errorCode;
    }

    public String getRequestId() {
        return requestId;
    }

    @Override
    public String toString() {
        return "StablehouseAddress{" +
                "result=" + result +
                ", timestamp=" + timestamp +
                ", isSuccessful=" + isSuccessful +
                ", errorMessage='" + errorMessage + '\'' +
                ", errorCode=" + errorCode +
                ", requestId='" + requestId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StablehouseAddress that = (StablehouseAddress) o;
        return Objects.equals(result, that.result) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(isSuccessful, that.isSuccessful) &&
                Objects.equals(errorMessage, that.errorMessage) &&
                Objects.equals(errorCode, that.errorCode) &&
                Objects.equals(requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, timestamp, isSuccessful, errorMessage, errorCode, requestId);
    }
}
