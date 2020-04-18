package pl.opelshop.service;

import pl.opelshop.dto.CarDto;
import pl.opelshop.enums.EngineTypeEnum;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class AdminPanelService {

    public CarDto addCar() {
        System.out.println("Type a producent.");
        Scanner scanner = new Scanner(System.in);
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
        BigDecimal avgBurning = scanner.nextBigDecimal();
        return new CarDto(producer, model, engineVolume, price.round(new MathContext(2, RoundingMode.HALF_UP)), engine, carYear, avgBurning);
    }
    //test comment
}
