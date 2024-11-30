package org.pabuff.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter@Setter
@Builder
@AllArgsConstructor
public class PagIotHistoryDto {
    List<PagIotHistoryRowDto> history;
    PagIotHistoryMetaDto meta;
    //for multiple readings
    Map<String, PagIotHistoryMetaDto> multiMetaInfo;
}
