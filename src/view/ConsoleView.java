package view;

import java.util.Scanner;

public class ConsoleView {
    private static Scanner scanner = new Scanner(System.in);
    public static void start() {
        while (true) {
            String command = scanner.nextLine().trim();
            if (ConsoleCommands.Exit.getStringMatcher(command).matches()) {
                break;
            } else if(ConsoleCommands.ADD_GOOD.getStringMatcher(command).matches()){

            } else if (ConsoleCommands.NEW_ORDER.getStringMatcher(command).matches()) {

            } else if (ConsoleCommands.GOODS_LIST.getStringMatcher(command).matches()) {

            } else if (ConsoleCommands.TOTAL_SALES.getStringMatcher(command).matches()) {

            } else if (ConsoleCommands.TOTAL_PROFIT.getStringMatcher(command).matches()) {

            } else {
                System.out.println("Invalid Command");
            }
        }

    }
}
