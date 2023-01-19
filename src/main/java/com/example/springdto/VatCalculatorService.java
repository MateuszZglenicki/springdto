package com.example.springdto;

import org.springframework.stereotype.Service;

@Service
class VatCalculatorService {
    double calculateBruttoPrice(double nettoPrice, String category) {
        return nettoPrice + calculateVat(nettoPrice, category);
    }

    double calculateVat(double nettoPrice, String category) {
        double vatRate = switch (category) {
            case "service" -> 0.23;
            case "food" -> 0.05;
            default -> 0.15;
        };
        return nettoPrice * vatRate;
    }
}
