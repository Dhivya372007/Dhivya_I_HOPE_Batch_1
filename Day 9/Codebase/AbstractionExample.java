abstract class Animal{
    void eat(){
        System.out.println("Eating...");
    }
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barks...");
    }
    void eat(){
        System.out.println("Dog is eating");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meows");
    } 
}
public class AbstractionExample {
    public static void main(String[] args) {
        Cat a=new Cat();
        a.sound();
        a.eat();   
    }
}
