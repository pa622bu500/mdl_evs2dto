package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

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
    Double maxVal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("max_val_dt")
    LocalDateTime maxValDt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("min_val")
    Double minVal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("min_val_non_zero")
    Double minValNonZero;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("min_val_non_zero_dt")
    LocalDateTime minValNonZeroDt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("avg_val")
    Double avgVal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("median_val")
    Double medianVal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("total")
    Double total;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("positive_count")
    long positiveCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("first_val")
    Double firstVal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("first_val_dt")
    LocalDateTime firstValDt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("last_val")
    Double lastVal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("last_val_dt")
    LocalDateTime lastValDt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("total_count")
    LocalDateTime totalCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("total_missing_count")
    LocalDateTime totalMissingCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("total_negative_count")
    LocalDateTime totalNegativeCount;
}
