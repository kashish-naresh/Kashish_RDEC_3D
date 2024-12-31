class Animal {
    void walk() {
        System.out.println("Animal is walking");
    }
}

class Cat extends Animal {
    void walk() {
        System.out.println("Cat is walking");
    }
}

public class Demo {
    public static void main(String[] args) {
        // Cat c1 = new Cat();
        // c1.walk();
        Animal a1 = new Animal();
        Animal a2 = new Cat();
        a1.walk();
        a2.walk();
    }
}