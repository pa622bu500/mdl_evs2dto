package org.pabuff.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.pabuff.utils.ApiCode;

@Getter@Setter
@Builder
public class StdErrorDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ApiCode code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
}
