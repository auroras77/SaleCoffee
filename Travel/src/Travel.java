public class Travel {
    public static void main(String[] args) {
        Driver d = new Driver();
        d.setDriverName("老张");
        Vehicle c = new Car();
        c.setType("法拉利");
        d.driver(c, new Address("东北"));

        d.setDriverName("老李");
        Vehicle p = new Plane();
        p.setType("战斗机");
        d.driver(p, new Address("美国"));
    }
    }
