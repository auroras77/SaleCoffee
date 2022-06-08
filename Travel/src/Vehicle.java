public abstract class Vehicle {
    private String Type;

    public String getType() {
        return Type;
    }


    public void setType(String Type) {
        this.Type = Type;
    }


    public abstract void go(Address dest);

}
