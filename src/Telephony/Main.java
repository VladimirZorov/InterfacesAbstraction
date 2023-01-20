package Telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = new ArrayList<>();
        List<String> urls = new ArrayList<>();

        numbers = Arrays.stream(scanner.nextLine().split("\\S+")).toList();
        urls = Arrays.stream(scanner.nextLine().split("\\S+")).toList();

        Smartphone smartphone = new Smartphone(numbers, urls);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
