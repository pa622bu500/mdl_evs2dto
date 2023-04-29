package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

@Builder
@Getter@Setter
public class TariffRecordDto {

    private long id;
    @JsonProperty("tariff_timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime tariffTimestamp;

    @JsonProperty("meter_sn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String meterSn;

    @JsonProperty("kwh_diff")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double kwhDiff;

    @JsonProperty("ref_kwh_total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double refKwhTotal;

    @JsonProperty("debit_amt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double debitAmt;

    @JsonProperty("debit_ref")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String debitRef;

    @JsonProperty("credit_amt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double creditAmt;

    @JsonProperty("credit_ref")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String creditRef;

    @JsonProperty("tariff_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double tariffPrice;

    @JsonProperty("offer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offerId;

    @JsonProperty("ref_bal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double refBal;

    @JsonProperty("ref_bal_tag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String refBalTag;
}
