import java.util.ArrayList;
import java.util.Iterator;

// 6.3 List Performance

// ArrayListPerformance.java - Write program to compare
// the 3 ways to iterate over ArrayList as explained in
// the Lectures. Test performance of each by timing the
// time spent during iteration over the entire
// collection with:

//     long System.currentTimeMillis()

// Use 10 000 strings as a test case:

//     ArrayList<String> list = new ArrayList<String>();

//     for (int i = 0; i < 100_0000; i++) {
//        list.add(String.valueOf(i));
//     }

// Test cases:

//     1. simple for-i loop
//     2. for-each loop
//     3. Iterator loop

// Which one is the fastest and how much slower (X times) was
// the worst one?

public class Program {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // For-i loop
        long startForI = System.currentTimeMillis();

        for (int i = 0; i < 10_000; i++) {
            list.add(String.valueOf(i));
        }

        long endForI = System.currentTimeMillis();
        System.out.println(endForI);

        System.out.println("For-i loop took: " + ((endForI - startForI)));

        // For-each loop
        ArrayList<String> list2 = new ArrayList<String>();
        long startForEach = System.currentTimeMillis();

        for (String string : list) {
            list2.add(string);
        }

        long endForEach = System.currentTimeMillis();
        System.out.println("For-each loop took: " + ((endForEach - startForEach)));

        // Iterator loop
        ArrayList<String> list3 = new ArrayList<String>();
        Iterator<String> iterator = list.iterator();
        long startIterator = System.currentTimeMillis();

        while (iterator.hasNext()) {
            list3.add(iterator.next());
        }

        long endIterator = System.currentTimeMillis();
        System.out.println("Iterator took: " + ((endIterator - startIterator)));

        // Most of the time Iterator was the fastest one to iterate over ArrayList.
        // Iterator was about 1.5 to 3 times faster that for-i loop which usually took
        // the longest time to iterate.
    }
}
