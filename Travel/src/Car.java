public class Car extends Vehicle{
    private String Type;

    public String getType() {
        return Type;
    }


    public void setType(String Type) {
        this.Type = Type;
    }


    public void go(Address dest){
        System.out.println(Type+"一路加着速，疾驰至"+dest.getAddressName());
    }

}
