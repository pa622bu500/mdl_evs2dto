package org.pabuff.dto;


import lombok.*;

@Builder
@Getter@Setter
@AllArgsConstructor
public class QueryDto {
    private final QueryCredDto credential;
    private final Object request;
    private final Object request2;

}
