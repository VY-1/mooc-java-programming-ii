
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 Add the method public static List<Book> readBooks(String file) for the class BooksFromFile. It should read the file given as the parameter and forms book data from it.

The exercise template contains the class Book, which is used for describing a book. You should presume that the book files are in the following format:

name,publishing year,page count,author

The name and the author of the book are processed as strings, and the publishing year and the page count are processed as integers. Example of contents of a book file:

Do Androids Dream of Electric Sheep?,1968,210,Philip K. Dick
Love in the Time of Cholera,1985,348,Gabriel Garcia Marquez
 */
public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        //String representation to to file location
        String fileLocation = "./src/main/java/books.txt";


        //reading each book and print out using default methods
        for(Book book: readBooks(fileLocation)){
            System.out.println("Title: " + book.getName() + ", Year Published: " + book.getPublishingYear() + ", Page Count: " + book.getPagecount() + ", Author: " + book.getAuthor());
        }


    }

    public static List<Book> readBooks(String file){
        //List<Book> books = new ArrayList<>();

        // try{
        //     Files.lines(Paths.get(file))
        //                 .map(row -> row.split(","))
        //                 .filter(parts -> parts.length >= 4)
        //                 .map(parts -> new Book(parts[0], Integer.parseInt(parts[1].trim()), Integer.parseInt(parts[2].trim()), parts[3]))
        //                 .forEach(book -> books.add(book));
        //     return books;

        // }
        try {
            return Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                    .collect(Collectors.toList());
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        return new ArrayList<>();

    }

}
