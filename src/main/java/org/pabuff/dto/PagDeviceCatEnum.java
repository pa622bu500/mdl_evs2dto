package org.pabuff.dto;

public enum PagDeviceCatEnum {
    METER("meter", "meter", "m"),
    SENSOR("sensor", "Sensor", "s"),
    CAMERA("camera", "Camera", "cam"),
    LOCK("lock", "Lock", "l"),
    GATEWAY("gateway", "Gateway", "gw"),
    METER_GROUP("meter_group", "Meter Group", "mg"),
    MCU("mcu", "MCU", "mcu");

    private final String value;
    private final String label;
    private final String tag;

    // Constructor
    PagDeviceCatEnum(String value, String label, String tag) {
        this.value = value;
        this.label = label;
        this.tag = tag;
    }

    // Getters
    public String getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public String getTag() {
        return tag;
    }

    // Reverse lookup by value
    public static PagDeviceCatEnum fromValue(String value) {
        for (PagDeviceCatEnum status : PagDeviceCatEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagDeviceCatEnum fromTag(String tag) {
        for (PagDeviceCatEnum status : PagDeviceCatEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagDeviceCatEnum fromLabel(String label) {
        for (PagDeviceCatEnum status : PagDeviceCatEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}
