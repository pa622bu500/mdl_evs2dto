package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.xt.utils.LocalDateTimeMultiDeserializer;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MeterBypassDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("bypass_always")
    boolean bypassAlways;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("bypass1_start_timestamp")
    private LocalDateTime bypass1StartTimestamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("bypass1_end_timestamp")
    private LocalDateTime bypass1EndTimestamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("bypass2_start_timestamp")
    private LocalDateTime bypass2StartTimestamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("bypass2_end_timestamp")
    private LocalDateTime bypass2EndTimestamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("bypass3_start_timestamp")
    private LocalDateTime bypass3StartTimestamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("bypass3_end_timestamp")
    private LocalDateTime bypass3EndTimestamp;

    public Map<String, Object> toFieldMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("bypass_always", bypassAlways);
        map.put("bypass1_start_timestamp", bypass1StartTimestamp);
        map.put("bypass1_end_timestamp", bypass1EndTimestamp);
        map.put("bypass2_start_timestamp", bypass2StartTimestamp);
        map.put("bypass2_end_timestamp", bypass2EndTimestamp);
        map.put("bypass3_start_timestamp", bypass3StartTimestamp);
        map.put("bypass3_end_timestamp", bypass3EndTimestamp);
        return map;
    }

    static ObjectMapper objectMapper = new ObjectMapper();
    public  static MeterBypassDto fromFieldMap(Map<String, Object> fieldMap){
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        objectMapper.findAndRegisterModules();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeMultiDeserializer());
        objectMapper.registerModule(module);
        try {
            return objectMapper.convertValue(fieldMap, MeterBypassDto.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString(){
        return "bypass_always: " + bypassAlways + ", " +
                "bypass1_start_timestamp: " + bypass1StartTimestamp + ", " +
                "bypass1_end_timestamp: " + bypass1EndTimestamp + ", " +
                "bypass2_start_timestamp: " + bypass2StartTimestamp + ", " +
                "bypass2_end_timestamp: " + bypass2EndTimestamp + ", " +
                "bypass3_start_timestamp: " + bypass3StartTimestamp + ", " +
                "bypass3_end_timestamp: " + bypass3EndTimestamp;
    }
}
