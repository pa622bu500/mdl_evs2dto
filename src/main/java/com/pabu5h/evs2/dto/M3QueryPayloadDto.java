package com.pabu5h.evs2.dto;

import lombok.*;

@Builder
@Getter@Setter
@AllArgsConstructor
public class M3QueryPayloadDto <T>{
    private final T data;
}
