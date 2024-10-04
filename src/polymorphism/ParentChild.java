package polymorphism;

public class ParentChild {
    public static void main(String[] args) {

        A a = new C();
        a.print();
    }

}
class C implements B{
    @Override
    public void print() {
        System.out.println(i);
    }
}

interface A {
    int i = 10;
    void print();
}

interface B extends A {
    int i = 20;
}
