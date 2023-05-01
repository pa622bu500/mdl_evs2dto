package com.pabu5h.evs2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter@Setter
@Builder
@AllArgsConstructor
public class IotHistoryDto {
    List<IotHistoryRowDto> history;
    IotHistoryMetaDto meta;
}
