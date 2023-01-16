package CarShopExtend;

public class CarImpl{

    private static final int TIRES = 4;

    private String model;
    private String color;
    private int horssePower;
    private String countryProduced;

    public CarImpl(String model, String color, int horssePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horssePower = horssePower;
        this.countryProduced = countryProduced;
    }


    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }


    public int getHorsePower() {
        return horssePower;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                model, countryProduced, TIRES);
    }
}
