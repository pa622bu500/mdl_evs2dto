package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xt.utils.DateTimeUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Getter@Setter
@Builder
@AllArgsConstructor
public class MeterInfoDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("meter_sn")
    private String meterSn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("meter_displayname")
    private String meterDisplayname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PremiseDto premise;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String address;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rls_status")
    private String rlsStatus;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("kwh_timestamp")
    private LocalDateTime kwhTimestamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("kwh_reading")
    private float kwhReading;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private float current;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private float voltage;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("reading_interval")
    private long readingInterval;

    public Map<String, Object> toFiledMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("meter_sn", meterSn);
        map.put("meter_displayname", meterDisplayname);
        map.put("premise", premise);
        map.put("address", address);
        map.put("status", status);
        map.put("rls_status", rlsStatus);
        map.put("kwh_timestamp", kwhTimestamp);
        map.put("kwh_reading", kwhReading);
        map.put("current", current);
        map.put("voltage", voltage);
        map.put("reading_interval", readingInterval);
        return map;
    }
    public MeterInfoDto fromFieldMap(Map<String, Object> fieldMap){
        this.meterSn = fieldMap.get("meter_sn")!=null?
            fieldMap.get("meter_sn").toString():null;
        this.meterDisplayname = fieldMap.get("meter_displayname") != null?
            fieldMap.get("meter_displayname").toString():null;

        Map<String, Object> premiseMap = fieldMap.get("premise")!=null?
            (Map<String, Object>) fieldMap.get("premise"):null;
        PremiseDto premiseDto = new PremiseDto(fieldMap);
        this.premise = premiseMap != null? premiseDto:null;

        this.address = (String) fieldMap.get("address") != null?
            fieldMap.get("address").toString():null;
        this.status = (String) fieldMap.get("status")!=null?
            fieldMap.get("status").toString():null;
        this.rlsStatus = (String) fieldMap.get("rls_status")!=null?
            fieldMap.get("rls_status").toString():null;
        this.kwhTimestamp = fieldMap.get("kwh_timestamp")!=null?
            DateTimeUtil.getLocalDateTime(fieldMap.get("kwh_timestamp").toString()):null;
        this.kwhReading = (float) fieldMap.get("kwh_reading");
        this.current = (float) fieldMap.get("current");
        this.voltage = (float) fieldMap.get("voltage");
        this.readingInterval = (long) fieldMap.get("reading_interval");
        return this;
    }
}
