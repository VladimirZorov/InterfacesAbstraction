package BorderControl;

public class Robot implements Interface{

    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getId() {
        return id;
    }
}
