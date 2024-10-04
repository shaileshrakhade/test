public class Singleton {

    private static final Singleton singleton = new Singleton();

    //make default constructor to private so no object will create
    private Singleton() {}

    //to use this object we can use this method & this method return the same instance/object
    public static Singleton getInstance() {
        return singleton;
    }

    void print() {
        System.out.println("Singleton");
    }

}

class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        singleton.print();

    }
}