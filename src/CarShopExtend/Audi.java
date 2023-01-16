package CarShopExtend;

public class Audi extends CarImpl{

    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, int horsePower, String countryProduced,
                Integer minRentDay, Double pricePerDay) {
       super(model, color, horsePower,countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }



    @Override
    public String toString() {
        return String.format("%s%nMinimum rental period of %d days. Price per day %.6f"
                ,super.toString(), minRentDay, pricePerDay);
    }
}
