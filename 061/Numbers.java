public class Numbers<N> {
    private N value;

    public Numbers(N value) {
        this.value = value;
    }

    public N get() {
        return value;
    }

    public void set(N value) {
        this.value = value;
    }
}
