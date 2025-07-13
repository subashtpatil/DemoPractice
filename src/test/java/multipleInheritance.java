
interface AnimalEat {
    void eat();
}
interface AnimalSound {
    void sound();
}

 class Dog implements AnimalEat, AnimalSound {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void sound() {
        System.out.println("Dog says bow wow");
    }
}
public class multipleInheritance {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.eat();
        dog.sound();
    }
}