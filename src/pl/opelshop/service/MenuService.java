package pl.opelshop.service;

import pl.opelshop.dto.CarDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuService {

    CarOperationsService carOperationsService = new CarOperationsService();
    Scanner scanner = new Scanner(System.in);
    List<CarDto> carlist = new ArrayList<>();

    public void showMainMenu() {
        System.out.println("Welcome to the car shop! You can purchase here cars which you want.\n");
        System.out.println("Select option.");
        System.out.println("1. Add car.");
        System.out.println("2. Show all the cars.");
        System.out.println("3. Show the amount of the cars.");
        System.out.println("4. Show the combined price of the cars.");
        System.out.println("5. Show how much car would burn on the chosen distance.");
        choiceSelector(scanner.nextInt());
        showMainMenu();
    }

    private void choiceSelector(int choiceNumber) {
        switch (choiceNumber) {
            case 1:
                carlist.add(carOperationsService.addCar());
                break;
            case 2:
                carlist.stream()
                        .forEach(carDtoInternal -> System.out.println(carDtoInternal.toString()));
                break;
            case 3:
                System.out.println("The amount of cars equals: " + carlist.size());
                break;
            case 4:
                System.out.println("The combined price of cars equals: ");
                break;
            case 5:
                showBurningMenu();
                break;
            default:
                System.out.println("Mistake!");
                break;
        }
    }

    public void showBurningMenu() {
        System.out.println("Select option.");
        System.out.println("1. Check how much gas you will burn on chosen distance.");
        System.out.println("2. Return button.");
        int choice = scanner.nextInt();
        do {
            selectBurningOption(choice);
        } while (choice == 1 || choice >= 3 || choice <= 0);
    }

    private void selectBurningOption(int choice) {

        switch (choice) {
            case 1:
                carOperationsService.getAverageBurning(carlist);
                showMainMenu();
                break;
            case 2:
                System.out.println("Return.");
                break;
            default:
                System.out.println("Mistake!");
                break;
        }
    }
}

