interface A{
    void show();
}
interface B{
    void display();
}
class C implements A,B{
    public void show(){
        System.out.println("Welcome to java");
    }
    public void display(){
        System.out.println("Hello World");
    }
}

public class Interface {
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.display();
    }
}
