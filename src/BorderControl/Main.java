package BorderControl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ArrayList<String> data = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            data.add(input);

            input = scanner.nextLine();
        }

        int fakeIdLastNumber = Integer.parseInt(scanner.nextLine());
    }

    


}
