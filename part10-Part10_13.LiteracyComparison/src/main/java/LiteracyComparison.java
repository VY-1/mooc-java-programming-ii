
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        String fileLocation = "literacy.csv";


        for(String literacy: readFile(fileLocation)){
            System.out.println(literacy);
        }



    }

    /*
     *This exercise uses open data about literacy levels, provided by UNESCO. The data includes statistics of estimated or reported levels of literacy for various countries for the past two years. File literacy.csv, included with the exercise template, includes the literacy estimates for women and men over 15 years of age. Each line in the file literacy.csv is as follows: "theme, age group, gender, country, year, literacy percent. Below are the first five lines as an example.

    Adult literacy rate, population 15+ years, female (%),United Republic of Tanzania,2015,76.08978
    Adult literacy rate, population 15+ years, female (%),Zimbabwe,2015,85.28513
    Adult literacy rate, population 15+ years, male (%),Honduras,2014,87.39595
    Adult literacy rate, population 15+ years, male (%),Honduras,2015,88.32135
    Adult literacy rate, population 15+ years, male (%),Angola,2014,82.15105

    Create a program that first reads the file literacy.csv and then prints the contents from the lowest to the highest ranked on the literacy rate. The output must be exactly as in the following example. The example shows the first five of the expected rows.

    Sample output
    Niger (2015), female, 11.01572
    Mali (2015), female, 22.19578
    Guinea (2015), female, 22.87104
    Afghanistan (2015), female, 23.87385
    Central African Republic (2015), female, 24.35549
     */
    public static List<String> readFile(String file){
        try{
            return Files.lines(Paths.get(file))
                .map(row -> row.split(","))
                .sorted((p1, p2) ->{ return p1[5].compareTo(p2[5]); })
                .map(row -> row[3].trim() +" (" + row[4].trim() + "), " + row[2].replace("(%)", "").trim() + ", " + row[5].trim())
                .collect(Collectors.toList());

        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

        return new ArrayList<>();
    }
}
