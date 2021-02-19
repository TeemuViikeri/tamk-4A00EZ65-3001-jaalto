public class Bookshelf {
    private int size;
    private Book[] books;
    private int count;
    private int slot;

    Bookshelf(int size) {
        this.size = size;
        books = new Book[size];
        count = 0;
        slot = 0;
    }

    void add(Book book) {
        books[slot++] = book;
        count++;
    }

    void remove(int index) {
        books[index] = null;
        slot = index;
        count--;
    }

    void print() {
        System.out.println(toString());
    }

    void count() {
        System.out.println(count);
    }

    void size() {
        System.out.println(size);
    }

    Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String str = "This bookshelf includes books:\n";
        String[] names = new String[size];
        int nameCount = 0;

        for (int i = 0; i < names.length; i++) {
            
            if (books[i] == null) {
                continue;
            }

            String name = books[i].getName();
            names[i] = name;
        }

        for (String name : names) {
            if (name != null) {
                str += "- " + name;
                nameCount++;

                if (nameCount != count) {
                    str += "\n";
                }
            }
        }

        return str;
    }
}
