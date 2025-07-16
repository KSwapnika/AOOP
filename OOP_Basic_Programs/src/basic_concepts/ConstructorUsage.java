package basic_concepts;

class Book {
    String title;
    int pages;

    // Constructor
    Book(String t, int p) {
        title = t;
        pages = p;
    }

    void show() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }
}

public class ConstructorUsage {
	    public static void main(String[] args) {
	        Book b1 = new Book("Java Basics", 250);
	        b1.show();
	    }
}

