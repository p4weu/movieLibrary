package tools;

import models.Actor;

import java.util.Scanner;

public class UserInputHandler {

    static Scanner scanner = new Scanner(System.in);

    public static MenuOptions getMenuOptionFromUser() {
        return MenuOptions.values()[getSelectedOptionFromUser()-1];
    }

    private static int getSelectedOptionFromUser() {
        int result = getIntegerFromUser();
        scanner.nextLine();
        if (result > 0 && result < 4) {
            return result;
        } else {
            System.out.println("You selected wrong option. Please try again :)");
            return getSelectedOptionFromUser();
        }
    }

    private static int getIntegerFromUser() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("It is not integer number, try again!");
        }
        return scanner.nextInt();
    }

    public static Actor getActorFromUser() {
        System.out.println("Type an actor: ");
        String[] actors = scanner.nextLine().split(" ");
        return new Actor(actors[0], actors[1]);

    }
}
