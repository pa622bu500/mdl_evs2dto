package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter@Setter
@Builder
@AllArgsConstructor
public class IotHistoryRowDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("reading_timestamp")
    LocalDateTime readingTimestamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("reading_total")
    double readingTotal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("reading_diff")
    double readingDiff;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("reading_interval")
    double readingInterval;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("is_estimated")
    boolean isEstimated;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("readings")
    double[] readings;
}
