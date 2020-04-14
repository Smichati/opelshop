package me.opelshop;

import java.util.Scanner;

class OpelModels {
    public static final String opel1 = "Opel Astra";
    public static final String opel2 = "Opel Corsa";
    public static final String opel3 = "Opel Vectra";
    public static final String opel4 = "Opel Mokka";
    public static final String opel5 = "Opel Zafira";
    public static final String opel6 = "Opel Insignia";
}

public class MainClass extends OpelModels {
    public static void main(String[] args) {
        System.out.println("Press ENTER to choose an Opel model which you want to purchase.");
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

            System.out.println("Choose one from the available Opel models:\n1. Opel Astra\n2. Opel Corsa\n3. Opel Vectra\n4. Opel Mokka\n5. Opel Zafira\n6. Opel Insignia ");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("You have purchased " + opel1);
                    break;
                case 2:
                    System.out.println("You have purchased " + opel2);
                    break;
                case 3:
                    System.out.println("You have purchased " + opel3);
                    break;
                case 4:
                    System.out.println("You have purchased " + opel4);
                    break;
                case 5:
                    System.out.println("You have purchased " + opel5);
                    break;
                case 6:
                    System.out.println("You have purchased " + opel6);
                    break;
            }




    }
}

