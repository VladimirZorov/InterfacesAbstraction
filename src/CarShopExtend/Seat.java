package CarShopExtend;

public class Seat extends CarImpl{

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(
                "%s%n%s sells for %.6f",super.toString(),getModel(), price);
    }
}
