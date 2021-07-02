package com.company.OOPS;

//When a subclass constructor calls the superclass constructor, this phenomenon is known as constructor chaining
//When an object of the subclass is created it contains the superclass variables but it doesn’t create any superclass object in it.

//Diamond problem :
/*Java doesn’t support multiple inheritance because, consider a scenario where A, B and C are three classes.
        The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object,
        there will be ambiguity to call the method of A or B class.*/

//When a class inherits from another class, the private members of the class are not inherited by any of
// its subclasses as they are accessible only from within the class.


//Inheritance vs composition:
/*When classes don't have "is-a" relation ship. i,e; not a similar kind of classes where they could share their variables and methods.
        In that case we can use composition.
        for example : home and family classes.
        here all family members are connected through inheritance.
        And home has "has-a" relationship with family.

        Suggested Answer
        Use inheritance only when the subclass is a proper subtype of the superclass. For example, ResearchStudent is a type of Student;
        hence, ResearchStudent will have an is-a relationship with the Student class.
        If some methods in the superclass are necessary, mandatory, or can be reused for its subclasses, use inheritance.
        On the other hand, use composition when you wish to use only some of the functionalities or characteristics of the class that
        you are creating a has-a relationship for. In the case of a Student class and a BankAccount class,
        you can say that a Student has-a Bank Account; hence, the has-a relationship holds true here.*/

/*Some reasons to use composition over inheritance are:

        One reason for favouring Composition over Inheritance in Java is fact that Java doesn't support multiple inheritance.

        Though both Composition and Inheritance allows you to reuse code, one of the disadvantages of Inheritance is that it breaks encapsulation.
        If the subclass is depending on superclass behaviour for its operation, it suddenly becomes fragile. When the behaviour of superclass changes,
        functionality in the subclass may get broken, without any change on its part.

        Composition offers better test-ability of a class than Inheritance. If one class is composed of another class, you can easily create a Mock Object
         representing the composed class for sake of testing.

        Like, There are many more reasons to favour Composition over inheritance*/
class Superclass
{
    private int a;
    public Superclass()
    {
        System.out.println("This is Super class constructor");

        System.out.println(this.getClass().getName() + "  " +
                super.getClass().getName()); // superclass object is not created hence this will be print "Subclass"
    }

    public Superclass(int a)
    {
        this.a =a;
        System.out.println("This is Super class constructor");

        System.out.println(this.getClass().getName() + "  " +
                super.getClass().getName()); // superclass object is not created hence this will be print "Subclass"
    }
}

class Subclass extends Superclass
{
    public Subclass()
    {
        //super() must be invoked "explicitly" on first statement inside contractor, else compilation error will be thrown
        // Only default contractor in superclass :   default superclass constructor will be called automatically , need not to be called explicitly

        // Default + parametrized constructor in super class : default superclass constructor will be called automatically,
            // if parameterized need to be called explicitly.

        // only parametrized constructor in super class : Need to be called explicitly ( mandatory) , otherwise error will be thrown
            //ERROR : "There is no default constructor available in 'com.company.OOPS.Superclass'"
        System.out.println("This is Subclass constructor");

        System.out.println(this.getClass().getName() + "  " +
                super.getClass().getName());
    }
}

public class Inheritance
{
    public static void main(String[] args) {

        Subclass Object
                = new Subclass();
    }
}

