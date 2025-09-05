package org.pabuff.dto;

public enum PagPortalStatusEnum {
    NORMAL("normal", "Normal", "norm"),
    MAINTENANCE("maint", "Maintenance", "maint");

    private final String value;
    private final String label;
    private final String tag;

    // Constructor
    PagPortalStatusEnum(String value, String label, String tag) {
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
    public static PagPortalStatusEnum fromValue(String value) {
        for (PagPortalStatusEnum status : PagPortalStatusEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagPortalStatusEnum fromTag(String tag) {
        for (PagPortalStatusEnum status : PagPortalStatusEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagPortalStatusEnum fromLabel(String label) {
        for (PagPortalStatusEnum status : PagPortalStatusEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}
