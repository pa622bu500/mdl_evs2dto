package org.pabuff.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SensorSingleReadingDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("item_name")
    private String itemName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("item_sn")
    private String itemSn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("type")
    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("val")
    private Double val;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("dt")
    private LocalDateTime dt;

}
