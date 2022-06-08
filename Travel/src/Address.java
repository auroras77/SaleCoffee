public class Address {
    private String addressName;


    Address(){

    }

    Address(String dest){
        this.setAddressName(dest);
    }

    public String getAddressName() {
        return addressName;
    }


    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

}
