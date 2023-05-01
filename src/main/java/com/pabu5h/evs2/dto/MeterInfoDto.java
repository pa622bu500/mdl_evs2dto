package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter@Setter
@Builder
@AllArgsConstructor
public class MeterInfoDto {
    @JsonProperty("meter_sn")
    private String meterSn;
    @JsonProperty("meter_displayname")
    private String meterDisplayname;
    private String address;
    private String status;
    @JsonProperty("rls_status")
    private String rlsStatus;
    @JsonProperty("kwh_timestamp")
    private LocalDateTime kwhTimestamp;
    @JsonProperty("kwh_reading")
    private float kwhReading;
    private float current;
    private float voltage;
}
