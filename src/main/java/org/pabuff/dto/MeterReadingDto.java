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
public class MeterReadingDto {
    /* Example JSON:

    {
     "uid":"BIE2IEYAAMACIADIAA",
     "msn":"202006000534",
     "kwh":"37.309",
     "dt":"2023-03-03T05:24:03"
    },

    */

    @JsonInclude(JsonInclude.Include.NON_NULL)
    //ID of the submission batch
    private String uid;

    //Meter Serial Number
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("meter_sn")
    private String msn;

    //Latest reading
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("kwh_total")
    private float kwh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private float current;

    //TIMESTAMP in shortened ISO8601 format
    //ISO8061: 2019-12-31T23:59:59.999Z
    //Use shortened
    //Example: 2019-12-31T23:59:59
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("kwh_timestamp")
    private LocalDateTime dt;

}
