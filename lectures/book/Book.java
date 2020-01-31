package lectures.book;

public class Book {

    String title, author, publisher;
    int copyright;

    // Constructor

    public Book(String myTitle, String auth, String pub, int copyR) {
        title = myTitle;
        author = auth;
        publisher = pub;
        copyright = copyR;
    }

public String toString(){
    return "Title: " + title + 
    "\nAuthor: " + author + 
    "\nPublisher: " + publisher + 
    "\nCopyright " + copyright;
}

}