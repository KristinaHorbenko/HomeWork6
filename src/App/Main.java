package App;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Марс");
        cat.run(203);
        cat.swim(2);
        System.out.println();

        Cat cat1 = new Cat("Мурка");
        cat1.run(200);

        System.out.println();

        Dog dog = new Dog("Боб");
        dog.run(501);
        dog.swim(11);

        System.out.println();

        Dog dog1 = new Dog("Шарко");
        dog1.run(500);
        dog1.swim(10);
        System.out.println();

        Duck duck = new Duck("Кря");
        duck.run(12);
        duck.swim(5);

        System.out.println();
        System.out.println("Усього котів створено: " + Cat.getCount());
        System.out.println();
        System.out.println("Усього собак створено: " + Dog.getCount());
        System.out.println();
        System.out.println("Усього тварин створено: " + Duck.getCount());

    }
}





