
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work hereHerd herd = new Herd();
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();

        Cat cat = new Cat();
        cat.purr();
        cat.eat();
        
        Cat garfield = new Cat("Garfield");
        garfield.purr();

        NoiseCapable dog2 = new Dog();
        dog2.makeNoise();
        
        NoiseCapable cat2 = new Cat("Garfield");
        cat2.makeNoise();
        Cat c = (Cat) cat2;
        c.purr();

    }

}
