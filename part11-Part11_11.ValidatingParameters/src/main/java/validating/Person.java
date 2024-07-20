package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null|| name.isEmpty() || name.isBlank() || name.length()> 40 || age<0 || age>120){
            throw new IllegalArgumentException("Name should not be empty and age shuold be between 0-120");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
