package cz.josefdebnar.sta;

import java.util.Scanner;

public class Input {

    Scanner input = new Scanner(System.in);

    public int intInput() {
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                System.out.println("Zadejte prosím celé číslo!");
                input.next();
            }
        }

        return -1;
    }

    public int intInputInRange(int min, int max) {
        int val;

        while (!((val = intInput()) <= max && val >= min)) {
            System.out.println("Zadejte prosím celé číslo v intervalu <" + min + ";" + max + ">!");
        }

        return val;
    }

}
