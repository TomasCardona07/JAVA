package arraysObjetos;
import java.util.Scanner;
public class Book {
    String title;
    Book(String title){
        this.title = title;
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Book book1 = new Book("encantade");
        Book book2 = new Book("magic");
        Book book3 = new Book("knife");
        Book book4 = new Book("apple");
        Book books[] = {book1,book2,book3,book4};
        boolean book = false;
        System.out.println("Input title book");
        String userBook = src.next().toLowerCase();
        for (int i = 0; i < books.length; i++){
            if (userBook.equals(books[i].title)) {
                book = true;
                break;
            }
        }
        if (book ==  true) {
            System.out.println("The book is in the list");
        }
        else{
            System.out.println("The book is not in the list");
        }
        src.close();
    }
}