// 6.2 List and ArrayList collection

// NOTE: use "List... = new ArrayList"
// and not "Arraylist... = new ArrayList".

// Write a program that asks People's first names from the
// command line until string "END". The inputs are stored in
// List[1]

// - Store the inputs to the Java List collection type.
// - Display all user's inputs (Iterate) to the screen.

// Next:

// - Ask a string to search (case insensitive) and return
//     all postions that are found. End search mode on "QUIT"

// An example. Program reads[2] following values:

//     Jane
//     John
//     Peter
//     END

// Program displays:

//     1 Jane
//     2 John
//     3 Peter

// User searches for string (case insensitive).
// Ask the search string:

//     e

// Program displays records:

//     1 Jane
//     3 Peter

// [1]
// https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html
// https://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html
// http://docs.oracle.com/javase/tutorial/collections/implementations/list.html
// http://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
// http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
// http://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html
// http://stackoverflow.com/search?q=%5Bjava%5D+arraylist

// [2]
// * I/O from the Command Line
//     http://docs.oracle.com/javase/8/docs/api/java/io/Console.html
//     http://docs.oracle.com/javase/tutorial/essential/io/cl.html
// * I/O from the Command Line
//     http://stackoverflow.com/questions/4644415/java-how-to-get-input-from-system-console
// * Search stackoverflow
//     http://stackoverflow.com/search?q=[java]++get+user++input+scanner


public class Program {
    public static void main(String[] args) {
        NameStorage names = new NameStorage();
        UserInterface ui = new UserInterface(names);
        ui.start();
    }
}
