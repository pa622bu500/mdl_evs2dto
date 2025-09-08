package org.pabuff.dto;

public enum PaymentLcStatusEnum {
    POSTED("posted", "Posted", "pt"),
    MATCHED("matched", "Matched", "mt"),
    RELEASED("released", "Released", "rl"),
    MARKED_FOR_DELETE("mfd", "Marked for Delete", "mfd");

    private final String value;
    private final String label;
    private final String tag;

    // Constructor
    PaymentLcStatusEnum(String value, String label, String tag) {
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
    public static PaymentLcStatusEnum fromValue(String value) {
        for (PaymentLcStatusEnum status : PaymentLcStatusEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PaymentLcStatusEnum fromTag(String tag) {
        for (PaymentLcStatusEnum status : PaymentLcStatusEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PaymentLcStatusEnum fromLabel(String label) {
        for (PaymentLcStatusEnum status : PaymentLcStatusEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}
