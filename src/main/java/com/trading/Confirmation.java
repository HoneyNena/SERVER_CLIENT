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

    private String exchangeAcronym;
    private String exchangeCity;
    private String instrumentSymbol;
    private String instrumentName;
    private String instrumentCurrency;
    private String instrumentExchange;
    private BigDecimal price;
    private BigDecimal instrumentPrice;

    public String getInstrumentSymbol() {
        return instrumentSymbol;
    }

    public void setInstrumentSymbol(String instrumentSymbol) {
        this.instrumentSymbol = instrumentSymbol;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInstrumentCurrency() {
        return instrumentCurrency;
    }

    public void setInstrumentCurrency(String instrumentCurrency) {
        this.instrumentCurrency = instrumentCurrency;
    }

    public String getInstrumentExchange() {
        return instrumentExchange;
    }

    public void setInstrumentExchange(String instrumentExchange) {
        this.instrumentExchange = instrumentExchange;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getExchangeAcronym() {
        return exchangeAcronym;
    }

    public void setExchangeAcronym(String exchangeAcronym) {
        this.exchangeAcronym = exchangeAcronym;
    }

    public String getExchangeCity() {
        return exchangeCity;
    }

    public void setExchangeCity(String exchangeCity) {
        this.exchangeCity = exchangeCity;
    }

    public String getAllocationId() {
        return allocationId;
    }

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    public String getSecurityId() {
        return securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public String getTradeSide() {
        return tradeSide;
    }

    public void setTradeSide(String tradeSide) {
        this.tradeSide = tradeSide;
    }

    public String getTradeDate() {
        retu