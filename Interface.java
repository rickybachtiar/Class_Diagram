interface Animal {
    void makeSound();
    void move();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public void move() {
        System.out.println("The dog runs.");
    }
}

class Bird implements Animal {
    public void makeSound() {
        System.out.println("Tweet Tweet");
    }

    public void move() {
        System.out.println("The bird flies.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.move();

        Animal bird = new Bird();
        bird.makeSound();
        bird.move();
    }
}
