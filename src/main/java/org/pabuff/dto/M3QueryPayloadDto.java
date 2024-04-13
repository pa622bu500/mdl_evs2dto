package org.pabuff.dto;

import lombok.*;

@Builder
@Getter@Setter
@AllArgsConstructor
public class M3QueryPayloadDto <T>{
    private final T data;
}
