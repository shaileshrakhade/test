package polymorphism;

public class Demo {
    public static void main(String[] args) {

        Pat d = (Pat) new Dog();

        if (d != null)
        {
            d.sleep();
        }
    }
}
