package Telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable{

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = new ArrayList<>();
        this.urls = new ArrayList<>();
    }

    @Override
    public String call() {
        String browse = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            if (isDigit(numbers.get(i))){
                sb.append("Invalid number!");
            } else {
                sb.append(numbers.get(i));
            }
            return browse;
        }
        return numbers.get(0);
    }

    @Override
    public String browse() {
        String call = null;
        for (int i = 0; i < urls.size(); i++) {
            if (urls.get(i).contains("y")) {
                call = "Invalid URL!";
            } else {
                call = urls.get(i);
            }
        }
        return String.format(call);
    }
    public boolean isDigit(String symbol) {
        if (Character.isDigit(symbol.charAt(1))){
            return true;
        }
        return false;
    }
}
