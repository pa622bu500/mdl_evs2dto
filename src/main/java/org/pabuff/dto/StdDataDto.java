package org.pabuff.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter@Setter
@Builder
public class StdDataDto {
    @JsonProperty("result_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String resultKey;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, Object> result;
}
