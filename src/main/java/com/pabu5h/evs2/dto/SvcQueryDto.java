package com.pabu5h.evs2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class SvcQueryDto {
    private final SvcClaimDto svcClaimDto;
    private final Object request;
}
