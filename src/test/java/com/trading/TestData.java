package com.trading;

import java.math.BigDecimal;

class TestData {

    static Confirmation confirmation(String allocationId) {
        return confirmation(allocationId, "BUY");
    }

    static Confirmati