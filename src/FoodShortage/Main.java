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

        boolean citizenNameNotUsed = true;
        boolean rebelNameNotUsed = true;

        int totalFood = 0;

        for (int i = 0; i < numOfPeople; i++) {
            String [] input = scanner.nextLine().split(" ");
            switch (input.length) {
                case 4:
                    String nameCitizen = input[0];
                    int ageCitizen = Integer.parseInt(input[1]);
                    String idCitizen = input[2];
                    String birthDateCitizen = input[3];
                    Citizen citizen = new Citizen(nameCitizen,ageCitizen,idCitizen,birthDateCitizen);
                    for (Citizen citizen1 : citizens){
                        if (!citizen1.getName().equals(nameCitizen)){
                            citizenNameNotUsed = true;
                        }
                    }
                    for (Rebel rebel : rebels) {
                        if (!rebel.getName().equals(nameCitizen)) {
                            rebelNameNotUsed = true;
                        }
                    }
                    if (citizenNameNotUsed && rebelNameNotUsed) {
                        citizens.add(citizen);
                    }
                    break;
                case 3:
                    String nameRebel = input[0];
                    int ageRebel = Integer.parseInt(input[1]);
                    String groupRebel = input[2];
                    Rebel rebel = new Rebel(nameRebel, ageRebel, groupRebel);
                    for (Citizen citizen1 : citizens){
                        if (!citizen1.getName().equals(nameRebel)){
                            citizenNameNotUsed = true;
                        }
                    }
                    for (Rebel rebel1 : rebels) {
                        if (!rebel1.getName().equals(nameRebel)) {
                            rebelNameNotUsed = true;
                        }
                    }
                    if (citizenNameNotUsed && rebelNameNotUsed) {
                        rebels.add(rebel);
                    }
                    break;
            }
        }
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            for (Citizen citizen : citizens) {
                if (citizen.getName().equals(input)) {
             citizen.buyFood();
                }
            }
            for (Rebel rebel : rebels) {
                if (rebel.getName().equals(input)) {
                    rebel.buyFood();
                }
            }
            input = scanner.nextLine();
        }
        for (Citizen citizen : citizens) {
          totalFood +=  citizen.getFood();
        }
        for (Rebel rebel : rebels) {
            totalFood += rebel.getFood();
        }


        System.out.println(totalFood);
    }
}
