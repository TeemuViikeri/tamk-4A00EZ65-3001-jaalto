// 6.1 Generics

// GenericsNumbersExampleSimple.java - Write a Generics[1] class
// that can be ued in the following way:

//     Numbers<Integer> a = new Numbers<>(new Integer(1));
//     Numbers<Integer> b = new Numbers<>(new Integer(2));

//     one.set(new Integer(3));    // Change value
//     Integer val = one.get();    // Current value. NOTE type Integer

//     System.out.println(val);    // No need for toString(), Java knows Integer

// [1] http://docs.oracle.com/javase/tutorial/java/generics/index.html

public class Program {
    public static void main(String[] args) {
        Numbers<Integer> a = new Numbers<>(1);
        Numbers<Integer> b = new Numbers<>(2);

        a.set(3);
        Integer val1 = a.get();
        System.out.println(val1);
        
        b.set(1);
        Integer val2 = b.get();
        System.out.println(val2);
    }
}
