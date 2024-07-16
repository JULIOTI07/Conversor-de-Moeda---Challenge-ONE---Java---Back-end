package com.example.currencyconverter;

import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;

public class CurrencyConverter {
    public static void main(String[] args) {
        try {
            String jsonResponse = ApiService.getApiResponse();
            Gson gson = new Gson();
            ApiResponse apiResponse = gson.fromJson(jsonResponse, ApiResponse.class);

            Map<String, Double> filteredRates = CurrencyFilter.filterRates(apiResponse.conversion_rates);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bem-vindo ao Conversor de Moedas!");
            System.out.println("Escolha uma opção de conversão:");
            String[] supportedCurrencies = CurrencyFilter.getSupportedCurrencies();
            for (int i = 0; i < supportedCurrencies.length; i++) {
                System.out.println((i + 1) + ". USD para " + supportedCurrencies[i]);
            }
            int choice = scanner.nextInt();

            if (choice < 1 || choice > supportedCurrencies.length) {
                System.out.println("Opção inválida.");
            } else {
                String targetCurrency = supportedCurrencies[choice - 1];
                System.out.print("Digite o valor em USD: ");
                double amount = scanner.nextDouble();
                double convertedAmount = amount * filteredRates.get(targetCurrency);
                System.out.printf("%.2f USD é igual a %.2f %s%n", amount, convertedAmount, targetCurrency);
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

