public class IntegerDynamicStack implements Stackable {

    private int[] stack;
    private int size;
    private int used;

    public IntegerDynamicStack(int size) {
        this.stack = new int[size];
        this.size = size;
        this.used = 0;
    }

    @Override
    public void push(int value) {
        if (this.used == this.size) {
            stack = new int[++size];
        }

        stack[used++] = value;
    }

    @Override
    public int pop() {
        if (this.used == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        return stack[--used];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int used() {
        return this.used;
    }
}
