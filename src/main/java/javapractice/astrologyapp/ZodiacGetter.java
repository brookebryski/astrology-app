package javapractice.astrologyapp;

import java.util.Scanner;

public class ZodiacGetter implements IZodiacGetter {
    public String getInput() {
        System.out.println("Please tell us your zodiac sign.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
