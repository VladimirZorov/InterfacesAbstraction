package FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());

        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();

        for (int i = 0; i < numOfPeople; i++) {
            String [] input = scanner.nextLine().split(" ");
            switch (input.length) {
                case 3:
                    String nameCitizen = input[0];
                    int ageCitizen = Integer.parseInt(input[1]);
                    String idCitizen = input[2];
                    String birthDateCitizen = input[3];
                    Citizen citizen = new Citizen(nameCitizen,ageCitizen,idCitizen,birthDateCitizen);
                    citizens.add(citizen);
                    break;
                case 4:
                    String nameRebel = input[0];
                    int ageRebel = Integer.parseInt(input[1]);
                    String groupRebel = input[2];
                    Rebel rebel = new Rebel(nameRebel, ageRebel, groupRebel);
                    rebels.add(rebel);
                    break;
            }
        }
    }
}
