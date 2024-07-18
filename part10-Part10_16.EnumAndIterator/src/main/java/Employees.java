import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {

    private List<Person> employees;


    public Employees(){
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd){
        this.employees.add(personToAdd);

    }

    public void add(List<Person> peopleToAdd){
        for(Person person: peopleToAdd){
            add(person);
        }

    }

    public void print(){
        //Use Iterator Class to iterate of type person to iterate a list of employees
        Iterator<Person> iterator = employees.iterator();

        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            System.out.println(nextPerson);
        }

        // for(Person person: employees){
        //     System.out.println(person);
        // }
    }

    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();

        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation().equals(education)){
                System.out.println(nextPerson);
            }
        }
        
        // employees.stream()
        //     .filter(person -> person.getEducation().equals(education))
        //     .forEach(person -> System.out.println(person));
    }


    /*
    If you want to remove some of the objects from the list during a traversal, you can do so using an iterator.
    Calling the remove method of the iterator object neatly removes form the list the item returned by the iterator with the previous next call. 
    Here's a working example of the version of the method:

    // removing from the list the element returned by the previous next-method call
    iterator.remove();

     */
    public void fire(Education education){

        Iterator<Person> iterator = employees.iterator();

        while(iterator.hasNext()){
            Person nexPerson = iterator.next();
            if(nexPerson.getEducation().equals(education)){
                iterator.remove();
            }
        }
        // for(Person person: employees){
        //     if(person.getEducation().equals(education)){
        //         employees.remove(person);
        //     }
        // }
    }
}
