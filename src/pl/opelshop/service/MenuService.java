package pl.opelshop.service;
import pl.opelshop.dto.CarDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuService {

    AdminPanelService adminpanel = new AdminPanelService();
    Scanner scanner = new Scanner(System.in);
    List<CarDto> carlist = new ArrayList<>();

    public void showMenu() {
        System.out.println("Select option.");
        System.out.println("1. Add car.");
        System.out.println("2. Show all the cars.");
        choiceSelector(scanner.nextInt());
        showMenu();
    }

   private void  choiceSelector(int choiceNumber) {
        switch(choiceNumber) {
            case 1:
                carlist.add(adminpanel.addCar());
                break;
            case 2:
                carlist.stream()
                        .forEach(carDtoInternal -> System.out.println(carDtoInternal.toString()));
                break;
            default:
                System.out.println("Mistake!");
                break;
        }
   }
}
