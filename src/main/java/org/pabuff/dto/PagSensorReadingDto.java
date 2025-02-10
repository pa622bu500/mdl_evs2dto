package org.pabuff.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.pabuff.utils.DateTimeUtil;
import org.pabuff.utils.SqlUtil;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PagSensorReadingDto {
    private Long id;

    @JsonProperty("item_sn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String itemSn;

    @JsonProperty("item_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String itemName;

    private LocalDateTime timestamp;
    @JsonProperty("co2_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double co2Val;

    @JsonProperty("temperature_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double temperatureVal;

    @JsonProperty("humidity_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double humidityVal;

    @JsonProperty("light_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double irVal;

    @JsonProperty("reading_timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime readingTimestamp;

    public static PagSensorReadingDto fromMap(Map<String, String> map) {
        String idStr = map.get("id");
        Long id = idStr == null ? null : Long.parseLong(idStr);

        String timestampStr = map.get("timestamp");
        LocalDateTime timestamp = timestampStr == null ? null : DateTimeUtil.getLocalDateTime(timestampStr);

        String readingTimestampStr = map.get("reading_timestamp");
        LocalDateTime readingTimestamp = readingTimestampStr == null ? null : DateTimeUtil.getLocalDateTime(readingTimestampStr);

        String co2ValStr = map.get("co2_val");
        Double co2Val = co2ValStr == null ? null : Double.parseDouble(co2ValStr);

        String temperatureValStr = map.get("temperature_val");
        Double temperatureVal = temperatureValStr == null ? null : Double.parseDouble(temperatureValStr);

        String humidityValStr = map.get("humidity_val");
        Double humidityVal = humidityValStr == null ? null : Double.parseDouble(humidityValStr);

        String irValStr = map.get("light_val");
        Double irVal = irValStr == null ? null : Double.parseDouble(irValStr);

        return PagSensorReadingDto.builder()
                .id(id)
                .itemSn(map.get("item_sn"))
                .itemName(map.get("item_name"))
                .timestamp(timestamp)
                .co2Val(co2Val)
                .temperatureVal(temperatureVal)
                .humidityVal(humidityVal)
                .irVal(irVal)
                .readingTimestamp(readingTimestamp)
                .build();
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();

        map.put("id", id);
        map.put("item_sn", itemSn);
        map.put("item_name", itemName);
        map.put("timestamp", timestamp);
        map.put("co2_val", co2Val);
        map.put("temperature_val", temperatureVal);
        map.put("humidity_val", humidityVal);
        map.put("ir_val", irVal);
        map.put("reading_timestamp", readingTimestamp);

        return map;
    }

    public Map<String, Object> getInsertQuery(String tableName) {
        Map<String, Object> instertMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : toMap().entrySet()) {
            if (entry.getValue() != null) {
                instertMap.put(entry.getKey(), entry.getValue());
            }
        }

        Map<String, Object> insertQueryMap = new HashMap<>();
        insertQueryMap.put("table", tableName);
        insertQueryMap.put("content", instertMap);
        Map<String, String> insertQueryResult = SqlUtil.makeInsertSql(insertQueryMap);

        if (insertQueryResult.get("error") != null) {
            return Map.of("error", insertQueryResult.get("error"));
        }

        return Map.of("sql", insertQueryResult.get("sql"));
    }
}
