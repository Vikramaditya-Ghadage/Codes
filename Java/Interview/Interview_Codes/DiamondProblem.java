package Interview.Interview_Codes;

interface Interface1 {
    default void show() {
        System.out.println("Interface1");
    }
}

interface Interface2 {
    default void show() {
        System.out.println("Interface2");
    }
}

class DiamondProblem implements Interface1, Interface2 {
    @Override
    public void show() {   // we need to implement this method other wise give error
        Interface1.super.show();  // or  Interface2.super.show();
        System.out.println("MyClass");
    }
}

