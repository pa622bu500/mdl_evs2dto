package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @JsonProperty("readings")
//    List<Map<String, Double>> readings;
//    @JsonProperty("reading_diff")
//    List<Map<String, Double>> readingDiffs;

    /* sample:
    {
        "fieldKey1":
        {
            "reading_total": 123.45,
            "reading_total_is_est": false,
            "reading_diff": 0.0,
        },
        "fieldKey2":
        {
            "reading_total": 123.45,
            "reading_diff": 0.0,
            "reading_diff_is_est": true,
        }
    }
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("readings")
    Map<String, Map<String, Object>> readings;

    //data saver with short names
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("dt")
    LocalDateTime dt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rt")
    double rt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rd")
    double rd;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ri_m")
    double riM;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ri_s")
    double riS;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("is_est")
    boolean isEst;
}
