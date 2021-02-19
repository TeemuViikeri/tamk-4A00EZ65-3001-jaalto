public class IntegerFixedStack implements Stackable {
    
    private int[] stack;
    private int size;
    private int used;
    
    public IntegerFixedStack(int size) {
        this.stack = new int[size];
        this.size = size;
        this.used = 0;
    }
    
    @Override
    public void push(int value) throws IllegalArgumentException {
        if (this.used == this.size) {
            throw new IllegalArgumentException("Array is already full.");
        }

        this.stack[used++] = value;
    }

    @Override
    public int pop() throws IllegalArgumentException {
        if (this.used == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        return this.stack[--used];
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
