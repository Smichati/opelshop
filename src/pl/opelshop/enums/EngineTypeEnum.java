package pl.opelshop.enums;

public enum EngineTypeEnum {
    TSI("TSI"),
    TFSI("TFSI"),
    TDI("Diesel");

    private String fuelType;

    EngineTypeEnum(String fuelType) {
        this.fuelType = fuelType;
    }


}