

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*
     *The exercise template includes the class Student, which has a name. Implement the Comparable interface in the Student class in a way, 
     such that the compareTo method sorts the students in alphabetical order based on their names.

    The name of the Student is a String, which implements Comparable itself. You may use its compareTo method when implementing the method for the Student class. 
    Note that String.compareTo() also treats letters according to their size, while the compareToIgnoreCase method of the same class ignores the capitalization completely. 
    You may use either of these methods in the exercise.
     */
    @Override
    public int compareTo(Student student){
        // if(this.name.equals(student.name)){
        //     return 0;
        // }
        // else if(this.name.compareToIgnoreCase(student.name) > 1){
        //     return 1;
        // }
        // else{
        //     return -1;
        // }

        return this.getName().compareToIgnoreCase(student.getName());

    }

    @Override
    public String toString() {
        return name;
    }

}
