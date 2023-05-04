package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Builder
@Getter
@Setter
public class TransactionLogDto {
//    private long id;

    @JsonProperty("transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transactionId;

    @JsonProperty("transaction_log_timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transactionLogTimestamp;

    @JsonProperty("meter_displayname")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String meterDisplayname;

    @JsonProperty("topup_amt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double topupAmt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double gst;

    @JsonProperty("net_amt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double netAmt;

    @JsonProperty("payment_mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer paymentMode;

    @JsonProperty("transaction_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer transactionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String currency;

    @JsonProperty("offer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer offerId;

    @JsonProperty("response_timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String responseTimestamp;

    @JsonProperty("complete_send_to_backend")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean completeSendToBackend;

    @JsonProperty("transaction_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transactionCode;

    @JsonProperty("payment_channel")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer paymentChannel;

    @JsonProperty("transaction_status_rcved")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer transactionStatusRcved;

    @JsonProperty("conversion_ratio")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double conversionRatio;

    @JsonProperty("audit_no")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String auditNo;

    @JsonProperty("is_dedicated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean isDedicated;

    public Map<String, Object> genFieldMap(){
        return Map.ofEntries(
                Map.entry("transaction_id", transactionId),
                Map.entry("transaction_log_timestamp", transactionLogTimestamp),
                Map.entry("meter_displayname", meterDisplayname),
                Map.entry("topup_amt", topupAmt),
                Map.entry("gst", gst),
                Map.entry("net_amt", netAmt),
                Map.entry("payment_mode", paymentMode),
                Map.entry("transaction_status", transactionStatus),
                Map.entry("currency", currency),
                Map.entry("offer_id", offerId),
                Map.entry("response_timestamp", responseTimestamp),
                Map.entry("complete_send_to_backend", completeSendToBackend),
                Map.entry("transaction_code", transactionCode),
                Map.entry("payment_channel", paymentChannel),
                Map.entry("transaction_status_rcved", transactionStatusRcved),
                Map.entry("conversion_ratio", conversionRatio),
                Map.entry("audit_no", auditNo),
                Map.entry("is_dedicated", isDedicated)
        );
    }

}
