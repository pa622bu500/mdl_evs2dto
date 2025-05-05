package org.pabuff.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.pabuff.utils.ApiCode;

import java.util.Map;

@Getter@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StdErrorDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ApiCode code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    public Map<String, Object> toMap() {
        return Map.of(
                "code", code,
                "message", message
        );
    }
}
