package BorderControl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] data = new String[0];

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            data = input.split(" ");

            input = scanner.nextLine();
        }

        int fakeIdLastNumber = Integer.parseInt(scanner.nextLine());
    }
}
