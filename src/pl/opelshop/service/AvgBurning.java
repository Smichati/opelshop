package pl.opelshop.service;

import java.math.BigDecimal;
import java.util.Scanner;

public class AvgBurning {
    BigDecimal hundred = new BigDecimal(100);

    private BigDecimal distance;
    private BigDecimal fuelTanked;

    public AvgBurning() {
        this.distance = distance;
        this.fuelTanked = fuelTanked;
    }

    MenuService menu = new MenuService();

    Scanner scanner = new Scanner(System.in);

    public void addCarABM() {
        System.out.println("1. Add car again.");
        System.out.println("2. Return to the MenuService.");
        avgBurningChoiceSelector(scanner.nextInt());
        addCarABM();
    }

    private void avgBurningChoiceSelector(int avgBurningChoiceNumber) {
        switch (avgBurningChoiceNumber) {
            case 1:
                System.out.println("Type a car producer and a car");
                String producer, model = scanner.next();
                System.out.println("Type a distance covered by the chosen car.");
                BigDecimal distance = scanner.nextBigDecimal();
                System.out.println("Type a volume in liters of fuel tanked to the car.");
                BigDecimal fuelTanked = scanner.nextBigDecimal();
                System.out.println("The car will burn for 100km " + avdBurningOnChosenDistance() + "liters.");
                break;
            case 2:
                menu.showMenu();
                break;
        }
    }

    public BigDecimal avdBurningOnChosenDistance() {
        return hundred.multiply(distance.divide(fuelTanked));
    }
}

