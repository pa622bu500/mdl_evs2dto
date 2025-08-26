package org.pabuff.dto;

public enum BillLcStatusEnum {
    GENERATED("generated", "Generated", "gn"),
    PENDING_VERIFICATION("pv", "Pending Verification", "pv"),
    RELEASED("released", "Released", "rl"),
    MARKED_FOR_DELETE("mfd", "Marked for Delete", "mfd");

    private final String value;
    private final String label;
    private final String tag;

    // Constructor
    BillLcStatusEnum(String value, String label, String tag) {
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
    public static BillLcStatusEnum fromValue(String value) {
        for (BillLcStatusEnum status : BillLcStatusEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static BillLcStatusEnum fromTag(String tag) {
        for (BillLcStatusEnum status : BillLcStatusEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static BillLcStatusEnum fromLabel(String label) {
        for (BillLcStatusEnum status : BillLcStatusEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}
