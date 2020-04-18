package pl.opelshop.service;

import pl.opelshop.dto.CarDto;

import pl.opelshop.service.AvgBurning;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MenuService {

    AdminPanelService adminpanel = new AdminPanelService();
    Scanner scanner = new Scanner(System.in);
    List<CarDto> carlist = new ArrayList<>();

    AvgBurning avgburning;

    public MenuService() {
        avgburning = new AvgBurning();
    }

    public void showMenu() {
        System.out.println("Welcome to the car shop! You can purchase here cars which you want.\n");
        System.out.println("Select option.");
        System.out.println("1. Add car.");
        System.out.println("2. Show all the cars.");
        System.out.println("3. Show the amount of the cars.");
        System.out.println("4. Show the combined price of the cars.");
        System.out.println("5. Show how much car would burn on the chosen distance.");
        choiceSelector(scanner.nextInt());
        showMenu();
    }

    private void choiceSelector(int choiceNumber) {
        switch (choiceNumber) {
            case 1:
                carlist.add(adminpanel.addCar());
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
                break;
            default:
                System.out.println("Mistake!");
                break;
        }
    }
}
