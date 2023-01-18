package BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Citizen> citizens = new ArrayList<>();
        List<Pet> pets = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String [] tokens = input.split(" ");
            String type = tokens[0];
            switch (type) {
                case "Citizen":
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthDate = tokens[4];
                    Citizen citizen = new Citizen(name,age,id,birthDate);
                    citizens.add(citizen);
                    break;
                case "Pet":
                    String namePet = tokens[1];
                    String birthDatePet = tokens[2];
                    Pet pet = new Pet(namePet, birthDatePet);
                    pets.add(pet);
                    break;
                case "Robot":
                    break;
            }
            input = scanner.nextLine();
        }
        String year = scanner.nextLine();

        for(Citizen citizen : citizens) {
            if (citizen.getBirthDate().endsWith(year)){
                System.out.println(citizen.getBirthDate());
            }
        }
        for (Pet pet : pets) {
            if (pet.getBirthDate().endsWith(year)) {
                System.out.println(pet.getBirthDate());
            }
        }
    }


}
