
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if(bookName.isEmpty()){
                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRecommended = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookName, ageRecommended));


        }

        System.out.println(books.stream().count() + " books in total.\n");

        //Using comparator to sort books by thier age and name
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommended)
                .thenComparing(Book::getName);
        //Call Collections sort on books comparator
        Collections.sort(books, comparator);

        System.out.println("Books:");

        books.stream().forEach(book -> System.out.println(book.toString()));

    }

}
