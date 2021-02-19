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
