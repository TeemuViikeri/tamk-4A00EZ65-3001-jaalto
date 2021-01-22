// Write program with following classes:

// Program.java
// Book.java
// Bookshelf.java

// Requirements for the Book class:

// - constructor(), constructor(<all params>)
// - get(), set()
// - Book name
// - Authoer
// - ISBN
// - Published year
// - Publisher
// - print()

// Requirements for the Bookshelf class. The user can store N
// Book objects to the shelf. The size of shelf is defined by
// using constructor and cannot be changed during the lifetime
// of bookshelf.

// - constructor(N)    // N = the size of bookshelf
// - add(Book object)
// - remove(N)         // Remove index N from bookshelf. Mark unused.
// - print()           // Display books in shelf
// - count()           // Display used active slots (current used size)
// - size()            // Maximum size of shelf

public class Program {
    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf(8);

        Book narnia = new Book("The lion, the witch and the wardrobe", "C.S. Lewis", "978-0-00-711561-7", 2001, "HarperCollins Children's Books");
        Book hp = new Book("Harry Potter and the philosopher's stone", "J.K. Rowling", "0-7475-3274-5", 1997, "Bloomsbury");
        Book hobbit = new Book("The hobbit, or, there and back again", "J.R.R. Tolkein", "0-345-36858-4", 1990, "Eclipse");

        narnia.print();
        hp.print();
        hobbit.print();

        shelf.size();
        shelf.count();
        
        shelf.add(narnia);
        shelf.add(hp);
        shelf.add(hobbit);
        shelf.print();
        
        shelf.count();
        
        shelf.remove(1);
        shelf.print();
        
        shelf.count();
    }
}
