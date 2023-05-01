package com.pabu5h.evs2.dto;

import lombok.*;

@Builder
@Getter@Setter
@AllArgsConstructor
public class SvcClaimDto {
    private final String username;
    private final String svcName;
    private final String endpoint;
    private final String scope;
    private final String target;
    private final String operation;
}
