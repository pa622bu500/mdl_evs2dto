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
    private Double ptpVoltageL1;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ptp_v_l2")
    private Double ptpVoltageL2;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ptp_v_l3")
    private Double ptpVoltageL3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("l_c_l1")
    private Double lineCurrentL1;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("l_c_l2")
    private Double lineCurrentL2;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("l_c_l3")
    private Double lineCurrentL3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ap_pf")
    private Double allPhasePowerFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("freq")
    private Double frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ap_a_p_t")
    private Double allPhaseActivePowerTotal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ap_re_p")
    private Double allPhaseReactivePower;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ap_a_p")
    private Double allPhaseApparentPower;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("a_imp")
    private Double activeImport;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("a_exp")
    private Double activeExport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("re_lag")
    private Double reactiveLag;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("re_lead")
    private Double reactiveLead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("c_md_sb_a_imp")
    private Double currentMaxDemandSinceBillingActiveImport;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("c_md_sb_a_exp")
    private Double currentMaxDemandSinceBillingActiveExport;
}
