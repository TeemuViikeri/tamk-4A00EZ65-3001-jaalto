public class Pen {
    private String type;
    
    String getType() {
        return this.type;
    }

    void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getType();
    }
}
