package com.epam.ta.framework.ui.application.enums;

import java.math.BigDecimal;

public enum Currency {
    USD("USD", "US Dollar", new BigDecimal(13)),
    KZT("KZT", "Kazakhstan Tenge", new BigDecimal(102));

    private String shortCurrencyName;
    private String longCurrencyName;
    private BigDecimal id;

    Currency(String shortCurrencyName, String longCurrencyName, BigDecimal id) {
        this.shortCurrencyName = shortCurrencyName;
        this.longCurrencyName = longCurrencyName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "shortCurrencyName='" + shortCurrencyName + '\'' +
                ", longCurrencyName='" + longCurrencyName + '\'' +
                ", id=" + id +
                '}';
    }
}
