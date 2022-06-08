public class Plane extends Vehicle {
    private String Type;

    public String getType() {
        return Type;
    }


    public void setType(String Type) {
        this.Type = Type;
    }


    public void go(Address dest) {
        System.out.println(Type + "一路转着螺旋桨，翱翔至" + dest.getAddressName());

    }
}
