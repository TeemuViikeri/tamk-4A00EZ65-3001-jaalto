public abstract class Building {
    private String address;
    private double area;

    void address() {
        System.out.println(this.getAddress());
    }

    String getAddress() {
        return this.address;
    }
    
    void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return this.area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
}
