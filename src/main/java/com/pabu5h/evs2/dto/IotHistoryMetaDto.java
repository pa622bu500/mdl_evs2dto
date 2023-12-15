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
    Long dominantInterval;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("duration")
    Long duration;
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
    @JsonProperty("min_non_zero_interval_minutes")
    Double minNonZeroIntervalMinutes;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("max_interval_minutes")
    Double maxIntervalMinutes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("raw_data_count")
    Long rawDataCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("expected_reading_count")
    Long expectedReadingCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("missing_reading_count")
    Long missingReadingCount;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @JsonProperty("total_count")
//    Long totalCount;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @JsonProperty("total_missing_count")
//    Long totalMissingCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("negative_count")
    Long negativeCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("interval_outlier_count")
    Long intervalOutlierCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("repeated_reading_count")
    Long repeatedReadingCount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("over_threshold_count")
    Long overThresholdCount;
}
