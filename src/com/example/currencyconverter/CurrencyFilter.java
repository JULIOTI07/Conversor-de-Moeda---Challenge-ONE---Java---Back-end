package com.example.currencyconverter;

import java.util.HashMap;
import java.util.Map;

public class CurrencyFilter {
    private static final String[] SUPPORTED_CURRENCIES = {"EUR", "GBP", "JPY", "AUD", "CAD", "CHF"};

    public static Map<String, Double> filterRates(Map<String, Double> rates) {
        Map<String, Double> filteredRates = new HashMap<>();
        for (String currency : SUPPORTED_CURRENCIES) {
            if (rates.containsKey(currency)) {
                filteredRates.put(currency, rates.get(currency));
            }
        }
        return filteredRates;
    }

    public static String[] getSupportedCurrencies() {
        return SUPPORTED_CURRENCIES;
    }
}
