package org.pabuff.dto;

public enum PagFinanceTypeEnum {
    tenantSoa("tenant_soa", "Tenant SoA", "tsoa"),
    payment("payment", "Payment", "pmt"),
    paymentApply("payment_apply", "Payment Apply", "pa"),;

    private final String value;
    private final String label;
    private final String tag;

    PagFinanceTypeEnum(String value, String label, String tag) {
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
    public static PagFinanceTypeEnum fromValue(String value) {
        for (PagFinanceTypeEnum status : PagFinanceTypeEnum.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown value: " + value);
    }

    public static PagFinanceTypeEnum fromTag(String tag) {
        for (PagFinanceTypeEnum status : PagFinanceTypeEnum.values()) {
            if (status.tag.equalsIgnoreCase(tag)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown tag: " + tag);
    }

    public static PagFinanceTypeEnum fromLabel(String label) {
        for (PagFinanceTypeEnum status : PagFinanceTypeEnum.values()) {
            if (status.label.equalsIgnoreCase(label)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown label: " + label);
    }
}