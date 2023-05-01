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
public class IotHistoryRowDto {
    @JsonProperty("reading_timestamp")
    LocalDateTime readingTimestamp;
    @JsonProperty("reading_total")
    double readingTotal;
    @JsonProperty("reading_diff")
    double readingDiff;
    @JsonProperty("reading_interval")
    double readingInterval;
    @JsonProperty("is_estimated")
    boolean isEstimated;
}
