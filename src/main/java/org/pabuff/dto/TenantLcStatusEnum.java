package org.pabuff.dto;

public enum TenantLcStatusEnum {
    ONBOARDING,
    OFFBOARDING,
    PENDING,
    NORMAL,
    ACTIVE, // This is an alias for NORMAL
    TERMINATED,
    MARKED_FOR_DELETE,
}
