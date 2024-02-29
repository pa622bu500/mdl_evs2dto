package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SensorReadingMultiDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String itemName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String itemSn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime dt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double temperature;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double humidity;
}
