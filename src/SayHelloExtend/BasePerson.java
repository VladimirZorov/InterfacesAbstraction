package SayHelloExtend;

public abstract class BasePerson implements Person{

   private String name;

    public BasePerson(String name) {
        this.setName();
    }

    public void setName() {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
