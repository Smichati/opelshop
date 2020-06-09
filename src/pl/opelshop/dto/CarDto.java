package pl.opelshop.dto;


import pl.opelshop.enums.EngineTypeEnum;

import java.math.BigDecimal;
import java.util.List;

public class CarDto {

    private String producer;
    private String model;
    private BigDecimal engineVolume;
    private BigDecimal price;
    private EngineTypeEnum fuelType;
    private BigDecimal carYear;
    private BigDecimal averageBurning;


    public CarDto(String producer, String model, BigDecimal engineVolume, BigDecimal price, EngineTypeEnum fuelType, BigDecimal carYear, BigDecimal averageBurning) {
        this.producer = producer;
        this.model = model;
        this.engineVolume = engineVolume;
        this.price = price;
        this.fuelType = fuelType;
        this.carYear = carYear;
        this.averageBurning = averageBurning;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(BigDecimal engineVolume) {
        this.engineVolume = engineVolume;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal setPrice() {
        return price;
    }

    public EngineTypeEnum getFuelType() {
        return fuelType;
    }

    public void setFuelType(EngineTypeEnum fuelType) {
        this.fuelType = fuelType;
    }

    public BigDecimal getCarYear() {
        return carYear;
    }

    public void setCarYear(BigDecimal carYear) {
        this.carYear = carYear;
    }

    public BigDecimal getAverageBurning() {
        return averageBurning;
    }

    public void setAverageBurning(BigDecimal averageBurning) {
        this.averageBurning = averageBurning;
    }


    @Override
    public String toString() {
        return "CarDto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", price=" + price +
                ", fuelType=" + fuelType +
                ", carYear=" + carYear +
                ", averageBurning=" + averageBurning + "l/100km" +
                '}';
    }
    public void showCombinedPrice(List<CarDto> carlist) {
        for (CarDto combinedPriceResult : carlist) {
            for ()


        }
    }
}
