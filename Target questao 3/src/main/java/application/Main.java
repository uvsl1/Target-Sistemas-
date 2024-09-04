package application;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.DailyBilling;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File jsonFile = new File("dados.json");
            List<DailyBilling> dailyBillings = objectMapper.readValue(jsonFile, new TypeReference<List<DailyBilling>>() {
            });

            calculateBilling(dailyBillings);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void calculateBilling(List<DailyBilling> dailyBillings) {
        double lowestValue = Double.MAX_VALUE;
        double highestValue = Double.MIN_VALUE;
        double total = 0;
        int daysWithBilling = 0;

        int lowestDay = 0;
        int highestDay = 0;

        for (DailyBilling billing : dailyBillings) {
            if (billing.getValor() > 0) {
                if (billing.getValor() < lowestValue) {
                    lowestValue = billing.getValor();
                    lowestDay = billing.getDia();
                }
                if (billing.getValor() > highestValue) {
                    highestValue = billing.getValor();
                    highestDay = billing.getDia();
                }
                total += billing.getValor();
                daysWithBilling++;
            }
        }

        double average = total / daysWithBilling;
        int daysAboveAverage = 0;

        for (DailyBilling billing : dailyBillings) {
            if (billing.getValor() > average) {
                daysAboveAverage++;
            }
        }

        System.out.println("Menor faturamento: dia " + lowestDay + " " + lowestValue);
        System.out.println("Maior faturamento: dia " + highestDay + " " + highestValue);
        System.out.println("Dias acima do faturamento médio: " + daysAboveAverage);
    }
}
