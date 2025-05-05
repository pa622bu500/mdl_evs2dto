package org.pabuff.dto;

/*
    * This class is a placeholder for the standard response structure.
    * It can be extended or modified to include specific fields as needed.
*/

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Builder
@Getter@Setter
@AllArgsConstructor
public class StdRespDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private StdDataDto data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private StdErrorDto error;

    public Map<String, Object> getDataResultMap() {
        if (data != null) {
            return data.getResultMap();
        }
        return null;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("success", success);
        map.put("data", data == null ? null : data.toMap());
        map.put("error", error == null ? null : error.toMap());
        return map;
    }
}
