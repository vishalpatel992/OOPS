public class Polymorphism {
    public static void main(String args[])
    {
        Person p1= new Person("Vishal");
        
        //this is polymorphism i.e. more than one form
        // there are two methods with same name but with different parameters
        //this is compile time polymorphism
        p1.walk();
        p1.walk(5);
        
        Developer d1= new Developer("Vishal");
        //this is runtime polymorphism
        // walk method is present is both parent and child class
        //if it was not present in the child class then it would have called parent class's walk() method
        //but it is present in the child class itself then it will call child class's walk() method
        d1.walk();
        d1.walk(5);
        
        Developer d2= new Developer("rock");
        d2.walk(10, 50);


        // more than one form
        Animal a;
        a= new Animal();
        a.whoAmI();

        a= new Dog();
        a.whoAmI();

        a= new Cat();
        a.whoAmI();

    }
}

class Person
{
    String name;

    public Person(String name)
    {
        this.name= name;
    }

    public void walk()
    {
        System.out.println(name + " is walking");
    }

    public void walk(int steps)
    {
        System.out.println(name +" has walked "+ steps+" steps");
    }
}

class Developer extends Person
{

    public Developer(String name)
    {
        super(name);
    }

    public void walk(int steps, int speed)
    {
        System.out.println("Developer " + name + " is walking " + steps + " steps with speed "+ speed);
    }
}


// Best example of Polymorphism
class Animal
{
    public void whoAmI()
    {
        System.out.println("I am an Animal");
    }
}

class Dog extends Animal
{
    public void whoAmI()
    {
        System.out.println("I am a Dog");
    }
}

class Cat extends Animal
{
    public void whoAmI()
    {
        System.out.println("I am a Cat");
    }
}
