package lectures.book;

public class BookTester{
    public static void main(String[] args) {
        Book b1 = new Book("Java programming", "Lewis & loftus", "Pearson", 2004);
        Book b2 = new Book("Gone with the wind", "Margaret Mitchell", "Amazon", 1960);
        
        System.out.println(b1 + "\n");
        System.out.println(b2 + "\n");


    }
}