import java.util.ArrayList;

public class Main {

    //Write a method public static void printPersons(ArrayList<Person> persons) in the Main class. 
    //The method prints all the persons on the list given as the parameter. Method must act as follows when invoked from the main method
    public static void printPersons(ArrayList<Person> persons){
      for(Person person: persons){
        System.out.println(person);

      }
    }

    public static void main(String[] args) {
        // write your test code here
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        System.out.println("\n---------------------");

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());

        System.out.println("\n---------------------");

        //Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);

        System.out.println("\n---------------------");

        Teacher adaT = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher eskoT = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(adaT);
        System.out.println(eskoT);
        
        //Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        
        int i = 0;
        while (i < 25) {
          ollie.study();
          i = i + 1;
        }
        System.out.println(ollie);

        System.out.println("\n---------------------");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
    
        printPersons(persons);
        
    }

}
