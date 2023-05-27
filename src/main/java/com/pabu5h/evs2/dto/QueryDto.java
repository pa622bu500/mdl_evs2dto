package com.pabu5h.evs2.dto;


import lombok.*;

@Builder
@Getter@Setter
@AllArgsConstructor
public class QueryDto {
    private final QueryCredDto credential;
    private final Object request;
    private final Object request2;

}
