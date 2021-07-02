package com.company.OOPS.PracticeProgram;

public class SuperSub {
    public static void main(String[] args) {
        A b = new B(1, 2);
        b.printA();
        B b1 = new B(3,2);

    }


}
/*interface suuper{
    protected int getDetails();  //retriction not applied in interface, bydefault all variable and methods are public
}*/

abstract class A{

    int x;
    static int y;

    public A(int x) {
        this.x = x;
    }

    void printA(){
        System.out.println("super A");
    }
    abstract void getA();

    private void dummy(){}
}

class B extends A{
    int z;
    public B(int x, int z) {
        super(x);
        this.z = z;
    }

    public B(){

        super(1);
       // this(1,2);
    }
    void printA(){
        System.out.println("Subclass B");
    }

    @Override
    void getA() {
        System.out.println("Subclass B - overrideGetA");
    }

}

/*
class C extends A{


    @Override
    void getA() {
        System.out.println("Subclass C");
    }
}*/
