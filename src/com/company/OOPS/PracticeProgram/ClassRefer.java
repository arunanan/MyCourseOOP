package com.company.OOPS.PracticeProgram;

class ClassRefer
{
    int a = 1;
    int b = 2;

    ClassRefer func(ClassRefer obj)
    {
        ClassRefer obj3 = new ClassRefer();
        System.out.println("obj3 " + obj3.hashCode());
        int c = obj.a++;
        int d =  ++obj.a;
        System.out.println("c " + c + " d " + d);
        obj3 = obj;
        obj3.a = obj.a++ + ++obj.b;
        obj.b = obj.b;
        System.out.println("obj3 " +obj3.hashCode());
        return obj3;
    }

    public static void main(String[] args)
    {
        ClassRefer obj1 = new ClassRefer();
        ClassRefer obj2 = obj1.func(obj1);
        System.out.println("obj1 " +obj1.hashCode() + " obj2  " + obj2.hashCode());
        System.out.println("obj1.a = " + obj1.a + "  obj1.b = " + obj1.b);
        System.out.println("obj2.a = " + obj2.a + "  obj1.b = " + obj2.b);

    }
}
