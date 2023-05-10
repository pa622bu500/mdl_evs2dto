package com.pabu5h.evs2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Builder
public class PremiseDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String unit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String level;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String block;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String building;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("postal_code")
    private String postalCode;

    //use builder
//    public PremiseDto(Map<String, Object> fieldMap){
//        fromFieldMap(fieldMap);
//    }
//    public PremiseDto fromFieldMap(Map<String, Object> fieldMap){
//        this.unit = (String) fieldMap.get("unit");
//        this.level = (String) fieldMap.get("level");
//        this.block = (String) fieldMap.get("block");
//        this.building = (String) fieldMap.get("building");
//        this.postalCode = (String) fieldMap.get("postal_code");
//        return this;
//    }

    public Map<String, Object> toFieldMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("unit", unit);
        map.put("level", level);
        map.put("block", block);
        map.put("building", building);
        map.put("postal_code", postalCode);
        return map;
    }

    public String genAddress(String separator){
        StringBuilder sb = new StringBuilder();
        if (unit != null) {
            sb.append(unit).append(separator);
        }
        if (level != null) {
            sb.append(level).append(separator);
        }
        if (block != null) {
            sb.append(block).append(separator);
        }
        if (building != null) {
            sb.append(building).append(separator);
        }
        if (postalCode != null) {
            sb.append(postalCode);
        }else {
            if(sb.length() >= separator.length()) {
                sb.deleteCharAt(sb.length() - separator.length());
            }
        }
        return sb.toString();
    }
}
