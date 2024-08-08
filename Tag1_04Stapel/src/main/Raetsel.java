package main;
public class Raetsel {
    public static void main(String[] args) {
        new B();
        new B();
    }
}
class A {
    static {
        System.out.println("A");
    }
    public A() {
        System.out.println("b");
        foo();
    }
    public void foo() {
        System.out.println("foo von a");
    }
}
class B extends A {
    public B() {
        System.out.println("c");
    }
    public void foo() {
        System.out.println("foo von b");
    }
}
