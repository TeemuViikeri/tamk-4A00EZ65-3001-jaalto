public abstract class Building {
    protected String address;

    void address() {
        System.out.println(this.getAddress());
    }

    String getAddress() {
        return this.address;
    }

    void setAddress(String address) {
        this.address = address;
    }
}
