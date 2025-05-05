package org.pabuff.dto;

/*
    * This class is a placeholder for the standard response structure.
    * It can be extended or modified to include specific fields as needed.
*/

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Builder
@Getter@Setter
public class StdRespDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private boolean success;
    /*
    data:
    {
        result_key: Map<String, Object>
    }
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, Object> data;
    /*
    error:
    {
        code: Enum,
        message: String,
    }
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private StdErrorDto error;
}
