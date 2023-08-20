package com.pabu5h.evs2.dto;

import java.util.Map;

public class TransactionDef {
    public final static Map<Integer, String> transactionStatus =
            Map.of(
                    0, "Pending",
                    1, "Abort",
                    2, "No",
                    3, "Yes",
                    4, "N/A");
    public final static Map<Integer, String> paymentMode =
            Map.of(
                    0, "Credit Card",
                    1, "eNETS",
                    4, "Virtual",
                    5, "Credit Card",
                    6, "Credit Card",
                    11, "NETS Online QR",
                    12, "eNETS Credit/Debit",
                    21, "Stripe Card");

    public final static Map<Integer, String> paymentChannel =
            Map.of(
                    1, "EVS Ops Portal",
                    4, "POS AXS",
                    101,"EVS2 Ops Portal",
                    102,"EVS2 Consumer Portal");
}
