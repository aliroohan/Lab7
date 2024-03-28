package Task1;

public class Staff extends Person {
    private double pay;

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public Staff(String name, Address address, double pay) {
        super(name, address);
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + getName() + '\'' +
                ", address=" + getAddress() +
                ", pay=" + pay +
                '}';
    }
}

