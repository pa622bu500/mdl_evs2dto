package org.pabuff.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class M3QueryDto{
    private final QueryCredDto cred;
    private final M3QueryPayloadDto payload;

}
