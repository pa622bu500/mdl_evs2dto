package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Builder
@AllArgsConstructor
public class IotHistoryMetaDto {
    @JsonProperty("dominant_interval")
    long dominantInterval;
    long duration;
    @JsonProperty("max_val")
    double maxVal;
    @JsonProperty("avg_val")
    double avgVal;
}
