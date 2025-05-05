package org.pabuff.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;

@Getter@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StdDataDto {
    @JsonProperty("result_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String resultKey;

    /*
    result format:
    {
        result_key:
        {
            ...
        }
    }
    */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, Object> result;

    public Map<String, Object> getResultMap () {
        Object obj = result.get(resultKey);
        if (obj instanceof Map) {
            return (Map<String, Object>) obj;
        } else {
            return null;
        }
    }

    public Map<String, Object> toMap() {
        return Map.of(
                "result_key", resultKey,
                "result", result
        );
    }
}
