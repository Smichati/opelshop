package pl.opelshop.service;

import pl.opelshop.dto.CarDto;
import pl.opelshop.enums.EngineTypeEnum;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;
import java.util.Scanner;

public class CarOperationsService {
    Scanner scanner = new Scanner(System.in);

    public CarDto addCar() {
        System.out.println("Type a producent.");
        String producer = scanner.next();
        System.out.println("Type a model.");
        String model = scanner.next();
        System.out.println("Type a volume in liters of engine.");
        BigDecimal engineVolume = scanner.nextBigDecimal();
        System.out.println("Type a price of car.");
        BigDecimal price = scanner.nextBigDecimal();
        System.out.println("Type a type of engine which you wanna have.");
        String fuelType = scanner.next();
        EngineTypeEnum engine = EngineTypeEnum.valueOf(fuelType);
        System.out.println("Type a year of car.");
        BigDecimal carYear = scanner.nextBigDecimal();
        System.out.println("Type an average burning in liters for 100km of car.");
        BigDecimal averageBurning = scanner.nextBigDecimal();
        return new CarDto(producer, model, engineVolume, price.round(new MathContext(2, RoundingMode.HALF_UP)), engine, carYear, averageBurning);
    }

    //test comment
    public void getAverageBurning(List<CarDto> carlist) {
        System.out.println("Type a model");
        String model = scanner.next();
        System.out.println("Type a distance covered by the chosen car.");
        BigDecimal distance = scanner.nextBigDecimal();
        for (int i = 0; i < carlist.size(); i++) {
            if (carlist.get(i).getModel().equals(model)) {
                System.out.println(carlist.get(i).getAverageBurning().multiply(distance).divide(new BigDecimal(100)));
            }
        }
    }
}
