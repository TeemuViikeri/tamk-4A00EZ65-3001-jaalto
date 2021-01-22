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

    @Override
    public boolean equals(Object obj) {
        // Check if you are comparing this object to itself
        if (obj == this) {
            return true;
        }

        // Check if the compared object is actually a Pen instance
        if (!(obj instanceof Pen)) {
            return false;
        }

        // Cast the compared instance variable to be this class' instance
        Pen o = (Pen) obj;

        // Is this instance's type (String) same as the compared objects type (String)?
        if (this.type.equals(o.type)) {
            return true;
        }

        // Return false by default if none of the previous steps return true
        return false;
    }
}
