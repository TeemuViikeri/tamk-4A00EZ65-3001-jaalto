// 3.1 Date and Time - inheritance, exceptions

// INHERITANCE, CONTRUSTORS + SUPER()
// ----------------------------------

// Write a program which displays date in ISO 8601 format
// (YYYY-MM-DD HH:MM:SS). Write your own classes:

//     Time.java -  hours, minutes and seconds.
//     Date.java -  years, months, dates. *Inherits* Time class.

// Provide constructors for both classes and remember to
// call super() in the derived *Date* class to pass
// initial hour, minute and second values to it. An
// example:

//     // Initializes time to 2015-01-20 12:00:00
//     Date date = new Date(2015, 1, 20, 12, 0, 0);

// Provide common toString()[1] method that returns
// object's data as a String. It will be called in
// contexts requiring strings, like in displaying
// variables:

//     // Displays: Time is 2015-01-20 12:00:00
//     System.out.println("Time is " + date);

// Tip: use String.format() to return strings that have
// leading zeroes. This works the same as to
// printf()[1][2] in previous exercises. See
// java.util.formatter[3] for full details.

// [1] http://cante.net/~jaalto/course/java-common/work/example/DemoPrintf.java
// [2] http://docs.oracle.com/javase/tutorial/java/data/numberformat.html
// [3] http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax

public class Program {
    public static void main(String[] args) {
        Time t = new Time(12, 0, 30);
        System.out.println(t);

        Date d = new Date(2021, 1, 22, 12, 0, 0);
        System.out.println(d);
    }
}
