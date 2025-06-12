package Day6;

class A {
    A() {
        System.out.println("A called");
    }
}

class B extends A{
    B() {
        System.out.println("B called");
    }

}
    public class oopsconcept {
    public static void main(String[] args) {
        new B();
    }
}
