package Day6;

class A {
    A() {
        System.out.println("A called");
    }
}

class B extends A {
    B() {
        System.out.println("B called");
    }

}
public class oops2 {
    A obj=new B();

}
