package com.pabu5h.evs2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter@Setter
@AllArgsConstructor
public class QueryReqDto<T> {
    private final T reqData;
}

