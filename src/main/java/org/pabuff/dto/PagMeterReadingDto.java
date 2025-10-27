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
public class PagMeterReadingDto {
    private Long id;

    @JsonProperty("meter_sn")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String meterSn;

    @JsonProperty("timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime timestamp;

    @JsonProperty("reading_timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime readingTimestamp;

    @JsonProperty("v_a")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vAValue;

    @JsonProperty("v_b")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vBValue;

    @JsonProperty("v_c")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vCValue;

    @JsonProperty("v_avg")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vAvgValue;

    @JsonProperty("v_ab")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vABValue;

    @JsonProperty("v_bc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vBCValue;

    @JsonProperty("v_ca")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vCAValue;

    @JsonProperty("v_l_avg")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vLAvgValue;

    @JsonProperty("i_a")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double iAValue;

    @JsonProperty("i_b")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double iBValue;

    @JsonProperty("i_c")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double iCValue;

    @JsonProperty("i_avg")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double iAvgValue;

    @JsonProperty("frequency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double frequency;

    @JsonProperty("pf_a")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double pfAValue;

    @JsonProperty("pf_b")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double pfBValue;

    @JsonProperty("pf_c")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double pfCValue;

    @JsonProperty("pf_total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double pfTotalValue;

    @JsonProperty("va_a")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vaAValue;

    @JsonProperty("va_b")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vaBValue;

    @JsonProperty("va_c")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vaCValue;

    @JsonProperty("va_total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double vaTotalValue;

    @JsonProperty("var_a")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double varAValue;

    @JsonProperty("var_b")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double varBValue;

    @JsonProperty("var_c")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double varCValue;

    @JsonProperty("var_total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double varTotalValue;

    @JsonProperty("w_a")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double wAValue;

    @JsonProperty("w_b")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double wBValue;

    @JsonProperty("w_c")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double wCValue;

    @JsonProperty("w_total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double wTotalValue;

    @JsonProperty("kwh")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double kwhValue;

    @JsonProperty("kvarh")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double kvarhValue;

    public static PagMeterReadingDto fromMap(Map<String, String> map) {
        String idStr = map.get("id");
        Long id = idStr == null ? null : Long.parseLong(idStr);

        String timestampStr = map.get("timestamp");
        LocalDateTime timestamp = timestampStr == null ? null : DateTimeUtil.getLocalDateTime(timestampStr);

        String readingTimestampStr = map.get("reading_timestamp");
        LocalDateTime readingTimestamp = readingTimestampStr == null ? null : DateTimeUtil.getLocalDateTime(readingTimestampStr);

        Double vAValue = map.get("v_a") == null ? null : Double.parseDouble(map.get("v_a"));
        Double vBValue = map.get("v_b") == null ? null : Double.parseDouble(map.get("v_b"));
        Double vCValue = map.get("v_c") == null ? null : Double.parseDouble(map.get("v_c"));
        Double vAvgValue = map.get("v_avg") == null ? null : Double.parseDouble(map.get("v_avg"));
        Double vABValue = map.get("v_ab") == null ? null : Double.parseDouble(map.get("v_ab"));
        Double vBCValue = map.get("v_bc") == null ? null : Double.parseDouble(map.get("v_bc"));
        Double vCAValue = map.get("v_ca") == null ? null : Double.parseDouble(map.get("v_ca"));
        Double vLAvgValue = map.get("v_l_avg") == null ? null : Double.parseDouble(map.get("v_l_avg"));
        Double iAValue = map.get("i_a") == null ? null : Double.parseDouble(map.get("i_a"));
        Double iBValue = map.get("i_b") == null ? null : Double.parseDouble(map.get("i_b"));
        Double iCValue = map.get("i_c") == null ? null : Double.parseDouble(map.get("i_c"));
        Double iAvgValue = map.get("i_avg") == null ? null : Double.parseDouble(map.get("i_avg"));
        Double frequency = map.get("frequency") == null ? null : Double.parseDouble(map.get("frequency"));
        Double pfAValue = map.get("pf_a") == null ? null : Double.parseDouble(map.get("pf_a"));
        Double pfBValue = map.get("pf_b") == null ? null : Double.parseDouble(map.get("pf_b"));
        Double pfCValue = map.get("pf_c") == null ? null : Double.parseDouble(map.get("pf_c"));
        Double pfTotalValue = map.get("pf_total") == null ? null : Double.parseDouble(map.get("pf_total"));
        Double vaAValue = map.get("va_a") == null ? null : Double.parseDouble(map.get("va_a"));
        Double vaBValue = map.get("va_b") == null ? null : Double.parseDouble(map.get("va_b"));
        Double vaCValue = map.get("va_c") == null ? null : Double.parseDouble(map.get("va_c"));
        Double vaTotalValue = map.get("va_total") == null ? null : Double.parseDouble(map.get("va_total"));
        Double varAValue = map.get("var_a") == null ? null : Double.parseDouble(map.get("var_a"));
        Double varBValue = map.get("var_b") == null ? null : Double.parseDouble(map.get("var_b"));
        Double varCValue = map.get("var_c") == null ? null : Double.parseDouble(map.get("var_c"));
        Double varTotalValue = map.get("var_total") == null ? null : Double.parseDouble(map.get("var_total"));
        Double wAValue = map.get("w_a") == null ? null : Double.parseDouble(map.get("w_a"));
        Double wBValue = map.get("w_b") == null ? null : Double.parseDouble(map.get("w_b"));
        Double wCValue = map.get("w_c") == null ? null : Double.parseDouble(map.get("w_c"));
        Double wTotalValue = map.get("w_total") == null ? null : Double.parseDouble(map.get("w_total"));
        Double kwhValue = map.get("kwh") == null ? null : Double.parseDouble(map.get("kwh"));
        Double kvarhValue = map.get("kvarh") == null ? null : Double.parseDouble(map.get("kvarh"));

        return PagMeterReadingDto.builder()
                .id(id)
                .meterSn(map.get("meter_sn"))
                .readingTimestamp(readingTimestamp)
                .vAValue(vAValue)
                .vBValue(vBValue)
                .vCValue(vCValue)
                .vAvgValue(vAvgValue)
                .vABValue(vABValue)
                .vBCValue(vBCValue)
                .vCAValue(vCAValue)
                .vLAvgValue(vLAvgValue)
                .iAValue(iAValue)
                .iBValue(iBValue)
                .iCValue(iCValue)
                .iAvgValue(iAvgValue)
                .frequency(frequency)
                .pfAValue(pfAValue)
                .pfBValue(pfBValue)
                .pfCValue(pfCValue)
                .pfTotalValue(pfTotalValue)
                .vaAValue(vaAValue)
                .vaBValue(vaBValue)
                .vaCValue(vaCValue)
                .vaTotalValue(vaTotalValue)
                .varAValue(varAValue)
                .varBValue(varBValue)
                .varCValue(varCValue)
                .varTotalValue(varTotalValue)
                .wAValue(wAValue)
                .wBValue(wBValue)
                .wCValue(wCValue)
                .wTotalValue(wTotalValue)
                .kwhValue(kwhValue)
                .kvarhValue(kvarhValue)
                .build();
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();

        map.put("id", id);
        map.put("meter_sn", meterSn);
        map.put("timestamp", timestamp);
        map.put("reading_timestamp", readingTimestamp);
        map.put("v_a", vAValue);
        map.put("v_b", vBValue);
        map.put("v_c", vCValue);
        map.put("v_avg", vAvgValue);
        map.put("v_ab", vABValue);
        map.put("v_bc", vBCValue);
        map.put("v_ca", vCAValue);
        map.put("v_l_avg", vLAvgValue);
        map.put("i_a", iAValue);
        map.put("i_b", iBValue);
        map.put("i_c", iCValue);
        map.put("i_avg", iAvgValue);
        map.put("frequency", frequency);
        map.put("pf_a", pfAValue);
        map.put("pf_b", pfBValue);
        map.put("pf_c", pfCValue);
        map.put("pf_total", pfTotalValue);
        map.put("va_a", vaAValue);
        map.put("va_b", vaBValue);
        map.put("va_c", vaCValue);
        map.put("va_total", vaTotalValue);
        map.put("var_a", varAValue);
        map.put("var_b", varBValue);
        map.put("var_c", varCValue);
        map.put("var_total", varTotalValue);
        map.put("w_a", wAValue);
        map.put("w_b", wBValue);
        map.put("w_c", wCValue);
        map.put("w_total", wTotalValue);
        map.put("kwh", kwhValue);
        map.put("kvarh", kvarhValue);

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
