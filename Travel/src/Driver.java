public class Driver {
    private String DriverName;

    public String getDriverName() {
        return DriverName;
    }


    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public void driver(Vehicle v,Address dest){
        System.out.print(DriverName+"驾驶着");
        v.go(dest);
    }
}
