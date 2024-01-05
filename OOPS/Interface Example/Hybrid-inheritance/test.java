class Animal {
    public void eat() {
        System.out.println("Animals eat");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dogs bark");
    }
}


class Cat extends Animal {
    public void meow() {
        System.out.println("Cats meow");
    }
}

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}