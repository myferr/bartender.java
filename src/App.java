import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("How old are you?!");
        int age = ageScanner.nextInt();
        if (age > 18 | age == 18) {
            int drunkLevel = 0;
            int isDrunk = 0;
            while (isDrunk == 0) {
                Scanner drinkScanner = new Scanner(System.in);
                System.out.println("[Bartender]: What'd you like for a drink?");
                String drink = drinkScanner.nextLine();
                System.out.println("[Bartender]: Excellent choice!");
                System.out.println("*You've been served a " + drink + "*");
                if (drunkLevel == 3) {
                    System.out.println("[Bartender]: You're drunk, go home.");
                    System.out.println("*You've been kicked out.*");
                    isDrunk = 1;
                } else if (drunkLevel < 3) {
                    drunkLevel++;
                    System.out.println("*Current drunk level: " + drunkLevel + "*");
                }
            }
        } else if (age < 18) {
            System.out.println("[Bartender]: You're not old enough to be in here!");
            System.out.println("*You've been kicked out.*");
        }
    }
}