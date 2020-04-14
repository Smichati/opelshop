package pl.opelshop.service;

import pl.opelshop.dto.CarDto;
import java.util.Scanner;

public class AdminPanelService {

    public CarDto addCar() {
        System.out.println("Type a producent.");
        Scanner scanner = new Scanner(System.in);
        String producer = scanner.next();
        System.out.println("Type a model.");
        String model = scanner.next();
        return new CarDto(producer, model);
    }
    //test comment
}
