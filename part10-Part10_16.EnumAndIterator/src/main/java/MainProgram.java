
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here

        Person anna = new Person("Anna", Education.PHD);
        System.out.println(anna);

        System.out.println("\n-------------------------");

        Employees university = new Employees();
        // university.add(new Person("Petrus", Education.PHD));
        // university.add(new Person("Arto", Education.HS));
        // university.add(new Person("Elina", Education.PHD));

        Person h = new Person("Arto", Education.PHD);
        university.add(h);

        university.print();

        university.fire(Education.PHD);

        System.out.println("==");

        university.print();


    }
}
