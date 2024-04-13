package org.pabuff.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class QueryPayloadDto<T> {
    private final T data;
}
