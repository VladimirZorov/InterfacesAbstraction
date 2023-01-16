package CarShopExtend;

public class CarImpl implements Car{

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

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public int getHorsePower() {
        return 0;
    }

    @Override
    public String countryProduced() {
        return null;
    }

    @Override
    public String toString() {
        return "CarImpl{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", horssePower=" + horssePower +
                ", countryProduced='" + countryProduced + '\'' +
                '}';
    }
}
