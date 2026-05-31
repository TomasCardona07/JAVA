package relaciones.book_library;

public class Library {
    String name;
    Book book;
    Library(String name, Book book){
        this.name = name;
        this.book = book;
    }
    void showBook(){
        System.out.println("Library: " + name);
        System.out.println("Book: " + book.title);
        System.out.println("Pages: " + book.pages);
    }
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 464);
        Library library1 = new Library("Central library", book1);
        library1.showBook();
        
    }
}
