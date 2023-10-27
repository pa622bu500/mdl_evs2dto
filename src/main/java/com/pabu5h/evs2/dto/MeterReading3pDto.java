package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MeterReading3pDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("meter_id")
    private String meterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("meter_sn")
    private String msn;

    //TIMESTAMP in shortened ISO8601 format
    //ISO8061: 2019-12-31T23:59:59.999Z
    //Use shortened
    //Example: 2019-12-31T23:59:59
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("dt")
    private LocalDateTime dt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ptp_v_l1")
    private double ptpVoltageL1;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ptp_v_l2")
    private double ptpVoltageL2;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ptp_v_l3")
    private double ptpVoltageL3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("l_c_l1")
    private double lineCurrentL1;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("l_c_l2")
    private double lineCurrentL2;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("l_c_l3")
    private double lineCurrentL3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ap_pf")
    private double allPhasePowerFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("freq")
    private double frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ap_a_p_t")
    private double allPhaseActivePowerTotal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ap_re_p")
    private double allPhaseReactivePower;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ap_a_p")
    private double allPhaseApparentPower;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("a_imp")
    private double activeImport;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("a_exp")
    private double activeExport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("re_lag")
    private double reactiveLag;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("re_lead")
    private double reactiveLead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("c_md_sb_a_imp")
    private double currentMaxDemandSinceBillingActiveImport;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("c_md_sb_a_exp")
    private double currentMaxDemandSinceBillingActiveExport;
}
