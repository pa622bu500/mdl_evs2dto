package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("dominant_interval")
    long dominantInterval;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("duration")
    long duration;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("max_val")
    double maxVal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("min_val")
    double minVal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("min_val_non_zero")
    double minValNonZero;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("avg_val")
    double avgVal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("median_val")
    double medianVal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("total")
    double total;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("positive_count")
    long positiveCount;
}
