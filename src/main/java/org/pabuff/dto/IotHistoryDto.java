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
public class IotHistoryDto {
    List<IotHistoryRowDto> history;
    List<IotHistoryRowDto2> history2;
    IotHistoryMetaDto meta;
    //for multiple readings
    Map<String, IotHistoryMetaDto> metas;
}
