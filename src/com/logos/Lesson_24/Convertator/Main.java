package com.logos.Lesson_24.Convertator;

import java.io.IOException;
import java.util.*;

public class Main {
    public static final String url = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";

    private static List<Exchange> exchanges;

    public static void main(String[] args) {

        ExchangeService exchangeService = new ExchangeService(url);
        try {
            exchanges = Arrays.asList(exchangeService.sentGetRequest());
            calculator();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void calculator(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1 - conservator 0 - exit");
            int selectedItem = scanner.nextInt();

            if(selectedItem != 1){
                break;
            }

            System.out.println("Enter currencies");
            String selectedCurrency = scanner.next();

            if(selectedCurrency.equals("RUB")){
                throw new RuntimeException("Fuck You");
            }

            double rate = getExchangeRate(selectedCurrency);

            if(rate == 0.0){
                System.out.println(selectedCurrency + " Not exist!");
                continue;
            }

            System.out.println("Enter amount in " + selectedCurrency);
            double amount = scanner.nextDouble();

            double result = amount * rate;
            System.out.println(amount + " " + selectedCurrency + " = " + result + " UAN");
        }
    }

    public static double getExchangeRate(String selectedCurrency){
        Optional<Exchange> first = exchanges
                .stream()
                .filter(exchange -> exchange.cc.equals(selectedCurrency))
                .findFirst();
        return first.map(exchange -> exchange.rate).orElse(0.0);
    }

}
