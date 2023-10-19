package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Getter@Setter
@AllArgsConstructor
public class SvcClaimDto {
    @JsonProperty("username")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String username;
    @JsonProperty("user_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final long userId;
    @JsonProperty("svc_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String svcName;
    @JsonProperty("endpoint")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String endpoint;
    @JsonProperty("scope")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String scope;
    @JsonProperty("target")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String target;
    @JsonProperty("operation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String operation;


}
