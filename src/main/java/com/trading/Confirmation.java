package com.trading;

import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.math.BigDecimal;

public class Confirmation implements Serializable {

    public static final String EMAIL = "EMAIL";
    public static final String SWIFT = "SWIFT";

    private byte[] content;
    private String confirmationType;
    private String allocationId;
    private String securityId;
    private String tradeSide;
    private String tradeDate;
    private int quantity;
    private String counterpartyId;
    private String counterpartyName;
    private String executingPartyId;
    private String executingPartyName;
    private String micCode;
    private String country;
    private String countryCode;
    private String exchangeName;

    priv