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
public class PagSensorMeterReadingDto {
    private Long id;

    @JsonProperty("item_sn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String itemSn;

    @JsonProperty("item_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String itemName;

    @JsonProperty("timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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

    @JsonProperty("val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double kwhVal;

    @JsonProperty("vln_a_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vlnAValue;

    @JsonProperty("vln_b_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vlnBValue;

    @JsonProperty("vln_c_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vlnCValue;

    @JsonProperty("vln_avg_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vlnAvgValue;

    @JsonProperty("vll_ab_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vllAbValue;

    @JsonProperty("vll_bc_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vllBcValue;

    @JsonProperty("vll_ca_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vllCaValue;

    @JsonProperty("vll_avg_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vllAvgValue;

    @JsonProperty("i_a_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double iaValue;

    @JsonProperty("i_b_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double ibValue;

    @JsonProperty("i_c_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double icValue;

    @JsonProperty("i_avg_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double iAvgValue;

    @JsonProperty("toggle_switch_status_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean toggleSwitchStatus;

    @JsonProperty("local_mode_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean localMode;

    @JsonProperty("fan_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean fan;

    @JsonProperty("remote_mode_val")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean remoteMode;


    public static PagSensorMeterReadingDto fromMap(Map<String, String> map) {
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

        String kwhValStr = map.get("val");
        Double kwhVal = kwhValStr == null ? null : Double.parseDouble(kwhValStr);

        String vlnAValueStr = map.get("vln_a_val");
        Double vlnAValue = vlnAValueStr == null ? null : Double.parseDouble(vlnAValueStr);
        String vlnBValueStr = map.get("vln_b_val");
        Double vlnBValue = vlnBValueStr == null ? null : Double.parseDouble(vlnBValueStr);
        String vlnCValueStr = map.get("vln_c_val");
        Double vlnCValue = vlnCValueStr == null ? null : Double.parseDouble(vlnCValueStr);
        String vlnAvgValueStr = map.get("vln_avg_val");
        Double vlnAvgValue = vlnAvgValueStr == null ? null : Double.parseDouble(vlnAvgValueStr);
        String vllAbValueStr = map.get("vll_ab_val");
        Double vllAbValue = vllAbValueStr == null ? null : Double.parseDouble(vllAbValueStr);
        String vllBcValueStr = map.get("vll_bc_val");
        Double vllBcValue = vllBcValueStr == null ? null : Double.parseDouble(vllBcValueStr);
        String vllCaValueStr = map.get("vll_ca_val");
        Double vllCaValue = vllCaValueStr == null ? null : Double.parseDouble(vllCaValueStr);
        String vllAvgValueStr = map.get("vll_avg_val");
        Double vllAvgValue = vllAvgValueStr == null ? null : Double.parseDouble(vllAvgValueStr);
        String iaValueStr = map.get("i_a_val");
        Double iaValue = iaValueStr == null ? null : Double.parseDouble(iaValueStr);
        String ibValueStr = map.get("i_b_val");
        Double ibValue = ibValueStr == null ? null : Double.parseDouble(ibValueStr);
        String icValueStr = map.get("i_c_val");
        Double icValue = icValueStr == null ? null : Double.parseDouble(icValueStr);
        String iAvgValueStr = map.get("i_avg_val");
        Double iAvgValue = iAvgValueStr == null ? null : Double.parseDouble(iAvgValueStr);
        String toggleSwitchStatusStr = map.get("toggle_switch_status_val");
        Boolean toggleSwitchStatus = toggleSwitchStatusStr == null ? null : Boolean.parseBoolean(toggleSwitchStatusStr);
        String localModeStr = map.get("local_mode_val");
        Boolean localMode = localModeStr == null ? null : Boolean.parseBoolean(localModeStr);
        String fanStr = map.get("fan_val");
        Boolean fan = fanStr == null ? null : Boolean.parseBoolean(fanStr);
        String remoteModeStr = map.get("remote_mode_val");
        Boolean remoteMode = remoteModeStr == null ? null : Boolean.parseBoolean(remoteModeStr);

        return PagSensorMeterReadingDto.builder()
                .id(id)
                .itemSn(map.get("item_sn"))
                .itemName(map.get("item_name"))
                .timestamp(timestamp)
                .co2Val(co2Val)
                .temperatureVal(temperatureVal)
                .humidityVal(humidityVal)
                .irVal(irVal)
                .readingTimestamp(readingTimestamp)
                .kwhVal(kwhVal)
                .vlnAValue(vlnAValue)
                .vlnBValue(vlnBValue)
                .vlnCValue(vlnCValue)
                .vlnAvgValue(vlnAvgValue)
                .vllAbValue(vllAbValue)
                .vllBcValue(vllBcValue)
                .vllCaValue(vllCaValue)
                .vllAvgValue(vllAvgValue)
                .iaValue(iaValue)
                .ibValue(ibValue)
                .icValue(icValue)
                .iAvgValue(iAvgValue)
                .toggleSwitchStatus(toggleSwitchStatus)
                .localMode(localMode)
                .fan(fan)
                .remoteMode(remoteMode)
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
        map.put("val", kwhVal);
        map.put("vln_a_val", vlnAValue);
        map.put("vln_b_val", vlnBValue);
        map.put("vln_c_val", vlnCValue);
        map.put("vln_avg_val", vlnAvgValue);
        map.put("vll_ab_val", vllAbValue);
        map.put("vll_bc_val", vllBcValue);
        map.put("vll_ca_val", vllCaValue);
        map.put("vll_avg_val", vllAvgValue);
        map.put("i_a_val", iaValue);
        map.put("i_b_val", ibValue);
        map.put("i_c_val", icValue);
        map.put("i_avg_val", iAvgValue);
        map.put("toggle_switch_status_val", toggleSwitchStatus);
        map.put("local_mode_val", localMode);
        map.put("fan_val", fan);
        map.put("remote_mode_val", remoteMode);

        return map;
//        return Map.of(
//                "id", id,
//                "item_sn", itemSn,
//                "item_name", itemName,
//                "timestamp", timestamp,
//                "co2_val", co2Val,
//                "temperature_val", temperatureVal,
//                "humidity_val", humidityVal,
//                "light_val", irVal,
//                "reading_timestamp", readingTimestamp,
//                "val", kwhVal
//        );
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
