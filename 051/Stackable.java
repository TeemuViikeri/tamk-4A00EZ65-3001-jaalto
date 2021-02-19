public interface Stackable {
    void push(int value);   // throws IllegalArgumentException on error
    int pop();              // throws IllegalArgumentException on error
    int size();             // maximum size
    int used();             // how many slots of size(), are in use
}
