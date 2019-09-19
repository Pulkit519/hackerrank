package book;

//import java.awt.print.Book;
import java.util.Scanner;
import book.Book;

    public class Main {
        public static void main(String[] args) {
            final Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine().trim();
            Book[] books = new Book[n];
            for (int i = 0; i < n; i++) {
                String bname = sc.nextLine().trim();
                String baname = sc.nextLine().trim();
                String isbn = sc.nextLine().trim();
                books[i] = new Book(bname, baname, isbn);
            }
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);
            }
            sc.close();
        }
    }

